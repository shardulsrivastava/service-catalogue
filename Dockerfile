FROM openjdk:17-jdk-alpine
COPY target/service-catalogue-1.0.jar service-catalogue-1.0.jar
ENTRYPOINT ["java","-jar","/service-catalogue-1.0.jar"]