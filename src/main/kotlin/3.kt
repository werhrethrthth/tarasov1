package org.example

fun main() {
    println("Введите сумму подписки ")
    val a = readln().toInt()
    if (a<=1001)
    {
        println("нет скидки")
    }
    if (a>1000 && a<=10000 )
    {
        println("100р скидка")
    }
    else
    {
        var b = (a*5)/100
        println(b)
    }
}