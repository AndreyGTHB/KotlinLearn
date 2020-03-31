package tag.arrays.myList

fun main() {
    val list = MyList<String>("first")
    for(str in arrayOf("second", "third", "fourth"))  list.add(str)

    list.println()
    println(list)
}