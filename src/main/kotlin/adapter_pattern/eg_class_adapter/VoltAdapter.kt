package adapter_pattern.eg_class_adapter

class VoltAdapter : AdapteeVolt220(), TargetVolt5 {
    override fun getVolt5(): Int {
        return getVolt220() - 215
    }
}