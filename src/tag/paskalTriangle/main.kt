package tag.paskalTriangle


fun main() {
    pascalTriangle(7)
    
}


fun pascalTriangle(rows: Int) {
    if (rows <= 0) return

    val triangle: Array<Array<Int>> = Array(rows) { Array(rows + 1) { 0 } }
    triangle[0][1] = 1
    var newLine: Array<Int>

    var value: Int
    for(line in 0 until rows) {
        if(line == 0) {println(triangle[0][1]); continue}

        newLine = triangle[line]
        for(el in 0..line) {
            value = 0
            value += triangle[line - 1][el] + triangle[line - 1][el + 1]
            newLine[el + 1] = value
            print("$value")
            if(el != line) print('.')
        }

        triangle[line] = newLine
        println()
    }
}
