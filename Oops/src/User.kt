fun main(){
    val user:User=User()
    println(user.age)
}


class User {
    val name:String=""
    val email:String=""
    val age =0

    fun checkEmail():Boolean{
        return email.isNotEmpty()
    }

}