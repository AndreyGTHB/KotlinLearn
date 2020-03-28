package tag.paskalTriangle


fun main() {
    pascalTriangle(4)
}


fun pascalTriangle(rows: Int) {
    var valueArr: Array<Array<Int>> = emptyArray<Array<Int>>()
    var arrOfStr: Array<Int> = emptyArray()
    var value: Int

    for(i in 0 until rows) {
        valueArr.plus(emptyArray<Int>())
        for(el in 0 until i) {
            value = 1

            value += try                                       { valueArr[i-1][el-1] }
                     catch(ex: ArrayIndexOutOfBoundsException) { 0                   }
            value += try                                       { valueArr[i-1][el] }
                     catch(ex: ArrayIndexOutOfBoundsException) { 0                 }

            valueArr[i].plus(value)
            print(value)
        }
    }
}