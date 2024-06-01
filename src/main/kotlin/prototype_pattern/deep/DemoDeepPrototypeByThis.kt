package prototype_pattern.deep

import prototype_pattern.Person
import prototype_pattern.shallow.ShallowPrototype

fun main() {
    val person = Person("Prototype",20)
    val deepPrototypeByThis = DeepPrototypeByThis(person)
    val copyDeepPrototypeByThis = deepPrototypeByThis.clone()
    //实现了深拷贝
    person.name = "New Prototype"
    deepPrototypeByThis.sayHello()
    copyDeepPrototypeByThis.sayHello()
}
