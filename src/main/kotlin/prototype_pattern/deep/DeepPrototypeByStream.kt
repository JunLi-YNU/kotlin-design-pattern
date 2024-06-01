package prototype_pattern.deep

import prototype_pattern.Person
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.ObjectInputStream
import java.io.ObjectOutputStream
import java.io.Serializable

class DeepPrototypeByStream(private var person: Person) : Serializable {
    fun seyHello() {
        println("${person.name},${person.age} Hello")
    }
   fun <T : Any> myClone(t: T): T {
        //将对象写入文件
        val objectOutputStream = ObjectOutputStream(object : FileOutputStream("copy_class.text") {})
        objectOutputStream.writeObject(t)
        objectOutputStream.close()
        //读取对象
        val objectInputStream = ObjectInputStream(object : FileInputStream("copy_class.text") {})
        val obj = objectInputStream.readObject() as T
        objectInputStream.close()
        return obj
    }
}