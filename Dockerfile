FROM openjdk:21-jdk

ADD build/libs/demo-docker-sbweb-0.0.1-SNAPSHOT.jar .

CMD ["java", "-jar", "demo-docker-sbweb-0.0.1-SNAPSHOT.jar"]