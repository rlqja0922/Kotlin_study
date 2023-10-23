package com.example.myapplicationkotlin.study

open class Human constructor(val name: String = "rlqja"){
    constructor(name: String, age : Int) : this(name){
        println("my name is ${name} , ${age}years old")
    }


    init {
        println("New 뭐시꺵이")
    }
    fun eatingCake(){
        println("this is so YUMY~")
    }
    open fun singAsong(){
        println("lalalalala")
    }
}
class Korea : Human(){
    override fun singAsong(){
        super.singAsong()
        println("fkfkf라라라")
        println("my name is ${name}")
    }

}

fun main(){
//    val human = Human("임기범")
//    val stranger = Human()
//    human.eatingCake()
//    println("이름은 ${human.name}")
//    val mom = Human("rlqja11",28)
    val korea = Korea()
    korea.singAsong()
}