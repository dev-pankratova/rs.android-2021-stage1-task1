package subtask3

class StringParser {

    fun getResult(inputString: String): Array<String> {
        val openingBrackets = "<(["
        val closingBrackets = ">)]"
        val list: MutableList<String> = mutableListOf()
        val builder = StringBuilder()
        var indexOfBracket: Int?
        var counter: Int?

        for (i in inputString.indices) {
            if (openingBrackets.contains(inputString[i])) {
                indexOfBracket = openingBrackets.indexOf(inputString[i])
                counter = 1

                for (j in i + 1 until inputString.length) {
                    if (inputString[j] == openingBrackets[indexOfBracket])
                        counter++
                    else if (inputString[j] == closingBrackets[indexOfBracket]) {
                        counter--
                        if (counter == 0) {
                            list.add(builder.toString())
                            builder.clear()
                            break
                        }
                    }
                    builder.append(inputString[j])
                }
            }
        }
        return list.toTypedArray()
    }
}