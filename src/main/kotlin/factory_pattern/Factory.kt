package factory_pattern

import kotlin.reflect.KClass

abstract class Factory() {
    abstract fun <T : Any> createProduct(product: KClass<T>): T
    abstract fun <T : Any> createProduct(product: Class<T>): T
    abstract fun <T : Product> create(product: T): Product

}