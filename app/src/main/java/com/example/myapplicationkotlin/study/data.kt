package com.example.myapplicationkotlin.study

//dataclass

data class dataex(val com : String, val name : String, var data : String, var seatNum : Int)

class dataex2(val com : String, val name : String, var data : String, var seatNum : Int)
fun main(){

//dataclass
//    val tiketa = dataex("dlarlqja","wlsWKsk","20232323",28)
//    val tiketb = dataex2("dlarlqja","wlsWKsk","20232323",28)
//    println(tiketa)
//    println(tiketb)

//컴패니엄오브젝트

    val book = Book.create()
    println("${book.id}  ${book.name}")
    val bookid = Book.getid()
    println("${bookid}")
}

//컴패니엄오브젝트

class Book private constructor(val id: Int, val name:String){
    companion object Bookfactory : Id {
        val myBook = "mybook"
        fun create()= Book(getid(), myBook)
        override fun getid() : Int{
            return 28
        }
    }
}
interface Id{
    fun getid():Int
}
