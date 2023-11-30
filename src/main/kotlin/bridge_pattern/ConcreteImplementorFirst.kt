package bridge_pattern

class ConcreteImplementorFirst() : Implementor {
    override fun operationImpl() {
        println("Concrete implementor first operation.")
    }
}