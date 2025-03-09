FROM openjdk:17-oracle
LABEL authors="DiepKyQuang"
COPY target/user_service-0.0.1-SNAPSHOT.jar user_service-0.0.1-SNAPSHOT.jar
EXPOSE 8001
ENTRYPOINT ["java", "-jar", "user_service-0.0.1-SNAPSHOT.jar"]