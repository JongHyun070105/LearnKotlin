import kotlin.random.Random

data class Employee(val name: String, var salary: Int)

class RandomEmployeeGenerator(var minSalary : Int, var maxSalary : Int) {
    val names = listOf("종현","동균","시우","동석","태영","환희")
    fun generateEmployee() : Employee{
        return Employee(names.random(),
            Random.nextInt(from = minSalary, until = maxSalary))
    }
}

fun main() {
    val empGen = RandomEmployeeGenerator(10, 30)
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    empGen.minSalary = 50
    empGen.maxSalary = 100
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
}