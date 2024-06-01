package prototype_pattern.deep

import prototype_pattern.Person

fun main() {
    val person = Person("Prototype",30)
    val deepPrototypeByStream = DeepPrototypeByStream(person)
    val copy = deepPrototypeByStream.myClone(deepPrototypeByStream)
    person.name = "New Prototype"
    deepPrototypeByStream.seyHello()
    copy.seyHello()
}