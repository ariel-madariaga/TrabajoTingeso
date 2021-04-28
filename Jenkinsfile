
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
                dir("/var/lib/jenkins/workspace/prueba1/backend"){
                    withSonarQubeEnv('sonarqube') {
                        sh 'chmod +x ./gradlew'
                        sh './gradlew sonarqube'
                        //sh 'mvn clean package sonar:sonar'
                    }
                }
            }
        }

        stage("JUnit"){
            steps{
                dir("/var/lib/jenkins/workspace/prueba1/backend/build/test-results/test"){
                    //junit skipPublishingChecks: true, testResults: 'test-results.xml'
                    
                    //junit 'test-results.xml'
                    
                    //junit 'more-test-results.xml'
                    
                    //junit allowEmptyResults: true, testResults: '*.xml'
                
                    //withChecks('Integration Tests') {
                    //    junit 'yet-more-test-results.xml'
                    //}           
                }
                catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
                    dir("/var/lib/jenkins/workspace/prueba1/backend") {
                    sh './gradlew test'
				    }
                }
                dir("/var/lib/jenkins/workspace/prueba1/backend/build/test-results/test"){
                    junit '*.xml'
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
