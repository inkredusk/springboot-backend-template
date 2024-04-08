pipeline {

    agent any
    
    triggers {
      pollSCM('') // Enabling being build on Push
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