package tag.oop

interface Employee {
    var salaryInDay: Int
    var moneyOnAcc: Int

    open fun work(days: Int)
    open fun withdrawMoney(moneys:Int = moneyOnAcc): Int {
        if(moneyOnAcc >= moneys) {
            moneyOnAcc -= moneys
            return moneys
        }
        else {
            var withdrawal: Int = moneys - moneyOnAcc
            moneyOnAcc = 0; return withdrawal
        }
    }
}