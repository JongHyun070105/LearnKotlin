//fun main() {
//    val readOnlyJuiceMenu = mapOf("사과" to 100, "키위" to 190, "오렌지" to 100)
//    println(readOnlyJuiceMenu)
//    // {사과 = 100, 키위 = 190, 오렌지 = 100}
//
//    val juiceMenu : MutableMap <String, Int> = mutableMapOf("사과" to 100, "키위" to 190, "오렌지" to 100)
//    println(juiceMenu)
//    // {사과 = 100, 키위 = 190, 오렌지 = 100}
//}
//
//fun main() {
//    val juiceMenu : MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
//    val juiceMenuLocked : Map<String, Int> = juiceMenu
//
//    println(juiceMenuLocked)
//}
//
//fun main() {
//    val readOnlyJuiceMenu = mapOf("사과" to 100, "키위" to 190, "오렌지" to 100)
//    println("사과 주스의 값은 ${readOnlyJuiceMenu["사과"]}원 입니다.")
//}

//fun main() {
//    val readOnlyJuiceMenu = mapOf("사과" to 100, "키위" to 190, "오렌지" to 100)
//    println("파인애플 주스의 값은 ${readOnlyJuiceMenu["파인애플"]}원 입니다.")
//}

//fun main() {
//    val juiceMenu : MutableMap <String, Int> = mutableMapOf("사과" to 100, "오렌지" to 190, "키위" to 100)
//    juiceMenu["코코넛"] = 150
//    println(juiceMenu)
//}
//
//fun main() {
//    val juiceMenu : MutableMap <String, Int> = mutableMapOf("사과" to 100, "오렌지" to 190, "키위" to 100)
//    juiceMenu.remove("오렌지")
//    println(juiceMenu)
//}
//
//fun main() {
//    val juiceMenu : MutableMap <String, Int> = mutableMapOf("사과" to 100, "오렌지" to 190, "키위" to 100)
//    println("이 맵에는 ${juiceMenu.count()}개의 키-값 쌍이 있다.")
//}
//
//fun main() {
//    val readOnlyJuiceMenu = mapOf("사과" to 100, "키위" to 190, "오렌지" to 100)
//    println(readOnlyJuiceMenu.containsKey("키위"))
//    // true
//}
//
//fun main() {
//    val readOnlyJuiceMenu = mapOf("사과" to 100, "키위" to 190, "오렌지" to 100)
//    println(readOnlyJuiceMenu.keys)
//    // [사과, 키위, 오렌지]
//    println(readOnlyJuiceMenu.values)
//    // [100, 190, 100]
//}

//fun main() {
//    val readOnlyJuiceMenu = mapOf("사과" to 100, "키위" to 190, "오렌지" to 100)
//    println("오렌지" in readOnlyJuiceMenu.keys)
//
//    println("오렌지" in readOnlyJuiceMenu)
//
//    println(200 in readOnlyJuiceMenu.values)
//}