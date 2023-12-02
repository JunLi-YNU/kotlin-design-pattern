package composite_pattern

/**
 * 具体枝干节点
 */
class Composite(protected override var name: String) : Component(name) {
    private var components = mutableListOf<Component>()

    override fun doSomething() {
        println(name)
        components.forEach {
            it.doSomething()
        }
    }

    fun addChild(child: Component) {
        components.add(child)
    }

    fun removeChild(child: Component) {
        components.remove(child)
    }

    fun getChild(index: Int):Component {
        return components[index]
    }
}