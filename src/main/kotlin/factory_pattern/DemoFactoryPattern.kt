package factory_pattern

/**
 * 客户端
 */
fun main() {
    val factory: Factory = ConcreteFactory()
    val product: Product = factory.createProduct(ConcreteProductA::class.java)
    product.method()
    val productByKotlinReflect: Product = factory.createProduct(ConcreteProductA::class)
    productByKotlinReflect.method()
    val productByExtendA : Product = factory.create(ConcreteProductA())
    productByExtendA.method()
    val productByExtendB : Product = factory.create(ConcreteProductB())
    productByExtendB.method()

    //配置文件形式的工厂模式
    val productCompanionA = PropertiesConcreteFactory.getProduct("product_a")
    val productCompanionB = PropertiesConcreteFactory.getProduct("product_b")
    productCompanionA?.method()
    productCompanionB?.method()

}