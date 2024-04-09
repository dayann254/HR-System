import java.util.Scanner

fun main(args: Array<String>) {
    println("Please type a word here: ")
    var enteredString = readLine()
    println("You have typed:$enteredString")


    println("Please write any number: ")
    var anyNumber =Integer . valueOf(readLine())
    println("You have entered number $anyNumber")


    var read = Scanner(System.`in`)
    println("Please enter an Integer number: ")
    var integerNumber = read.nextInt()
    println("This is the number you have entered: $integerNumber")

    println("Enter a float number: ")
    var floatNumber = read.nextFloat()
    println("This is the float number entered: $floatNumber" +
            "")

}
