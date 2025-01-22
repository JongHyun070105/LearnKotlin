//fun main() {
//    var neverNull: String = "This can't be null"
//    // 컴파일 오류 난다.
//    neverNull = null
//
//    var nullable: String? = "You can keep a null here"
//    // 컴파일 오류 나지 않는다.
//    nullable = null
//
//    var inferredNonNull = "The compiler assumes non-nullable"
//    // 컴파일 오류 난다.
//    inferredNonNull = null
//
//    // null 값을 허용하지 않는 함수다.
//    fun strLength(notNull: String): Int {
//        return notNull.length
//    }
//
//    println(strLength(neverNull)) // 18
//    println(strLength(nullable))  // Throws a compiler error
//}