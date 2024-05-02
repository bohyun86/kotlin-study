package l_excercise

fun main() {
    val smartphone = Smartphone()
    smartphone.makeCall()
    smartphone.takePhoto()
}

interface Camera {
    fun takePhoto() {
        println("사진을 찍습니다.")
    }
}

interface Phone {
    fun makeCall()
    fun takePhoto() {
        println("폰으로 사진을 찍습니다.")
    }
}

class Smartphone(): Camera, Phone {
    override fun takePhoto() {
        super<Phone>.takePhoto()
    }

    override fun makeCall() {
        println("전화를 겁니다.")
    }
}