fun main(args: Array<String>) {
    //containers that holds data sets

    var arr = arrayOf(10,"Faith",23.4,"A")
    var arr1 =  arrayOf<Int>(12,689,887,7865)
    var arr2 = arrayOf<String>("Joy","John","Joseph","Jacob")


    println(arr2[1])
    println(arr1[2])
//    modify an array using set function
    var fruits = arrayOf("ThornMelon","Apple","Banana","Orange")
    fruits.set(1,"Passion")
    fruits[0]="Tomato"
    for(fruit in fruits){
        println(fruit)
    }
//    using get function to fetch a value
    var car = arrayOf("Benz","BMW","Audi","Range")
    println(car.get(0))

}
