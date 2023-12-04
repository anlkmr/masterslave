FROM openjdk:17-ea-3-jdk AS BUILD_IMAGE
FROM ubuntu:latest
WORKDIR /project
ADD pom.xml /project
RUN apt-get update
#RUN apt-get upgrade
RUN apt-get install maven -y
RUN mvn -version
RUN mvn verify --fail-never
COPY . .
RUN mvn package

FROM openjdk:17-ea-3-jdk

#WORKDIR /usr/src/app/
COPY --from=BUILD_IMAGE /project/target/book-work-0.0.1-SNAPSHOT.jar book-work-0.0.1.jar

EXPOSE 9000
ENTRYPOINT ["java","-jar","book-work-0.0.1.jar"]
# Test
