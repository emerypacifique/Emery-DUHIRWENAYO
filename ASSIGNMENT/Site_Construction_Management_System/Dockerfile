FROM openjdk:21-jdk
LABEL authors="EMERY PACIFIQUE"
#Creating a working directory inside the container
WORKDIR /app
#Copying the compiled files into the working directory we created
COPY out/production/Site_Construction_Management_System/ /app
#Specifying the main class to run the application
ENTRYPOINT ["java", "-cp", "/app","mainMethod.Main"]