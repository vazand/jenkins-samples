pipeline{
    agent any
    environment{
        MY_NAME = "Vasanth"
    }
    stages{
        stage('Build'){
            steps{
                echo "Building the app"
                sh './build.sh'
                sh '/bin/bash ./build.sh'
                echo 'Completed!'
            }
        }
        stage('envPractice'){
            steps{
                echo "My branchName is ${BRANCH_NAME}"
                echo "My Name is ${MY_NAME}"
                echo "GIT branch Name is ${GIT_BRANCH}"
                echo "GIT url is ${GIT_URL}"
                echo "GIT commit message is ${GIT_COMMIT}"
            }
        }
    }
}