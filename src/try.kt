import kotlin.math.min

fun main(){
    var y=remainder(20,9)
    var x=remainder(40,7)
    println(x)
    println(y)
    var sum=add(200,100,400,300)
    var v=add(1,2,3,4)
    println(v)
    println(sum)
    goal("keep trying always")
    goal("Embrace achievements")
    goal("Make your mama proud")
    goal("gain financial stability")
    var multiply=product(500,4)
    println(multiply)
    subtract(15,5,5)
    instructions("I want 6 bananas")
    instructions("Am a party hollic")
    instructions("I love doing make up")
    instructions("After my graduation i will take myself to a for a vacation in zanzibar")
    instructions("I want 2 gilbeys strawberry flavour")
    instructions("I have missed chocolate ")
    instructions("self love")
}
fun remainder(a: Int,b: Int):Int{
    var remainder=a%b
    return remainder
}
fun add(a: Int,b: Int,c: Int,d: Int):Int{
    var sum=a+b+c+d
    return sum
}
fun goal(firstName: String){
    println("$firstName")

}
fun product(a: Int,b: Int):Int{
    var multiply=a*b
    return multiply
}
fun subtract(a: Int,b: Int,c: Int){
    var minus=a-b-c
    println(minus)
}
fun instructions(firstName: String){
    var instruction=("$firstName")
    println(instruction)

}
