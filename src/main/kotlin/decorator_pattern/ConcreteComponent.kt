package decorator_pattern

class ConcreteComponent : Component() {
    override fun operate() {
        println("Concrete component operate.")
    }
}