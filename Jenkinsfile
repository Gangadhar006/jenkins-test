pipeline {
    agent any

    tools {
        maven 'maven' // Assuming 'maven' is the configured Maven tool name
    }

    stages {
        stage('Build Maven') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], userRemoteConfigs: [[url: 'https://github.com/Gangadhar006/jenkins-test.git']]])
                bat 'mvn clean install'
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    bat 'docker build -t gangadhar006/docker-app .'
                }
            }
        }

        stage('Push Docker Image') {
            steps {
                script {
                    bat 'docker login -u gangadhar006 -p gang0006.'
                    bat 'docker tag gangadhar006/docker-app gangadhar006/docker-app:1.0'
                    bat 'docker push gangadhar006/docker-app:1.0'
                }
            }
        }
    }
}