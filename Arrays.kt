fun main(args: Array<String>) {
    println(area (width = 20.56, length = 40.64))
    println(calculatedArea(width = 43, length = 34))
    println(calculateCircleArea(radius = 34.67))
    println(calculateBMI(weight = 344.56, height = 669.45))

}

fun area (width: Double,length: Double): String{
    val a = "The length is $length."
    val b = "The width is $width"
    val c = length*width
    return "$a\n$b\n$c"
}

fun calculatedArea(width: Int,length: Int): String{
    val a = "The length is $length."
    val b = "The width is $width"
    val c = length*width
    return "$a\n$b\n$c"
}
fun calculateCircleArea(radius: Double,pi: Double=3.142): Double{
    return pi*radius*radius
}


fun calculateBMI(weight: Double, height:Double): Double{

    return weight/(height*height)
}
