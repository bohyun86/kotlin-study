package j_class

class BackAccount() {
    private var balance: Int = 0

    fun deposit(money: Int) {
        balance += money
    }

    fun withdraw(money: Int) {
        if (balance < money) {
            println("잔액이 부족합니다.")
            return
        }
        balance -= money
    }

    fun getBalance() {
        println(balance)
    }
}

fun main() {
    val balance = BackAccount()
    balance.deposit(5000)
    balance.withdraw(2000)
    balance.getBalance()
    balance.withdraw(4000)
}

