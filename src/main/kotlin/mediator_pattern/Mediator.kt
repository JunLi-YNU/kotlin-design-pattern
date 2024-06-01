package mediator_pattern

abstract class Mediator {
    protected var colleagueFirst: ConcreteColleagueFirst? = null
    protected var colleagueSecond: ConcreteColleagueSecond? = null

    abstract fun method()
    fun setMColleagueFirst(mColleagueFirst: ConcreteColleagueFirst) {
        this.colleagueFirst = mColleagueFirst
    }

    fun setMColleagueSecond(mColleagueSecond: ConcreteColleagueSecond) {
        this.colleagueSecond = mColleagueSecond
    }
}

