fun main(){
var sum=sum(4,5)
    println(sum)
    println(singleLine_sum(2,3))
    greetings("Good Morning","raj")
    //we can do it in another order too
    greetings(name="raj prakash",greet="Hello")
}

fun sum(a:Int , b:Int):Int {
    return a+b
}

//same sum function in single line
fun singleLine_sum(a:Int,b:Int):Int=a+b

fun greetings(greet:String="Hello",name:String){
    //this will set a default value of greet "Hello"

    println("$greet $name")
}