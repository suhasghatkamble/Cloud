# Use the official OpenJDk image as a parent image
FROM openjdk:latest

# set the working directory to /app
WORKDIR /app

# Copy the currrent directory contents into the container at   /app
COPY . /app

# Compile the Java code
RUN javac HelloWorld.java


# Run the program when the container starts
CMD ["java","HelloWorld"]