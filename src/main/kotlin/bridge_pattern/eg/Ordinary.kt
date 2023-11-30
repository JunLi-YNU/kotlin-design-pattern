package bridge_pattern.eg

class Ordinary : CoffeeAdditives() {
    override fun addSomething(): String {
        return "ordinary"
    }
}