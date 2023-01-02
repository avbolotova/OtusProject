package hw8

class Employee(override val name: String,
               override val surname: String,
               val position: String) : Man(){

    private val pastPosition: Set<PastPosition> = setOf()
    private val department: Department = Department("")
    private val room: Set<Room> = setOf()
    private val idCard: IdCard = TODO()

    fun deletePastPosition(pastPosition: PastPosition){
    }
    fun deleteRoom(room: Room) {
    }
}