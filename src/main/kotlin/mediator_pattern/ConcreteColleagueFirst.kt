package mediator_pattern

class ConcreteColleagueFirst(mediator: Mediator) : Colleague(mediator) {
    override fun action() {
        println("Colleague first 将信息交给中介者处理")
    }
}