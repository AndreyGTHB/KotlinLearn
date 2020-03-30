package tag.arrays.myList

fun main() {
    val list = MyList<String>("first")
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
    catch(ex: KotlinNullPointerException) {println("Test 2 failed (exception)")}

    // Test 3(remove)
    try {
        list.remove(1)
        if(list.get(0) == "first" && list.get(1) == "third") println("Test 3 completed")
        else                                                 println("Test 3 failed")
    }
    catch(ex: Exception) {println("Test 3 failed (exception)")}

    // Test 4(removes)
    try {
        // Some acts...
        for(el in arrayOf("rep", "not rep", "rep", "rep", "not rep too", "not rep early"))     list.add(el)

        val indices: Array<Int> = list.removes("rep")
        if(indices.size == 3 && list.get(2) == "not rep") println("Test 4 completed")
        else                  println("Test 4 failed (Wrong output data)")
    }
    catch(ex: Exception) {println("Test 4 failed (throed exception)")}
	
	// Test 5(size)
	try {
        val list2 = MyList<String>("sa")
		val firstSize: Int = list2.size // 5
		list2.add("sixth")
		val secondSize: Int = list2.size // 6
		
//		if(firstSize == 5 && secondSize == 6) println("Test 5 completed")
//		else println("Test 5 failed (wrong output data)")
        println("first: $firstSize second: $secondSize")
	}
	catch(ex: Exception) { println("Test 5 failed (exception)") }

}



