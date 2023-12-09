package mediator_pattern

abstract class Colleague(mediator: Mediator) {
    abstract fun action()
}