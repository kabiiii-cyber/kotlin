fun main() {
    var dog1 = Dog("billy","chihua","white")
    println(dog1.breed)

    var dog2 = Dog("mike","kienyeji","brown")
    println(dog2.name)

    var dog3 = Dog("joseph","germanshepherd","black")
    println(dog3.breed)

    var dog4 = Dog("ian","husky","white")
    println(dog4.breed)


}

class Dog(var name:String,var breed:String,var color:String){


}