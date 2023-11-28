package decorator_pattern

abstract class Decorator(component: Component):Component()  {
    private var component:Component? = component

    override fun operate() {
        this.component?.operate()
    }
}