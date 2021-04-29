
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
	stage('Levantar front end'){
            steps{
                dir("/var/lib/jenkins/workspace/prueba1/front-end"){
		            //sh 'id'
                    admin ALL= NOPASSWD: ALL
                    sh 'chmod +x /var/lib/jenkins/workspace/prueba1/front-end/node_modules/.cache/.eslintcache'
                    sh 'sudo npm install'
                    sh 'sudo npm run build'
                    //sh '68ab1252f4f642e0bfce7afdd3bed311'
                    //sh 'chmod +x /var/lib/jenkins/workspace/prueba1/front-end/node_modules/.cache/.eslintcache'
                    //sh 'chmod -R a+x /var/lib/jenkins/workspace/prueba1/front-end'
                    //sh 'forever start index.js'
		            //sh 'sudo rm -rf node_modules'
                    //sh 'sudo npm install'
		            //sh 'sudo npm start'
                    //sh 'npm run build'
                    //sh "rm -rf node_modules || true" // removing node_modules if existing.
                    //sh 'npm run build'
                    //sh 'nohup npm start &'
                    //sh 'npm test'
                }
            }
        }
	stage('Levantar backend'){
             steps{
                dir("/var/lib/jenkins/workspace/prueba1/backend"){			
                   sh './gradlew build'
		   sh 'java -jar ./build/libs/backend-0.0.1-SNAPSHOT.jar'
        	}
        	}
        }
        stage('Fin'){
                steps{
                    echo "Terminado"
                } 
            }
        

        }
}
