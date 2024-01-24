def extScripts(){
    echo "This line is printed by running this mehtod!"
}
def usingEnvs(){
    echo "My name is ${params.MY_NAME}.(used params.MYNAME to get my name here)"
}
def printMessage(message){
    println("the message you provided is ---- ${message}")
}
// return this is important 
// without this you will get 
// java.lang.NullPointerException: Cannot invoke method 'tha last method' on null object
return this

