//fun main() {
//    // 읽기 전용 세트
//    val readOnlyFruits = setOf("사과","바나나","체리","체리")
//
//    // 수정 가능한 세트
//    val fruit : MutableSet <String> = mutableSetOf("사과","바나나","체리","체리")
//
//    println(readOnlyFruits)
//    // [사과, 바나나, 체리]
//}
//
//fun main() {
//    val fruit: MutableSet<String> = mutableSetOf("사과", "바나나", "체리", "체리")
//    val fruitLocked: Set<String> = fruit
//
//    println(fruitLocked)
//}
//
//fun main() {
//    val readOnlyFruit = setOf("사과","바나나","체리","체리")
//    println(" 이 세트에는 ${readOnlyFruit.count()} 개의 데이터가 있습니다.")
//}
//
//fun main() {
//    val readOnlyFruit = setOf("사과","바나나","체리","체리")
//    println("사과" in readOnlyFruit)
//    // true
//}
//
//fun main() {
//    val fruit : MutableSet <String> = mutableSetOf("사과","바나나","체리","체리")
//    fruit.add("용과")
//    println(fruit)
//
//    fruit.remove("용과")
//    println(fruit)
//}
