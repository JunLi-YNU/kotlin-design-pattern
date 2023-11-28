package facade_pattern

class IPhone {
    private val iPhone = PhoneImpl()
    private val iPhoneCamera = PhoneCamera()
    fun dail() {
        iPhone.dail()
    }

    fun videoChat() {
        println("Video chat open")
        iPhoneCamera.open()
        iPhone.dail()
    }

    fun hangup() {
        iPhone.hangup()
    }

    fun takePicture() {
        iPhoneCamera.open()
        iPhoneCamera.takePicture()
    }

    fun closeCamera() {
        iPhoneCamera.close()
    }
}