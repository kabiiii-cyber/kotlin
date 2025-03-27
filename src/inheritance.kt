//parent class/super class/base class
open class Animal{
    var age = 3
    var gender = "Male"


    fun makesound(){
        println("animal is speaking")

    }
}


//child class/Derived class/ Sub class
class dog:Animal(){
    fun bark(){
        println("woof!")
    }

}

class Cat{
    var color = "White"
    var hasfur = true

    fun meow(){
        println("meow!")
    }
}

fun main() {

    var a = Animal()



    var d = dog()
    d.bark()
    println(d.gender)


    var c = Cat()
}
