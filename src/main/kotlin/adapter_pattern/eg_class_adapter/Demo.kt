package adapter_pattern.eg_class_adapter

fun main() {
    val voltAdapter = VoltAdapter()
    println("类适配器有污染: 可以获取到原始电压")
    println("Class Adapter: Current output volt: ${voltAdapter.getVolt220()} V")
    println("将原始电压: 220v 适配后得到 目标电压: 5v")
    println("Class Adapter: Current output volt: ${voltAdapter.getVolt5()} V")
}