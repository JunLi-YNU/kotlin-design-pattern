package facade_pattern

class PhoneImpl : Phone {
    override fun dail() {
        println("Dail")
    }

    override fun hangup() {
        println("Hangup")
    }
}