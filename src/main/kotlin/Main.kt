import factory_pattern.ConcreteProductA
import factory_pattern.Product
import java.lang.Runtime
import kotlin.reflect.full.createInstance

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    var runtime = Runtime.getRuntime()
    println(runtime)

    val clazz = ConcreteProductA::class
    clazz.createInstance().method()

}