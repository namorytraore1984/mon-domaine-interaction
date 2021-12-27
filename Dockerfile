FROM openjdk:11
EXPOSE 9090
ADD build/libs/mon-domaine-interaction-0.0.1-SNAPSHOT.jar mon-domaine-interaction-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/mon-domaine-interaction-0.0.1-SNAPSHOT.jar"]