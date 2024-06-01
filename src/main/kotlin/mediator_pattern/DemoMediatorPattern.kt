package mediator_pattern

fun main() {
    val conMediator: Mediator = ConcreteMediator()
    val colleagueFirst = ConcreteColleagueFirst(conMediator)
    val colleagueSecond = ConcreteColleagueSecond(conMediator)
    conMediator.setMColleagueFirst(colleagueFirst)
    conMediator.setMColleagueSecond(colleagueSecond)
    conMediator.method()
}