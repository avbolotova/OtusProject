package hw8

import java.util.*

fun main(){
}
interface Unit {
    var personCount: Int
}
open class Department(override var personCount: Int) : Unit {
    private val name: String = ""
    private val employees: Set<Employee> = setOf()
    fun addEmployee(employee: Employee){
    }

    fun removeEmployee(employee: Employee){
    }
}
class Employee(override val name: String, override val surname: String, val position: String) : Man(){

    private val pastPosition: Set<PastPosition> = setOf()
    private val department: Department = Department(5)
    private val room: Set<Room> = setOf()
    private val idCard: IdCard = IdCard(8)

    fun deletePastPosition(pastPosition: PastPosition){
    }
    fun deleteRoom(room: Room) {
    }
}
class PastPosition(val name: String, val department: Department)  {
}
class IdCard(val number: Int){
    val dateExpire: Date = Date()
}
class Room(val number: Int) {
}
abstract class Man{
    protected abstract val name: String
    protected abstract val surname: String
}