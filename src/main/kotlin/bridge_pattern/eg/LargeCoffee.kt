package bridge_pattern.eg

class LargeCoffee(coffeeAdditives: CoffeeAdditives) : Coffee(coffeeAdditives) {
    override fun makeCoffee() {
        super.makeCoffee()
        println("Coffee ${coffeeAdditives.addSomething()} large.")
    }
}