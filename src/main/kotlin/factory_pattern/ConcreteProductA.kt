package factory_pattern

/**
 * 具体产品A
 */
class ConcreteProductA : Product() {
    override fun method() {
        println("Concrete product A.")
    }
}