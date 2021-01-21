fun myFirstFunction() {
    println("This is my first function in  Kotlin programming language.")
}

fun funcWithParameter(msg: String) {
    println(msg)
}

fun feel(feel: String = "Fuck you"){
    println(feel)
}

fun varargExample(vararg names: Int) {
    println("Argument has ${names.size} elements")
}

fun odd(x: Int): Boolean = x % 2 == 1

fun even(x: Int): Boolean = x % 2 == 0

fun not(f: (Int) -> Boolean): (Int) -> Boolean {
    return {n -> !f.invoke(n)}
}

class ExampleClass(val x: Int) {
    fun memberFunction(y: Int): Int {
        return x + y
    }

    infix fun infixMemberFunction(y: Int): Int {
        return x * y
    }
}

data class MutableDataClassExample (var x: Int, var y: Int, var z: Int)

fun main(args: Array<String>) {
    println("Hello World!")

    val fooVal = 15
    var fooVar = 25

    var foo:Int = 7

    println(fooVal)

    val fooString = "My String Is Here!"
    val barString = "Printing on a new line?\nNo Problem!"
    val bazString = "Do you want to add a tab?\tNo Problem!"
    println(fooString)
    println(barString)
    println(bazString)

    val greetingKotlin: String = "Hello mother fucker Kotlin"
    println(greetingKotlin)

    val anotherVariable: String = "Fuck you :v"

    println(anotherVariable)

    val firstName: String = "Le"
    val middleName: String = "Nhut"
    val lastName: String = "Nam"
    println("$firstName $middleName $lastName")

    myFirstFunction()

    funcWithParameter(greetingKotlin)

    var fooNullable: String? = "abc"
    println(fooNullable?.length) // => 3
    println(fooNullable?.length ?: -1) // => 3
    fooNullable = null
    println(fooNullable?.length) // => null
    println(fooNullable?.length ?: -1) // => -1

    feel()
    feel("Lmao")

    varargExample() // => Argument has 0 elements
    varargExample(1) // => Argument has 1 elements
    varargExample(1, 2, 3) // => Argument has 3 elements

    print(odd(13))
    print(odd(12))
    print(even(13))
    print(even(12))

    val notOdd = not(::odd)
    val notEven = not(::even)

    val notZero = not {n -> n == 0}

    val notPositive = not {it > 0}
    for (i in 0..10) {
        println("${notOdd(i)} ${notEven(i)} ${notZero(i)} ${notPositive(i)}")
    }

    val fooExampleClass = ExampleClass(7)

    println(fooExampleClass.memberFunction(4)) // => 11

    val fooMutableData = MutableDataClassExample(7, 4, 9)
    with (fooMutableData) {
        x -= 2
        y += 2
        z--
    }

    println(fooMutableData)

    val fooList = listOf("a", "b", "c")
    println(fooList.size) // => 3
    println(fooList.first()) // => a
    println(fooList.last()) // => c
    println(fooList[1]) // => b

    val fooMutableList = mutableListOf("a", "b", "c")
    fooMutableList.add("d")
    println(fooMutableList.last()) // => d
    println(fooMutableList.size) // => 4

    // We can create a set using the "setOf" function.
    val fooSet = setOf("a", "b", "c")
    println(fooSet.contains("a")) // => true
    println(fooSet.contains("z")) // => false

}