class Contacts(val id: Int, var email: String) {
    fun printId() {
        println(id)
    }
}

fun main() {
    val contact = Contacts(1, "mary@gmail.com")
    contact.printId()
    // 1
}