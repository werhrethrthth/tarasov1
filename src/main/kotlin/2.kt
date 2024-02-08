package org.example

fun main() {
    print("Введите число лайков")

    val likes = readln().toInt()
    if (likes%10==1){
        print("Понравилось человеку")
    }
    else println("Понравилось людям")
}