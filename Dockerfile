FROM openjdk:11.0.6
WORKDIR /usr/src/student-service
COPY target/student-service-0.0.1-SNAPSHOT.jar .
EXPOSE 80
ENV SPRING_PROFILES_ACTIVE aws-test
ENTRYPOINT ["java", "-jar", "student-service-0.0.1-SNAPSHOT.jar"]