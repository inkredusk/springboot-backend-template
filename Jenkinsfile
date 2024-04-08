pipeline {


    agent any

    tools {
        jdk 'jdk-17'
        maven 'mvn-3.6.3'
    }

    stages {
        stage('SCM') {
            steps {
                checkout scm
            }
        }

        stage('clean') {
            steps {
                sh 'mvn clean'
            }
        }
        stage('install') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('archive-artifacts') {
            steps {
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
            }
        }
    }
}