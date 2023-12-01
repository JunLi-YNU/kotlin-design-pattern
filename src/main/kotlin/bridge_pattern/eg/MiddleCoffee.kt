package bridge_pattern.eg

class MiddleCoffee(coffeeAdditives: CoffeeAdditives) : Coffee(coffeeAdditives) {
    override fun makeCoffee() {
        println("Coffee ${coffeeAdditives.addSomething()} middle.")
    }
}