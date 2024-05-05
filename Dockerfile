FROM openjdk:17-jdk
WORKDIR /app
COPY target/employeemanager-0.0.1-SNAPSHOT.jar employeemanager-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java","-jar","employeemanager-0.0.1-SNAPSHOT.jar"]