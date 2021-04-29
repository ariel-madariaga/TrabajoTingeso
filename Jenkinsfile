
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
                    //sh 'chmod +x /var/lib/jenkins/workspace/prueba1/front-end/node_modules/.cache/.eslintcache'
                    //sh 'chmod -R a+x node_modules/.cache/.eslintcache'
                    //sh 'forever start index.js'
		    sh 'rm -rf node_modules'
                    sh 'npm install'
		    sh 'npm start'
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
