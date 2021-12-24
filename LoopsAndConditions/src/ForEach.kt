fun main(){
    var mutableListOfNames= mutableListOf<String>("Hello","world")
    var mutableArrayListOfNames= arrayListOf<String>("Hello","world")
    val mapOfNames=mapOf<String,String>("name" to "pulkit" , "age" to "20")
   mapOfNames.forEach{
        name->println(name)
    }
}