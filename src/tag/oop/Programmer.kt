package tag.oop

class Programmer(name: String, age: Int, override var salaryInDay: Int, override var moneyOnAcc: Int = 0) : Person(name, age), Employee {
    // Overriding interface Employee:
    override fun work(days: Int) {
        moneyOnAcc += salaryInDay
    }
    @Synchronized override fun withdrawMoney(): Int {
        return super.withdrawMoney()
    }

    // Overriding class Person
    override fun greet(){
        println("Hello! My name is $name. I am $age. I am a programmer and I earn $salaryInDay.")
    }
    override fun toString(): String {
        return "Worker(name: $name, age: $age, salaryInDay: $salaryInDay, moneyOnAcc: $moneyOnAcc)"
    }
}
