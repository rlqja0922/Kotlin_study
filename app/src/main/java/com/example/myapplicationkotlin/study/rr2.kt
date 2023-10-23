package com.example.myapplicationkotlin.study
//Lamda

val square = {number : Int-> number*number}

val nameAge = {name :String,age :Int-> "name is $name i', $age"}

fun main(){
    println(square(12))
    println(nameAge("기범",28))
    val a = "기범은"
    val b = "준혁쿤은"
    println(a.pizzzaIsGreet())
    println(b.pizzzaIsGreet())
    println(extendString("fkaek",27))
    println(cal(50))

    val lamda = {number : Double -> number == 4.3213}
    println(invoke (lamda))
    println(invoke { it > 3.22 })
    invoke { it > 3.22 }
}

val pizzzaIsGreet : String.() -> String = {this + "Pizza is love"}

fun extendString(name: String, age:Int) : String {
    val introduceMyself : String.(Int) -> String = {"I am ${this} and ${it} years old"}
    return name.introduceMyself(age)
}

val cal : (Int)->String = {
    when(it){
        in 0..40 -> "f"
        in 41..70 -> "d"
        in 70..100->"A"
        else -> "b"

    }
}
fun invoke(lamda : (Double) -> Boolean) : Boolean {
    return lamda(5.2343)
}

