package factory_pattern

import java.util.*

class PropertiesConcreteFactory {
    init {
        println("类Init----------")
    }
    companion object {
        private val productMap = mutableMapOf<String, Product>()
        private val properties = Properties()
        private val inputStream = PropertiesConcreteFactory::class.java.getResourceAsStream("factory.properties")

        init {
            println("Companion object---------")
            properties.load(inputStream)
            println(properties.entries.toString())
            val set = properties.entries
            for (property in set) {
                val className = properties.getProperty(property.key.toString())
                val instance = Class.forName(className).getDeclaredConstructor().newInstance()
                productMap[property.key.toString()] = instance as Product
            }
        }
        fun getProduct(keyName: String): Product? {
            return productMap[keyName]
        }
    }
}