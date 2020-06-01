pipeline {
    agent any

    stages {
        stage('Test') {
            steps {
                sh 'make check || true' 
                junit '**/target/*.xml' 
            }
        }
    }
}
