package mediator_pattern

class ConcreteMediator : Mediator() {

    override fun method() {
        colleagueFirst?.action()
        colleagueSecond?.action()
    }
}