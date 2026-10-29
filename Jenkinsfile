pipeline {
    agent any

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

        stage('Build') {
            steps {
                echo "Building Spring Boot application..."
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Test') {
            steps {
                echo "Running unit tests..."
                sh 'mvn test'
            }
        }

        stage('Docker Build') {
            steps {
                echo "Building Docker image: ${IMAGE_NAME}..."
                sh "docker build -t ${IMAGE_NAME} ."
            }
        }

        stage('Verify') {
            steps {
                echo "Verifying Docker image existence..."
                sh "docker images | grep panfilov-valeriy-api"
                echo "Build finished successfully for ${STUDENT_NAME}!"
            }
        }
    }
}
