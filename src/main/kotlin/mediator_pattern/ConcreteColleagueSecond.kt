package mediator_pattern

class ConcreteColleagueSecond(mediator: Mediator) : Colleague(mediator) {
    override fun action() {
        println("Colleague second 将信息交给中介者处理")
    }
}