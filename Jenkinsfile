@Library("training_lib") _
pipeline {
    agent { label 'local_agent' }

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
                
                echo 'Hello World1'
                
                echo 'Hello World2'
                script {
                    hello_world.info 'bajs'
                    hello_world.info1 'kiss'
                    def myscript = load 'src/my_script.groovy'
                    myscript.myFunction()
                }
            }
        }
    }
}

