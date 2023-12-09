package mediator_pattern.eg

fun main() {
    //创建一个中介者对象
    val concreteMediator = ConcreteMediator()
    //创建一个租房者对象
    val tenant = Tenant("Kotlin",concreteMediator)
    //创建一个房东对象
    val houseOwner = HouseOwner("Java", concreteMediator)
    concreteMediator.tenant = tenant
    concreteMediator.houseOwner = houseOwner

    tenant.communicate("需要一个虚拟机")
    houseOwner.communicate("有JVM虚拟机可供使用")
}