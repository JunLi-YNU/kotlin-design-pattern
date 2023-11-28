package decorator_pattern

class ConcreteDecoratorFirst(component: Component) : Decorator(component){
    override fun operate() {
        //为基础组建添加装饰类的具体操作方法
        operateFirst()
        super.operate()
        operateSecond()
    }
    private fun operateFirst(){
        println("Concrete decorator first operate first.")
    }
    private fun operateSecond(){
        println("Concrete decorator second operate second.")
    }
}