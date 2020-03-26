package tag.klasses

fun main() {
    val emp: Employee = Employee("John", 20, 600)
    println(emp)

    // Test 1
    emp.greet()

    // Test 2
    println("Salary: ${emp.salary}")
    emp.salary += 299
    println("Salary: ${emp.salary}") // 899

    // Test 3
    try {
        emp.salary = 1000000
    }
    catch (ex: RuntimeException){
        println(ex.message)
    }
}