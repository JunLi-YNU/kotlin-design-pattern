package adapter_pattern.eg_interface_adapter

class OnlyVoltAdapter : OnlyVoltAbstractAdapter() {
    override fun getUSAVolt220(): Int {
        return super.getUSAVolt220()
    }
}