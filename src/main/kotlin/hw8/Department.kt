package hw8

class Department(val _department: String) : Unit {
    override var personCount: Int = 2
    private val name: String = ""
    private val employees: Set<Employee> = setOf()

    fun addEmployee(employee: Employee){
    }

    fun removeEmployee(employee: Employee){
    }
}