 pipeline {
    agent none
    stages {
        stage("build & SonarQube analysis") {
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
     
        stage('Analyze') {
            steps {
                script {
                    getMavenCommand()
                        .withOptions(['-e', '-nsu'])
                        .withProfiles(['sonarcloud-analysis'])
                        .run('validate')
                }
            }
        }
     
    }
    agent any
    stages {
        stage('Build and Test') {
            steps {
                sh 'build here...'
                sh 'run tests here if you like ...'
            }
        }
    }
    post {
        always {
            junit '**/reports/junit/*.xml'
        }
    } 
}
