package tag.klasses

fun main() {
    val p: Person = Person("Tom", 11)

    // Test 1
    println(p)
    p.greet()

    //Test 2
    p.age += 10
    println(p.age) // 21

    //Test 3
    try {
        p.age = -5
    }
    catch(ex: RuntimeException) {
        println(ex.localizedMessage)
    }
}