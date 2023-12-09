package mediator_pattern

class ConcreteMediator:Mediator() {
    private var colleagueFirst: ConcreteColleagueFirst? = null
    private  var colleagueSecond: ConcreteColleagueSecond? = null

    override fun method() {
        colleagueFirst?.action()
        colleagueSecond?.action()
    }
    fun setColleagueFirst(colleagueFirst: ConcreteColleagueFirst) {
        this.colleagueFirst = colleagueFirst
    }

    fun setColleagueSecond(colleagueSecond: ConcreteColleagueSecond) {
        this.colleagueSecond = colleagueSecond
    }
}