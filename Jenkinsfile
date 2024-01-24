def extGroovyScript

pipeline {
    agent any
    environment {
        MY_NAME = 'Vasanth'
    }
    parameters {
        string(name: "APP_VERSION", defaultValue: "1.0.1", description: "Current version of the app")
        choice(choices: ['DEBUG', 'RELEASE'], name: "BUILD_TYPE", description: "Version types")
    }
    stages {
        stage('BUILD') {
            steps {
                echo "Build completed...!"
            }
        }
        stage('DEBUG') {
            when {
                expression {
                    params.BUILD_TYPE == 'DEBUG'
                }
            }
            steps {
                echo "current build type is ${params.BUILD_TYPE}"
                echo "Debug completed..."
            }
            post {
                success {
                    echo "Debug success"
                }
                failure {
                    echo "Debug failed"
                }
            }
        }
        stage('RELEASE') {
            when {
                expression {
                    params.BUILD_TYPE == 'RELEASE'
                }
            }
            steps {
                echo "current build type is ${params.BUILD_TYPE}"
                echo "Release completed..."
            }
            post {
                success {
                    echo "Release success"
                }
                failure {
                    echo "Release failed"
                }
            }
        }
    }
}




        // we can pass the parameters inside jenkins as this params.APP_VERSION
        // 
        /* stage('usingParams'){
            
            steps{
                script{
                    extGroovyScript.showCurrentVersion(params.APP_VERSION)
                    extGroovyScript.showCurrentVersionByPassingParamData()
                }
            }
            post{
                success{
                    echo "completed!"
                }
                failure{
                    echo "Failed to complete"
                }
                }
        } */
        /* stage('Build') {
            steps {
                echo 'Building the app'
                sh './build.sh'
                sh '/bin/bash ./build.sh'
                echo 'Completed!'
            }
        } */
        /*
            practice how to use environment variables
         */
        /* stage('envPractice') {
            steps {
                echo "My branchName is ${BRANCH_NAME}"
                echo "My Name is ${MY_NAME}"
                echo "GIT branch Name is ${GIT_BRANCH}"
                echo "GIT url is ${GIT_URL}"
                echo "GIT commit message is ${GIT_COMMIT}"
            }
        } */
/*     stages {
        stage('loadExternalGroovy') {
            steps {
                script {
                    extGroovyScript = load 'scripts.groovy'
                }
            }
            post {
                success {
                    echo "External script loaded successfully!"
                }
            }
        }
        stage('executeExternalGroovy') {

            steps {
                script {
                    extGroovyScript.printMessage('My future is the best in India')
                    extGroovyScript.extScripts()
                    extGroovyScript.usingEnvs()
                }
            }
        } */