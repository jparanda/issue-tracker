FROM openjdk:8-jdk-alpine
MAINTAINER juan.aranda.galvis@gmail.com
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ADD  ./target/issue-tracker-0.0.1-SNAPSHOT.jar /home/issue-tracker/issue-tracker-app.jar
WORKDIR home/issue-tracker
ENTRYPOINT ["java","-jar","issue-tracker-app.jar"]