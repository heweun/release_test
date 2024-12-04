# Base image
FROM openjdk:17-jdk-slim

# Application JAR file
ARG JAR_FILE=build/libs/SpringBoot-0.0.1-SNAPSHOT.jar

# Copy the JAR file to the container
COPY ${JAR_FILE} app.jar

# Expose port 8080
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "/app.jar"]
