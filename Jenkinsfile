pipeline {
    agent { label 'local_agent' }

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
                
                echo 'Hello World1'
                
                echo 'Hello World2'

                powershell '&winver'
            }
        }
    }
}

