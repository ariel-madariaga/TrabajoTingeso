
pipeline {
    agent any
    stages {
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
     

    }
}
