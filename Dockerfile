# Use the official OpenJDk image as a parent image
FROM python:3.9-slim-buster

# set the working directory to /app
WORKDIR /app

# Copy the currrent directory contents into the container at   /app
COPY . /app


# Run the program when the container starts
CMD ["python","app.py"]