FROM openjdk:17-jdk-alpine
COPY target/service-catalogue-1.0.jar service-catalogue-1.0.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/service-catalogue-1.0.jar"]