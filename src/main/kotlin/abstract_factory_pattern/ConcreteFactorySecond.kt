package abstract_factory_pattern

class ConcreteFactorySecond : AbstractFactory() {
    override fun createProductA(): AbstractProductA {
        return ConcreteProductA2()
    }
    override fun createProductB(): AbstractProductB {
        return ConcreteProductB2()
    }
}