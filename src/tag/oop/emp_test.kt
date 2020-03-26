package tag.oop

fun main() {
    val person: Programmer = Programmer("Larry", 29, 40)

    person.greet()

    person.work(5)
    print("Вы сняли: ${person.withdrawMoney(200)}") // 200

    person.work(3)
    print("Вы сняли: ${person.withdrawMoney(200)}") // 120
}