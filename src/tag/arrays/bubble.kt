package tag.arrays


fun main() {
    val sorted: IntArray = bubbleSort(listOf("10", "8", "5", "11", "1"))
    for(el in sorted) { println(el) }
}

fun bubbleSort(inputList: List<String>): IntArray {
    var emptyArr: Array<Int> = emptyArray<Int>()
    for(el in inputList) {
        emptyArr += el.toInt()
    }
    var outputArr: IntArray = emptyArr.toIntArray()

    var deletedBElement: Int
    for((a_index, a_val) in outputArr.withIndex()) {
        var a_var: Int = a_val
        for((b_index, b_val) in outputArr.withIndex()) {
            if(a_var.toInt() > b_val.toInt() && b_index > a_index) {
                deletedBElement = b_val.toInt()
                print("$deletedBElement  ")
                outputArr[b_index] = a_var
                println(deletedBElement)
                outputArr[a_index] = deletedBElement
                a_var = deletedBElement
                println("A: ${outputArr[a_index]} B: ${outputArr[b_index]}")
            }
        }
    }

    return outputArr
}