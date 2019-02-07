FROM openjdk:8-alpine

COPY target/uberjar/oldblues.jar /oldblues/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/oldblues/app.jar"]
