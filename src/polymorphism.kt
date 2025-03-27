 open class Shape{
    open fun draw(){
        println("Drawing a shape")

    }
}



class circle:Shape(){
     override fun draw(){
         println("drawing a circle")
    }
}


class square:Shape(){
    override fun draw(){
        println("drawing a square")
    }
}


fun main() {
    var sh = Shape()
    sh.draw()

    var ci = circle()
    ci.draw()

    var sq = square()
    sq.draw()
}