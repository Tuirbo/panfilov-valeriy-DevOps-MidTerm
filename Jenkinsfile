pipeline {
    agent any

    tools {
        maven 'Maven-17'
    }

    environment {
        IMAGE_NAME = 'panfilov-valeriy-api:v1.0-panfilov-valeriy'
        STUDENT_NAME = 'Valeriy Panfilov'
    }

    stages {
        stage('Checkout') {
            steps {
                echo "Checking out code for ${STUDENT_NAME}..."
                checkout scm
            }
        }

        stage('Build & Package') {
            steps {
                echo "Building application..."
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Test') {
            steps {
                echo "Running unit tests..."
                sh 'mvn test'
            }
        }

        stage('Verify Artifact') {
            steps {
                echo "Verifying generated JAR file..."
                sh 'ls -la target/*.jar'
                echo "Build completed successfully for ${STUDENT_NAME}!"
            }
        }
    }
}
