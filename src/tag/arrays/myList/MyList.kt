package tag.arrays.myList

data class MyList<T> (var value: T) {
    var next: MyList<T>? = null

    fun add(v: T) {
        var el: MyList<T>? = this
        while(el!!.next != null) el = el!!.next
        el.next = MyList<T>(v)
    }
    fun get(index: Int): T {
        var el = this
        for(iEl in 0..index) if(iEl != 0) el = el.next!!
        return el.value
    }
    fun remove(i: Int): MyList<T>? {
        var index: Int = i
        if(i > 0) index -= 1

        var el: MyList<T>? = this
        for(iEl in 0..index) if(iEl != 0) el = el!!.next

        el!!.next = el.next!!.next
        return el!!.next
    }
    fun removes(v: T): Array<Int> {
        var el: MyList<T>? = this
        var indices: Array<Int> = emptyArray()

        var i: Int = 0
        while(el!!.next != null) {
            el = el.next
            if(el!!.value == v) {
                indices += i
                remove(i)
            }
            i ++
        }

        return indices
    }
}