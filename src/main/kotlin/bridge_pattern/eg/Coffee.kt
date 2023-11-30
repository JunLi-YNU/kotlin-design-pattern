package bridge_pattern.eg

abstract class Coffee(protected val coffeeAdditives: CoffeeAdditives) {
    open fun makeCoffee() {}
}