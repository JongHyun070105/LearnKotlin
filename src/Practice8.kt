//data class Employee(val name : String, var salary : Int)
//
//fun main() {
//    val emp = Employee("Mary", 20)
//    println(emp)
//    emp.salary += 10
//    println(emp)
//}

//data class Person(val name: Name, val address: Address, val ownsAPet: Boolean = true)
//data class Name(val first : String, val last : String)
//data class Address(val street: String, val city : City)
//data class City(val name:String, val country : String)
//
//fun main() {
//    val person = Person(
//        Name("John", "Smith"),
//        Address("123 Fake Street", City("Springfield", "US")),
//        ownsAPet = false
//    )
//}

//import kotlin.random.Random
//
//data class Employee(val name: String, var salary: Int)
//
//class RandomEmployeeGenerator(var minSalary : Int, var maxSalary : Int) {
//    val names = listOf("종현","동균","시우","동석","태영","환희")
//    fun generateEmployee() : Employee{
//        return Employee(names.random(),
//            Random.nextInt(from = minSalary, until = maxSalary))
//    }
//}
//
//fun main() {
//    val empGen = RandomEmployeeGenerator(10, 30)
//    println(empGen.generateEmployee())
//    println(empGen.generateEmployee())
//    println(empGen.generateEmployee())
//    empGen.minSalary = 50
//    empGen.maxSalary = 100
//    println(empGen.generateEmployee())
//    println(empGen.generateEmployee())
//}