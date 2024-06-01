package abstract_factory_pattern

abstract class AbstractFactory {
    abstract fun createProductA() : AbstractProductA
    abstract fun createProductB() : AbstractProductB
}