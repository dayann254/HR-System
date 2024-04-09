fun main(args: Array<String>) {
val child1 = Child()
    child1.myFunction()
val dog1 = Dog("Brown", 6)
    println(dog1.woof())
    val cow1 = Cow ("White",3)
    println( cow1.moo())
    val cat1 = Cat ("Grey",1)
    println( cat1.purr())
}
open class Parent{
    val x = 5
}
class Child:Parent() {
    fun myFunction() {
        println(x)
    }
}
    open class Animal(color: String, age: Int) {
        init {
            println("Color is: $color")
            println("Age is: $age")
        }
    }

    class Dog(color: String, age: Int) : Animal(color, age) {
        fun woof() {
            println("Dog makes a sound woof")
        }
    }

    class Cow(color: String, age: Int) : Animal(color, age) {
        fun moo() {
            println("Cow makes a sound moo")
        }
    }
class Cat(color: String, age: Int) : Animal(color, age) {
    fun purr() {
        println("Cat  purrs")}}
