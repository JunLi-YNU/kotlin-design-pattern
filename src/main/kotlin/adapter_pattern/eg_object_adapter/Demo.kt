package adapter_pattern.eg_object_adapter

fun main() {
    val adapter = VoltAdapter(object : AdapteeVolt220 {})
    println("将原始电压: 220v 适配后得到 目标电压: 5v")
    println("Object Adapter: Current volt ${adapter.getVolt5()} V")
}