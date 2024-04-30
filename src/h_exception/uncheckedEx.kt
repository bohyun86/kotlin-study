package h_exception

import java.io.BufferedReader
import java.io.FileReader

fun main() {
    fun readFileClose() {
        BufferedReader(FileReader("README.md")).use {
                reader ->  println(reader.readLine())
        }
        // use 블록이 끝나면서 자원이 정리가 됨.
    }
}