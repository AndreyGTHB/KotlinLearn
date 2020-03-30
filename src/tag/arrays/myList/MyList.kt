package tag.arrays.myList

data class MyList<T> (private var value: T) {
    private var next: MyList<T>? = null
	
	val size: Int
		get() {
			var el: MyList<T> = this
			var siz: Int = 0
			while(el.next != null) {
				siz ++
				el = el.next
			}
			return siz
		}

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
    fun removes(v: T): Int {
        var el: MyList<T>? = this
        var values: Int = 0

        var i: Int = 0
        while(el!!.next != null) {
            el = el.next
            if(el!!.value == v) {
                values ++
                remove(i)
            }
            i ++
        }

        return values
    }
	
	protected fun checkHard(operations: Int, iterations: Int) {
		return operations * iterations + 2
	}
}