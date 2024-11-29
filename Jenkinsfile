pipeline {
    agent any
    stages {
        stage('Verificar Repositorio') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], useRemoteConfigs:[[url: 'https://github.com/victorboll/EmissorMicroservico.git']]])
            }
        }

        stage('Instalar Dependencias e Build') {
            steps {
                script {
                    bat 'mvn clean install -DskipTests'
                }
            }
        }

        stage('Construir Imagem Docker') {
            steps {
                script {
                    def appName = 'victor.emissor.microservice'
                    def imageTag = "${appName}:${env.BUILD_ID}"  // Usando o BUILD_ID do Jenkins como tag da imagem Docker
                    bat "docker build -t ${imageTag} -f Dockerfile ."
                }
            }
        }

        stage('Fazer Deploy') {
            steps {
                script {
                    def appName = 'victor.emissor.microservice'
                    def imageTag = "${appName}:${env.BUILD_ID}"

                    bat "docker stop ${appName} || exit 0"  
                    bat "docker rm ${appName}  || exit 0"  

                    bat "docker run -d --name ${appName} -p 8082:8082 ${imageTag}"
                }
            }
        }
    }
}
                 
