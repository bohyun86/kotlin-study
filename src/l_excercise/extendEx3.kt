package l_excercise

fun main() {
    val printer = MultifunctionPrinter()
    printer.printDocument()
    printer.scanDocument()
}

interface Printable {
    fun printDocument() {
        println("문서를 출력합니다.")
    }

}

interface Scannable {
    fun scanDocument() {
        println("문서를 스캔합니다.")
    }
}

class MultifunctionPrinter: Printable, Scannable