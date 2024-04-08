pipeline {

    agent any
    
    triggers {
       githubPush()
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