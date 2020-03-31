package tag.arrays.myList

fun main() {
    val list = MyList<String>("first")

    println(list.size) // 0
    list.add("second")
    val second: String = list.remove(1)
    println(second)
    println(list.size)
}