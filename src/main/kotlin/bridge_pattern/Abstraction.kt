package bridge_pattern

abstract class Abstraction(private val implementor: Implementor) {
    open fun operation() {
        implementor.operationImpl()
    }
}
