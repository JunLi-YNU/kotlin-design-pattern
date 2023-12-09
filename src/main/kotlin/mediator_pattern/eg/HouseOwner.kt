package mediator_pattern.eg

class HouseOwner(name: String, mediator: Mediator) : Person(name, mediator) {
    fun communicate(message: String) {
        mediator.constacture(message, this)
    }

    fun getMessage(message: String) {
        println("房东:$name,获取到的租房者信息:$message")
    }
}