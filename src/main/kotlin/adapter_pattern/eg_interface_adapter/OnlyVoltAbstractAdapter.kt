package adapter_pattern.eg_interface_adapter

abstract class OnlyVoltAbstractAdapter : Volt {
    override fun getUSAVolt220(): Int {
        return 220
    }

    override fun getUSAVoltNotNeededThird() {
        TODO("Not yet implemented")
    }

    override fun getUSAVoltNotNeededSecond() {
        TODO("Not yet implemented")
    }

    override fun getUSAVoltNotNeededFirst() {
        TODO("Not yet implemented")
    }
}