package proxy_pattern

class RealSubject : Subject() {
    override fun visit() {
        println("需要被代理类的具体业务")
    }
}