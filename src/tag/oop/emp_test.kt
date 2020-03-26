package tag.oop

fun main() {
    val person: Programmer = Programmer("Larry", 29, 40)

    person.greet()

    person.work(5)
    println("Вы сняли: ${person.withdrawMoney()}") // 200
    println(person.moneyOnAcc)

    person.work(3)
    println("Вы сняли: ${person.withdrawMoney(200)}") // 120
}