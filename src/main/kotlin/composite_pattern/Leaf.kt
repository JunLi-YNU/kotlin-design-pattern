package composite_pattern

class Leaf(name:String):Component(name) {
    override fun doSomething() {
        println(name)
    }
}