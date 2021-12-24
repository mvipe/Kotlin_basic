//declaring variable
fun main(){
    val a="Hello World"
    var b=5
    print(b+5)

    //if you do not want to set the value at the time of declaration


     //Using Lateinit for initilization
    lateinit var x:String


    var z:String?=null
    val size:Int=z?.length ?:0
    print(size)
}