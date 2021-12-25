fun main(){


    val output=operation(6,7,{
        a,b->println("adding two numbers")
        a+b
    })

    println(output)
}

fun operation(a:Int,b:Int,operate:(Int,Int)->Int):Int{
    return operate(a,b)
}


/*

    Types Of Arguments
    1.Positional Arguments
    2.Default Arguments
    3.Named Arguments
 */