FROM openjdk:8-jdk-alpine
RUN addgroup -S spring && adduser -S kiwi -G spring
USER kiwi
WORKDIR /home/kiwi
ARG JAR_FILE=build/libs/kiwi-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]
