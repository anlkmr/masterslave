FROM tomcat:10-jre17
LABEL "Project"="masterslave"
LABEL "Author"="Anil"

RUN apt update && apt install openjdk-17-openjdk -y && apt install maven -y
RUN git clone -b master https://github.com/anlkmr/masterslave.git && cd masterslave && mvn install
RUN rm -rf /usr/local/tomcat/webapps/*
COPY target/masterSlavev1.jar /usr/local/tomcat/webapps/ROOT.jar


#WORKDIR /usr/src/app/

EXPOSE 9000
CMD ["catalina.sh","run"]
WORKDIR /usr/local/tomcat/.
#ENTRYPOINT ["java","-jar","book-work-0.0.1.jar"]
# Test
