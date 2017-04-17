FROM openjdk:alpine
COPY target/sa-spring-1.0-SNAPSHOT.jar /opt/sa-spring/
WORKDIR /opt/sa-spring
EXPOSE 8080
CMD ["java", "-jar", "sa-spring-1.0-SNAPSHOT.jar"]
