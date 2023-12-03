package proxy_pattern

class ProxySubject(private val realSubject: RealSubject) : Subject(){
    override fun visit() {
        realSubject.visit()
    }
}