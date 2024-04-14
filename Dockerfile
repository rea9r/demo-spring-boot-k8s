FROM amazoncorretto:17.0.10-alpine3.19
COPY build/libs/demo-spring-boot-k8s-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]
