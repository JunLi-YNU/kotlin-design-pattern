package bridge_pattern.eg

fun main() {
    val sugar = Sugar()
    val ordinary = Ordinary()

    val largeCoffeeAddSugar = LargeCoffee(sugar)
    largeCoffeeAddSugar.makeCoffee()
    val largeCoffeeOrdinary = LargeCoffee(ordinary)
    largeCoffeeOrdinary.makeCoffee()

    val smallCoffeeAddSugar = SmallCoffee(sugar)
    smallCoffeeAddSugar.makeCoffee()
    val smallCoffeeOrdinary = SmallCoffee(ordinary)
    smallCoffeeOrdinary.makeCoffee()

    val milk = Milk()
    val middleCoffeeAddMilk = MiddleCoffee(milk)
    middleCoffeeAddMilk.makeCoffee()

}