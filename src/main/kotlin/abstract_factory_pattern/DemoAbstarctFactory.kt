package abstract_factory_pattern

fun main() {
    val abstractFactory1 = ConcreteFactoryFirst()
    val productA1 = abstractFactory1.createProductA()
    productA1.method()
    val productB1 = abstractFactory1.createProductB()
    productB1.method()

    val abstractFactory2 = ConcreteFactorySecond()
    val productA2 = abstractFactory2.createProductA()
    productA2.method()
    val productB2 = abstractFactory2.createProductB()
    productB2.method()
}