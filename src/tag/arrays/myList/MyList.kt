package tag.arrays.myList

data class MyList<T> (private var value: T) {
    private var next: MyList<T>? = null
	
	val size: Int
		get() {
		var siz: Int = 1
		var el: MyList<T> = this
			while(el.next != null) {
				siz += 1
				el = el.next!!
			}
			return siz
		}

    fun add(v: T) {
        var el: MyList<T> = this
        while(el.next != null) el = el.next!!
        el.next = MyList<T>(v)
    }
    fun get(index: Int): T {
        var el: MyList<T> = this
        for(iEl in 0..index) if(iEl != 0) el = el.next!!
        return el.value
    }
    fun remove(i: Int): T {
        var el: MyList<T>? = this
        for(iEl in 0 until i)  if(iEl != 0) el = el!!.next

        val lastValue: T = el!!.value
        el.next = el.next!!.next

        return lastValue
    }
    fun removes(v: T): Int {
        var el: MyList<T> = this
        var values: Int = 0

        var index: Int = 0
        for(i in 0 until size) {
            if(el.value == v) {
                values ++
                remove(index)
                index --
            }
            if(index < size-1)   el = el.next!!
            index ++
        }

        return values
    }

    fun set(i: Int, value: T): T {
        var el: MyList<T> = this
        for(iEl in 0..i) if(iEl != 0) el = el.next!!

        val lastValue: T = el.value
        el.value = value
        return lastValue
    }

    fun println() {
        var el: MyList<T>? =  this
        for(i in 0 until size) {
            println(el!!.value)

            el = el.next
        }
    }


    override fun toString(): String {
        var str: String = "["

        var el: MyList<T>? = this
        val s: Int = size
        for(i in 0 until s) {
            str += if(i < s-1) { el!!.value.toString() + ", " }
                   else        { el!!.value.toString() }

            el = el!!.next
        }

        str += "]"
        return str
    }
}



