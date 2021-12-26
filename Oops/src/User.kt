fun main(){
    val user:User=User("raj","raj@gmail.com",20)
    println(user.age)
}


class User(name:String,email:String,age:Int=0) {
    var name:String
    var email:String
    var age :Int

    //constructor using init block
    //primary constructor
    init {
        this.name=name
        this.email=email
        this.age=age
    }




    /*
        It is a function with same name as class name
        It is used to construct or Initialize the class
        Two types of constructor
        1.Primary Constructor
        2.Secondary Constructor
     */


    fun checkEmail():Boolean{
        return email.isNotEmpty()
    }

}