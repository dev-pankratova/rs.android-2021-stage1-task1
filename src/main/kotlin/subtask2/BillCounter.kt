package subtask2

class BillCounter {

    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val outputInfo: String
        val myList: ArrayList<Int> = bill.toCollection(ArrayList())
        val sumBill = myList.sum()
        //сумма оплаты для каждого с учётом вычета аллергенного блюда
        val billPersonal = (sumBill - myList[k]) / 2
        outputInfo = if (billPersonal == b) "Bon Appetit"
        else {
            (b - billPersonal).toString()
        }
        return outputInfo
    }
}