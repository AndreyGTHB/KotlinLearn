package tag.encodeString


fun encodeString(inputString: String): String {
    var symbols = 1
    var previousSymbol = "awb90"
    var newString = ""
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