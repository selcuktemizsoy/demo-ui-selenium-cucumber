FROM maven:3.6-jdk-11

WORKDIR /tests
COPY ../pom.xml .
RUN mvn install
COPY .. .
ENTRYPOINT [ "tail", "-f", "/dev/null" ]
