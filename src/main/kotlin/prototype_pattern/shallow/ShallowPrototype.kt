package prototype_pattern.shallow

import prototype_pattern.Person

class ShallowPrototype(private val person: Person) :Cloneable {

    private val hello = "Shallow Prototype say hello. "
    fun sayHello(){
        println("$hello:${person.name},${person.age}")
    }
    public override fun clone(): ShallowPrototype {
        return super.clone() as ShallowPrototype
    }
}