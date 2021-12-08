FROM openjdk:17
COPY . /opt
WORKDIR /opt
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "./target/GraphSQLStudy-1.0-SNAPSHOT.jar"]