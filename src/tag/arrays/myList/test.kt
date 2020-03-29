package tag.arrays.myList

fun main() {
    var list = MyList<String>("first")
    println(list)

    // Test 1(add)
    try {
        list.add("second")
        list.add("third")
        println("Test 1 completed")
    }
    catch(ex: KotlinNullPointerException) { println("Test 1 failed") }

    // Test 2(get)
    try {
        val zeroEl: String = list.get(0) // first
        val firstEl: String = list.get(1) // second
        if(zeroEl == "first" && firstEl == "second") println("Test 2 completed")
        else println("Test 2 failed")
    }
    catch(ex: KotlinNullPointerException) {println("Test 2 failed")}

    // Test 3(remove)
    try {
        list.remove(1)
        if(list.get(0) == "first" && list.get(1) == "third") println("Test 3 completed")
        else println("Test 3 failed")
    }
    catch(ex: Exception) {println("Test 3 failed")}
}