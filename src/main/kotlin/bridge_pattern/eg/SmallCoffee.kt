package bridge_pattern.eg

class SmallCoffee(coffeeAdditives: CoffeeAdditives) : Coffee(coffeeAdditives) {
    override fun makeCoffee() {
        println("Coffee ${coffeeAdditives.addSomething()} small.")
    }
}