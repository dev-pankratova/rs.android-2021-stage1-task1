package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        val myList: ArrayList<Int> = sadArray.toCollection(ArrayList())
        var s: Int = myList.size - 2
        var t: Int?
        for (f in 1..3) {
            if (myList.isEmpty()) break
            for (i in 1..s) {
                if (myList[i] == myList.last()) break
                t = myList[i - 1] + myList[i + 1]
                if (t < myList[i]) {
                    myList.removeAt(i)
                    s--
                } else {
                    myList.iterator().next()
                }
            }
        }
        return myList.toIntArray()
    }
}