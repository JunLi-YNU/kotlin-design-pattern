package decorator_pattern

fun main(){
    val component:Component = ConcreteComponent()
    val decorator:Decorator = ConcreteDecoratorFirst(component)
    decorator.operate()
}