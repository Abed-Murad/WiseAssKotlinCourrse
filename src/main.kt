const val ADD: String = "+"
const val SUBTRACT: String = "-"
const val MULTIPLY: String = "*"
const val DIVIDE: String = "/"

const val ERROR_MESSAGE = "An error has occurred."
const val testOperandOne: Double = 5.0
const val testOperandTwo: Double = 4.0

fun main(args: Array<String>) {
    val operatorSymbol = args[0]
    start(operatorSymbol)
}

fun start(operatorSymbol: String) {
    if (checkArguments(operatorSymbol)) {
        displayResult(evaluateBinomial(testOperandOne, testOperandTwo, operatorSymbol))
    } else {
        displayResult(ERROR_MESSAGE)
    }
}

//Single expression syntax (for single line code snippets)
fun displayResult(result: String) = System.out.println(result)

fun evaluateBinomial(opOne: Double, opTwo: Double, sym: String): String {
    return when (sym) {
        ADD -> (opOne + opTwo).toString()
        SUBTRACT -> (opOne - opTwo).toString()
        MULTIPLY -> (opOne * opTwo).toString()
        DIVIDE -> (opOne / opTwo).toString()
        else -> ERROR_MESSAGE
    }

}

fun checkArguments(operatorSymbol: String): Boolean {
    return when (operatorSymbol) {
        ADD -> true
        SUBTRACT -> true
        MULTIPLY -> true
        DIVIDE -> true
        else -> false
    }
}
