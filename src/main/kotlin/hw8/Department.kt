package hw8

class Department(val name: String) : Unit {
    override var personCount: Int = 2
    private val employees: Set<Employee> = setOf()

    fun addEmployee(employee: Employee){
    }

    fun removeEmployee(employee: Employee){
    }
}