
pipeline {
    agent any
    stages {

        /*stage('Build') {
            steps {
                sh './gradlew build'
                sh 'mvn --version'
            }
        }

        stage('Test') {
            steps {
                sh './gradlew check'
            }
        }*/

        stage('Inicio'){
            steps{
                echo "prueba"
            } 
        }

        stage("SonarQube analysis") {
            //agent any
            steps {
                dir("/var/lib/jenkins/workspace/prueba1"){
                    withSonarQubeEnv('sonarqube-grupo3') {
                        //sh 'chmod +x ./gradlew'
                        sh './gradlew sonarqube'
                        //sh 'mvn clean package sonar:sonar'
                    }
                }
            }
        }
     
        /*stage("Quality Gate") {
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
        }*/

    }
    
    //post {
        //always {
            //archiveArtifacts artifacts: 'build/libs/**/*.jar', fingerprint: true
            //junit 'build/reports/**/*.xml'
        //}
    //}
}
