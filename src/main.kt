fun main(){
    var account=Account("Rehema", "you have remain with",30000)

    account.Deposit(5500)
    account.Borrow(15000)




}
class Account(var name: String, var description: String, var amount: Int) {

    fun withdraw(money: Int) {
        println(money)
    }


    fun Deposit(cash: Int) {
        println("Dear Customer the current amount is ksh$Amount and you have deposited ksh$cash")
    }

    fun Borrow(lend: Int): Int {
        var x = Amount - lend
        if (lend <= Amount) {
            println("you have recieved $lend")
        } else {
            println("Denied Loan of $lend")
        }
        return x
    }
}




