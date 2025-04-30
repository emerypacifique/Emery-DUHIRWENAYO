FROM openjdk:21-jdk
LABEL authors="EMERY PACIFIQUE"

#creating a working directory inside the container
WORKDIR /app

#copying the compiled files into the container
COPY out/production/Hotel_Management_System/ /app

#Specifying the main class to run the application
ENTRYPOINT ["java", "-cp", "/app","mainMethod.Main"]