package factory_pattern

import java.io.InputStreamReader
import java.util.Properties
import kotlin.reflect.KClass
import kotlin.reflect.full.createInstance
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property

class ConcreteFactory : Factory() {

    override fun <T : Any> createProduct(product: KClass<T>): T {
        println("New instance by Kotlin KClass")
        return product.createInstance()
    }

    override fun <T : Any> createProduct(product: Class<T>): T {
        println("New instance by Java Class")
        return product.getDeclaredConstructor().newInstance()
    }

    override fun <T : Product> create(product: T): Product {
        return product
    }
}