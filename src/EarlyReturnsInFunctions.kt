val registeredUserNames = mutableListOf("JongHyun","HyunJong")
val registredUserEmails = mutableListOf("JongHyun@example.com","HyunJong@example.com")

fun registerUser(username: String, email : String):String{
    if (username in registeredUserNames){
        return "사용자 이름이 이미 있습니다. 다른 사용자 이름을 선택하세요."
    }
    if (email in registredUserEmails){
        return "이미 등록된 계정입니다. 다른 이메일을 사용하세요"
    }
    registeredUserNames.add(username)
    registredUserEmails.add(email)

    return "$username 가 성공적으로 등록되었습니다."
}

fun main() {
    println(registerUser("TeaYoung","TaeYoung@examle.com"))
    println(registerUser("SiWoo","SiWoo@example.com"))
}