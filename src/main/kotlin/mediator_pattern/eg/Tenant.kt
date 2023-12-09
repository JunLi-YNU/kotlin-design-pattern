package mediator_pattern.eg

class Tenant(name: String, mediator: Mediator) : Person(name, mediator) {

    fun communicate(message: String) {
        mediator.constacture(message, this)
    }

    fun getMessage(message: String) {
        println("租房者:$name,获取到的房东信息:$message")
    }
}