package composite_pattern

/**
 * 抽象根节点
 */
abstract class Component(protected open var name: String) {
    abstract fun doSomething()
}