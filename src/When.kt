//// 문장형
//fun main() {
//    val obj = "안녕하세요"
//
//    when(obj) {
//        // obj가 1인지 확인하고 1이라면 "하나"를 출력
//        "1" -> println("하나")
//
//        // obj가 안녕하세요인지 확인하고 안녕하세요라면 "인사말"을 출력
//        "안녕하세요" -> println("인사말")
//
//        // 만약 전부 아니라면 "알 수 없음"을 출력
//        else -> println("알 수 없음")
//    }
//}

//fun main() {
//    val obj = "안녕하세요"
//
//    val result = when(obj) {
//        // obj가 1인지 확인하고 1이라면 result를 "하나"로 설정
//        "1" -> "하나"
//
//        // obj가 안녕하세요인지 확인하고 안녕하세요라면 result를 "인사드립니다"로 설정
//        "안녕하세요" -> "인사드립니다"
//
//        // 만약 전부 아니라면 result를 "알 수 없음"로 설정
//        else -> "알 수 없음"
//    }
//    println(result)
//}

//fun main() {
//    val trafficLightState = "노랑"
//
//    val trafficAction = when {
//        trafficLightState == "초록" -> "출발"
//        trafficLightState == "노랑" -> "속도 줄이기"
//        trafficLightState == "빨강" -> "정지"
//        else -> "오작동"
//    }
//    println(trafficAction)
//}

//fun main() {
//    val trafficLightState = "파랑"
//
//    val trafficAction = when (trafficLightState){
//        "초록" -> "출발"
//        "노랑" -> "속도 줄이기"
//        "빨강" -> "정지"
//        else -> "오작동"
//    }
//    println(trafficAction)
//}