package tag.oop

open class Person(val name: String, age: Int) {

    open var age: Int = age
        set(v) = if (v in 1..129) { field = v                            }
                             else { throw RuntimeException("Wrong age.") }

    open fun greet(){
        println("Hello! My name is $name. I am $age.")
    }

    override fun toString(): String {
        return "Person(name: $name, age: $age)"
    }

}