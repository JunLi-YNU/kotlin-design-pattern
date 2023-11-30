package bridge_pattern

class RefinedAbstraction(private val implementor: Implementor) : Abstraction(implementor){
    fun refinedOperation(){
        println("Refined abstraction operation.")
        implementor.operationImpl()
    }
}