package proxy_pattern

fun main(){
    val realSubject = RealSubject()
    val proxySubject = ProxySubject(realSubject)
    proxySubject.visit()
}