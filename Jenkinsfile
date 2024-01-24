pipeline{
    agent any
    Stages{
        Stage('Build'){
            steps{
                echo "Building the app"
                sh './build.sh'
                sh '/bin/bash ./build.sh'
                echo 'Completed!'
            }
        }

    }
}