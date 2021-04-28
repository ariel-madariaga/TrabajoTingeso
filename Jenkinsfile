
pipeline {
    agent any
    stages {
        stage('Inicio'){
            steps{
                echo "Iniciando"
            } 
        }

        stage("SonarQube analysis") {
            //agent any
            steps {
                dir("/var/lib/jenkins/workspace/prueba1/backend"){
                    withSonarQubeEnv('sonarqube') {
                        sh 'chmod +x ./gradlew'
                        sh './gradlew sonarqube'
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
        /*
        stage('Levantar'){
             steps{
                dir("/var/lib/jenkins/workspace/prueba1/backend"){
                   sh './gradlew bootRun'
                }
                dir("/var/lib/jenkins/workspace/prueba1/frontend"){
                    sh 'npm install'
                    sh 'npm run start'
                }
            }
        }
        */
        stage('Fin'){
                steps{
                    echo "Terminado"
                } 
            }
        

        }
}
