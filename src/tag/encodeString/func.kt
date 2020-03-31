package tag.encodeString


fun encodeString(inputString: String): String {
    var symbols: Int = 1
    var previousSymbol: String = "awb90"
    var newString: String = ""
    for(iSym in inputString.indices) {
        if (iSym == 0) {
            newString = inputString[iSym].toString()
            previousSymbol = newString
            continue
        }

        if(inputString[iSym].toString() == previousSymbol) symbols += 1
        else {
            newString += symbols.toString() + inputString[iSym]
            previousSymbol = inputString[iSym].toString()
            symbols = 1
        }
    }
    newString += symbols.toString()

    return newString
}