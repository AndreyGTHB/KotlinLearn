package tag.arrays.myList

fun main() {
    var list = MyList<String>("first")

    // Test 1
    try {
        list.add("second")
        println("Test 1 completed")
    }
    catch(ex: KotlinNullPointerException) { println("Test 1 failed") }

    // Test 2
    try {
        val zeroEl: String = list.get(0) // first
        val firstEl: String = list.get(1) // second
        if(zeroEl == "first" && firstEl == "second") println("Test 2 completed")
    }
    catch(ex: KotlinNullPointerException) {println("Test 2 failed")}
}