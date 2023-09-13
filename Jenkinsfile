pipeline {
    agent { label 'local_agent' }
    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                echo '%path%'
                git url: 'https://github.com/naiveskill/devops.git', branch: 'main'
            }
        }
    }
}
