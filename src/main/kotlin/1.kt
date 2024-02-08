package org.example

fun main() {
    print("Введите число: ")
    val amount = readln().toInt()
    val b = (amount*0.75)/100
    println("Комиссия:" +b)
}