pipeline {

    agent any
    
    triggers {
        pollSCM 'H/1 * * * *'
    }

    stages {
        stage('Checkout code') {
            steps {
                checkout scm
            }
        }

        stage('Compilation') {
            steps {
                sh './mvnw clean install'
            }
        }
        stage('archive-artifacts') {
            steps {
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
            }
        }
    }
}