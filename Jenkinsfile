
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

        stage('SCM') {
            steps{
                git 'https://github.com/foo/bar.git'                
            }
        }
        stage('SonarQube analysis') {
            steps{
                def scannerHome = tool 'SonarScanner 4.0';
                dir("/var/lib/jenkins/workspace/prueba1"){
                    withSonarQubeEnv('My SonarQube Server') { // If you have configured more than one global server connection, you can specify its name
                        sh "${scannerHome}/bin/sonar-scanner"
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
