fun main(args: Array<String>) {
    println(birthdayGreeting("Andrew",23,"Gloria"))
    println(Greetings("Mellisa"))
    println(AreaCalculator(3.14,50))
    println(BMI (1.7,54.3))
}
fun birthdayGreeting(name:String="George",age:Int,friend:String):String{
   val m ="Happy Birthday $name"
   val n = "You are $age years old"
   val p ="Regards from $friend"
    return "$m\n$n\n$p"
}
fun Greetings (name: String): String {
    val o = "Hello $name"
    return "$o"
}
fun AreaCalculator(pi:Double, radius:Int): Double {
    val b = pi*radius*radius
    return b
}
fun BMI(height:Double,Weight:Double): Double{
    val ans = Weight/height
    return ans


}
