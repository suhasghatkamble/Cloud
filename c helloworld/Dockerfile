# Use the official OpenJDk image as a parent image
FROM gcc:latest

# set the working directory to /app
WORKDIR /usr/src/app

# Copy the currrent directory contents into the container at   /app
COPY hello.c .

# Compile the Java code
RUN gcc -o hello hello.c


# Run the program when the container starts
CMD ["./hello"]