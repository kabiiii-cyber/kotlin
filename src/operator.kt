fun main() {
    // arithmentic operators
    var x = 20
    var y = 5
    println( x + y )
    println( x * y )
    println( x / y )
    println( x - y )
    println( x % y ) // modulus

    // comparioson operators
    var a = 67
    var b = 30
    println(a < b)
    println(a > b)
    println(a <= b)
    println(a >= b)
    println(a == b)
    println(a != b)


    //assignment operators
    var number = 90
    println(number)


    number-=3
    println(number)

    //logical operators - &&, ||,!
    var num = 10
    println(num > 67 && num <20)
    println(num > 67 || num <20)
    println(!(num > 67 || num <20))
}
