//fun main() {
//    // 읽기 전용 리스트
//    val readOnlyShapes = listOf("사각형","삼각형","원")
//    println(readOnlyShapes)
//
//    // 명시적 유형 선언이 있는 변경 가능한 리스트
//    val shapes : MutableList <String> = mutableListOf("사각형","삼각형","원")
//    println(shapes)
//
//    val shapesLocked : List<String> = shapes
//    println(shapesLocked)
//}
//
//fun main() {
//    val readOnlyShapes = listOf("사각형","삼각형","원")
//    println("리스트의 첫 번째 항목은 ${readOnlyShapes[0]}입니다.")
//    // 사각형
//}
//
//fun main() {
//    val readOnlyShapes = listOf("사각형","삼각형","원")
//    println("리스트의 첫 번째 항목은 ${readOnlyShapes.first()}입니다.")
//    // 사각형
//}
//
//fun main() {
//    val readOnlyShapes = listOf("사각형","삼각형","원")
//    println("리스트 항목의 개수는 ${readOnlyShapes.count()}개 입니다.")
//    // 사각형
//}
//
//fun main() {
//    val readOnlyShapes = listOf("사각형","삼각형","원")
//    println("원" in readOnlyShapes )
//    // true
//}
//
//fun main() {
//    val shapes : MutableList <String> = mutableListOf("사각형","삼각형","원")
//    // 리스트에 오각형 추가
//    shapes.add("오각형")
//    // [사각형, 삼각형, 원, 오각형]
//
//    // 리스트에서 오각형 제거
//    shapes.remove("오각형")
//    println(shapes)
//    // [사각형, 삼각형, 원]
//}