package com.example.myapplicationkotlin.study



//Singleton Pattern
object CarFactory{
    val cars = mutableListOf<Car>()
    fun makeCar(horsePower: Int): Car {
        val car = Car(horsePower)
        cars.add(car)
        return car
    }
    fun removeCar(horsePower : Int): Car {
        val car = Car(horsePower)
        cars.remove(car)
        return car
    }
}
data class Car(val horsePower :Int)

fun main(){
    val car = CarFactory.makeCar(10)
    val car2 = CarFactory.makeCar(100)
    CarFactory.removeCar(120)
    println(car)
    println(car2)
    println(CarFactory.cars.size)
    val ex1 = ex()
    ex1.main()

}
class ex{

        fun main(){
            val car3 = CarFactory.makeCar(10)
            val car4 = CarFactory.makeCar(200)
            CarFactory.removeCar(10)
            println(car3)
            println(car4)
            println(CarFactory.cars.size)
            for (print in CarFactory.cars){
                println("${print.horsePower}")
            }
        }

}