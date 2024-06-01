package prototype_pattern.deep

import prototype_pattern.Person
import prototype_pattern.shallow.ShallowPrototype

class DeepPrototypeByThis(private var person: Person) : Cloneable{
    private val hello = "Shallow Prototype say hello. "
    fun sayHello(){
        println("$hello:${person.name},${person.age}")
    }
    public override fun clone(): DeepPrototypeByThis {
        val copy = super.clone() as DeepPrototypeByThis
        copy.person = this.person.copy()
        return copy
    }

}