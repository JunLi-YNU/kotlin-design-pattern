package adapter_pattern.eg_object_adapter

class VoltAdapter(private val adapteeVolt220: AdapteeVolt220) : TargetVolt5 {
    override fun getVolt5(): Int {
        return adapteeVolt220.getVolt220() - 215
    }
}