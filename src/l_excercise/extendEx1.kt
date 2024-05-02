package l_excercise

abstract class Animal() {
    abstract fun eat()
}

interface FlyingAnimal {
    fun fly() {
        println("날개짓 합니다.")
    }
}

interface SwimmingAnimal {
    fun swim() {
        println("헤엄을 칩니다.")
    }
}

class Bird(val name: String): Animal(), FlyingAnimal {

    override fun eat() {
        println("${name}가 씨앗을 먹습니다.")
    }
}
class Fish(val name: String): Animal(), SwimmingAnimal {
    override fun eat() {
        println("${name}가 플랑크톤을 먹습니다.")
    }

}
class Duck(val name: String): Animal(), FlyingAnimal, SwimmingAnimal {
    override fun eat() {
        println("${name}가 풀속에 있는 벌레를 먹습니다.")
    }

    override fun fly() {
        println("${name}가 물에서 날아오릅니다.")
    }

    override fun swim() {
        println("${name}가 연못을 헤업칩니다.")
    }
}


fun main() {
    val bird = Bird("앵무새")
    val fish = Fish("금붕어")
    val duck = Duck("청둥오리")

    bird.eat()
    bird.fly()

    fish.eat()
    fish.swim()

    duck.eat()
    duck.fly()
    duck.swim()
}