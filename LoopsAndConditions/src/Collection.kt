fun main(){
    var listOfNames=listOf<String>("Hello","wporld")
    //this list is immutable , you can not add or update this list

    var mutableListOfNames= mutableListOf<String>("Hello","world")
    //we can mutate this list


    mutableListOfNames.add("Welcome")

    var mutableArrayListOfNames= arrayListOf<String>("Hello","world")
    //array list is also mutable

    val mapOfNames=mapOf<String,String>("name" to "pulkit" , "age" to "20")
}