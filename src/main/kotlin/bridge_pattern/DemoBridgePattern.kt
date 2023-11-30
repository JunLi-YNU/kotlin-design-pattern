package bridge_pattern

fun main() {
    val implementorFirst = ConcreteImplementorFirst()
    val refinedAbstractionFirst = RefinedAbstraction(implementorFirst)
    refinedAbstractionFirst.refinedOperation()
    val implementorSecond = ConcreteImplementorSecond()
    val refinedAbstractionSecond = RefinedAbstraction(implementorSecond)
    refinedAbstractionSecond.refinedOperation()
}