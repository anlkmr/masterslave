# Use an official Ubuntu runtime as a parent image
FROM ubuntu:latest
LABEL "Project"="masterslave"
LABEL "Author"="Anil"
# Install necessary dependencies
RUN apt-get update -y && apt-get install -y \
    git \
    openjdk-17-jdk
RUN apt-get install maven -y

# Set the working directory
WORKDIR /app

# Clone the Spring Boot project from your Git repository
RUN git clone https://github.com/anlkmr/masterslave.git .

# Build the project
#RUN ./mvnw package
RUN mvn clean install

# Expose the port your Spring Boot application will run on
EXPOSE 8090

ADD target/masterslavev1.jar masterslavev1.jar
ENTRYPOINT ["java","-jar","masterslavev1.jar"]