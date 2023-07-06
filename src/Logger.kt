package src

object Logger {

    fun i(messsge: String) {
        println("Log Info : $messsge")
    }

    fun e(errorMessage: String) {
        println("Log Error : $errorMessage")
    }
}