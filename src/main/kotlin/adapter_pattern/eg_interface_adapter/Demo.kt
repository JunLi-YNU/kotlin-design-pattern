package adapter_pattern.eg_interface_adapter

fun main() {
    val onlyVoltAdapter = OnlyVoltAdapter()
    println("只用到唯一一个接口方法:")
    println("Interface Adapter: current volt ${onlyVoltAdapter.getUSAVolt220()}")
    println("为实现方法:")
    println("Interface Adapter: current volt ${onlyVoltAdapter.getUSAVoltNotNeededFirst()}")
}