package tag.hello.oop

interface Employee {
    var salaryInDay: Int
    var moneyOnAcc: Int

    fun work()
    fun withdrawMoney(moneys: Int = moneyOnAcc): Int {
        return if(moneyOnAcc >= moneys) { moneyOnAcc -= moneys; moneys                                 }
               else                     { val withdrawal: Int = moneyOnAcc; moneyOnAcc = 0; withdrawal }
    }
}