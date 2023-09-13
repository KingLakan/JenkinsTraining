pipeline {
    agent { label 'local_agent' }
    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git url: 'https://github.com/naiveskill/devops.git', branch: 'main'
            }
        }
    }
}
