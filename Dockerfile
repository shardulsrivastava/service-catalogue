FROM openjdk:17-jdk-alpine
COPY out/artifacts/infra_jar/infra.jar infra.jar
ENTRYPOINT ["java","-jar","/infra.jar"]