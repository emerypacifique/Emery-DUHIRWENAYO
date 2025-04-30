FROM openjdk:21-jdk
LABEL authors="EMERY PACIFIQUE"

# Set the working directory inside the container
WORKDIR /app

# Copy the compiled application files into the container
COPY out/production/Traffic_Fine_Management_System/ /app

# Specify the main class to run the application
ENTRYPOINT ["java", "-cp", "/app", "mainMethod.Main"]