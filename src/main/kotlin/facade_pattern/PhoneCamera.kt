package facade_pattern

class PhoneCamera : Camera{
    override fun open() {
        println("Open camera")
    }

    override fun takePicture() {
        println("Take picture")
    }
    override fun close() {
        println("Close camera")
    }
}