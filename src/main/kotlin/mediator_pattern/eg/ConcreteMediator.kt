package mediator_pattern.eg

class ConcreteMediator :Mediator() {
    var tenant:Tenant? = null
        get() = field
        set(value) {
            field = value
        }
    var houseOwner:HouseOwner? = null
        get() = field
        set(value) {
            field = value
        }

    override fun constacture(message: String, person: Person) {
        if(person == houseOwner){
            tenant?.getMessage(message)
        }else{
            houseOwner?.getMessage(message)
        }
    }
}