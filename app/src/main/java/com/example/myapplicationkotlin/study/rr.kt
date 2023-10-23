package com.example.myapplicationkotlin.study


fun main(){
//    val name = "dlarlqja"
//    val name2 = "rlrlrl"
//    hellowWold()
//    println(add(3,4))
//    println("my name is ${name + name2} i'm 28   this is \$a")


    //조건식

//    checkNum(1)
    //반복문

    ignoreNulls("null")
}

fun hellowWold() {
    println("hello World!")
}
fun add(a : Int, b : Int) : Int{
    return a + b
}
fun hi(){
    val a : Int = 10
    var b : Int = 9
    b = 11
//    a = 22  val 은 재 할당 안됨
    val c =11
    var d ="임기범"
}

fun maxBy(a : Int , b : Int) : Int{
    if(a>b){
        return a
    }else return b
}
fun maxby2(a: Int,b: Int) = if (a>b) a else b
fun checkNum(score :Int) : Unit{
    when(score){
        0 -> println("0")
        1 -> println("1")
        2,3 -> println("2,3")
        else -> println("다른것들") // 없어도됨 fun에있으면
    }
    var b = when(score){
        1 -> 1
        2 -> 2
        else -> 3
    }
    println("b :$b")
    when(score){
        in 90..100 -> println("genius")
        in 10..80 -> println("not bad")
        else -> println("ok") //없어도됨
    }
}
//Expression (코틀린)리턴값 없어도 Unit 을 리턴함 vs Statement 명령을 지시 하는 것들

//Array, list

fun array(){
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)
    val array2 = arrayOf(1,"d",3.4f)
    val list2 = listOf(1,"d",21L)

    array[0] = 3
    var result = list.get(0)
    var arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
    arrayList.add(30)
}


//반복분  for while

fun forAndWhile(){
    val students = arrayListOf("rlqja","tmdal","tnwjd","dnjsgh")
    for (name in students){
        println("$name")
    }
    for ((index,name)in students.withIndex()){
        println("${index+1} 번째 학생 : $name")
    }
    var sum = 0
    for (i in 1 until students.size){ // step downTo untile 등이있다
        sum += i
    }
    println(sum)
    var index =0
    while (index <10){
        println("$index")
        index++
    }
}

// Nonnull Nullable

fun nullcheck(){
    var name = "dlarlqja"
    var nullName : String? = null
    var nameUpperCase = name.toUpperCase()
    var nullNameUpperCase = nullName?.toUpperCase()

    // ?:
    val lastName : String? =  "null을 넣을수있음"
    val fullName = name + " "+ (lastName?: "No lastname")
    println("$fullName")

}
fun ignoreNulls(str : String?){
    // !! Nullable 타입 이지만 확실히 NULL 이 아닐시 아닌 것 처럼 쓸 수있게
    val mNotNull : String = str!!
    val upper = mNotNull.toUpperCase()

    val email : String? ="ljt123123123123@adfa.asdf"
    email?.let{//자신의 객체를 람다식 내부로 옮겨줌
        println("email  = $it")
    }
}
