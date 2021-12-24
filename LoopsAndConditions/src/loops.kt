fun main(){
    var mutableListOfNames= mutableListOf<String>("Hello","world")
    var mutableArrayListOfNames= arrayListOf<String>("Hello","world")
    val mapOfNames=mapOf<String,String>("name" to "pulkit" , "age" to "20")


    for(name in mutableListOfNames ){
        println(name)
    }

    for (x in 0..10){
        //0..10 means it will run from 0 to 10
        // 10 is inclusive [0,10]
        println(x)
    }

    for (x in 0 until 10){
        //10 is exclusive [0,10)
    }

    for (x in 0 until 10 step 2){
        //step 2 means moving 2 position at once
        //[0,2,4,6,8]

    }
}