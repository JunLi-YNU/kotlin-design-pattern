package prototype_pattern.shallow

import prototype_pattern.Person


fun main() {
    val person = Person("Prototype",10)
    val shallowPrototype = ShallowPrototype(person)
    val copyShallowPrototype = shallowPrototype.clone()
    //Person 类没有被clone 需要使用深克隆
    person.name = "New Prototype"
    shallowPrototype.sayHello()
    copyShallowPrototype.sayHello()
    println(copyShallowPrototype === shallowPrototype)
}