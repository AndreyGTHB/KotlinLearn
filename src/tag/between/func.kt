package tag.between

fun <T : Any> insertBetween(arr: Array<T>, first: T, second: T): Int? {
    for (i in arr.indices) {
        if (arr[i] == second) { return i - 1 }
        if (arr[i] == first) {
            if (i == arr.size - 1) { return null }
            if (arr[i+1] != first) { return i + 1 }
        }
    }
    return null
}