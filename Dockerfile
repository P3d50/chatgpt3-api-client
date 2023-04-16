FROM maven:3.8.4-jdk-11
WORKDIR /chatgpt3-api-client
COPY pom.xml .
COPY src/ ./src/
RUN mvn clean install
ENTRYPOINT ["mvn", "spring-boot:run"]

