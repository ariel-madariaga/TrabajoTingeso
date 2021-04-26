import org.kie.jenkins.MavenCommand

pipeline {
    agent none
    stages {
     
        stage('Build') {
            steps {
                sh './gradlew build'
                sh 'mvn --version'
            }
        }
     
        stage('Test') {
            steps {
                sh './gradlew check'
            }
        }
     
        stage("SonarQube analysis") {
            agent any
            steps {
                withSonarQubeEnv('sonarqube-grupo3') {
                    sh 'mvn clean package sonar:sonar'
                }
            }
        }
     
        stage("Quality Gate") {
            steps {
                timeout(time: 1, unit: 'HOURS') {
                    waitForQualityGate abortPipeline: true
                }
            }
        }
     
        stage('Build and Test') {
            steps {
                sh 'build here...'
                sh 'run tests here if you like ...'
            }
        }

    }
    post {
        always {
            archiveArtifacts artifacts: 'build/libs/**/*.jar', fingerprint: true
            junit 'build/reports/**/*.xml'
        }
    }
}
