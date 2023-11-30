package bridge_pattern.eg

abstract class Coffee(protected val coffeeAdditives: CoffeeAdditives) {
    abstract fun makeCoffee()
}