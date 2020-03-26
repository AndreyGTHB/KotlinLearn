package tag.klasses

class Employee(name: String, age: Int,salary: Int): Person(name, age) {
    override var age: Int = super.age
        set(v) = if (v in 18..80) { field = v                            }
                             else { throw RuntimeException("Wrong age.") }

    var salary: Int = salary
        set(v) = if (v in 300..100000) { field = v                            }
                                  else { throw RuntimeException("Wrong salary.") }

    override fun greet() {
        println("Hello! My name is $name. I am $age. And I earn $salary dollars.")
    }

    override fun toString(): String {
        return "Employee(name: $name, age: $age, salary: $salary)"
    }
}