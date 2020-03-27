package tag.hello.oop

import tag.hello.oop.Employee
import tag.hello.oop.Person

class Programmer(name: String, age: Int, override var salaryInDay: Int, override var moneyOnAcc: Int = 0) : Person(name, age), Employee {
    override fun work() {
        moneyOnAcc += salaryInDay
    }
    fun work(days: Int) {
        moneyOnAcc += salaryInDay * days
    }
    @Synchronized override fun withdrawMoney(moneys: Int): Int {
        return super.withdrawMoney(moneys)
    }

    // Overriding class Person
    override fun greet(){
        println("Hello! My name is $name. I am $age. I am a programmer and I earn ${salaryInDay*30} dollars.")
    }
    override fun toString(): String {
        return "Worker(name: $name, age: $age, salaryInDay: $salaryInDay, moneyOnAcc: $moneyOnAcc)"
    }
}
