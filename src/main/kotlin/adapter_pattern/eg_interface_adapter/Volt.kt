package adapter_pattern.eg_interface_adapter

interface Volt {
    fun getUSAVolt220(): Int
    fun getUSAVoltNotNeededFirst()
    fun getUSAVoltNotNeededSecond()
    fun getUSAVoltNotNeededThird()
}