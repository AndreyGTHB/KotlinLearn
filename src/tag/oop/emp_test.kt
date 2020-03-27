package tag.oop

fun main() {
    val person = Programmer("Larry", 32, 40)

    person.greet()

    person.work(5)
    println("Вы сняли: ${person.withdrawMoney()}") // 200
    println(person.moneyOnAcc) // 0

    person.work(3)
    println("Вы сняли: ${person.withdrawMoney(200)}") // 120
}