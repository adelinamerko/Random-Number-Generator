FROM openjdk:11
VOLUME /tmp
EXPOSE 8080
COPY . /usr/src/app
WORKDIR /usr/src/app
ARG JAR_FILE=./target/RandomNumberGenerator-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} RandomNumberGenerator.jar
ENTRYPOINT ["java","-jar", "RandomNumberGenerator.jar"]