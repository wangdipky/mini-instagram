FROM openjdk:17-oracle
LABEL authors="DiepKyQuang"
COPY target/discovery_server-0.0.1-SNAPSHOT.jar discovery_server-0.0.1-SNAPSHOT.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "discovery_server-0.0.1-SNAPSHOT.jar"]