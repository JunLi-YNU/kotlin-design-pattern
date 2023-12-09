package mediator_pattern

fun main() {
    val conMediator = ConcreteMediator()
    val colleagueFirst = ConcreteColleagueFirst(conMediator)
    val concreteColleagueSecond = ConcreteColleagueSecond(conMediator)
    conMediator.setColleagueFirst(colleagueFirst)
    conMediator.setColleagueSecond(concreteColleagueSecond)
    conMediator.method()
}