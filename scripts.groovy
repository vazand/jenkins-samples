def extScripts(){
    echo "This line is printed by running this mehtod!"
}
def usingEnvs(){
    echo "My name is ${env.MY_NAME}.(used env.MYNAME to get my name here)"
}
def printMessage(message){
    println("the message you provided is ---- ${message}")
}
// pass the current version from param here
def showCurrentVersion(version){
    println("Current version of the build is -> ${version}")
}
def showCurrentVersionByPassingParamData(){
    println("Current Version is ${params.APP_VERSION} by using params.APP_VERSION")
}
// return this is important 
// without this you will get 
// java.lang.NullPointerException: Cannot invoke method 'tha last method' on null object
return this

