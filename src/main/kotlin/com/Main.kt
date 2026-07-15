package com

data class WiseSaying(
    val id: Int,
    val content: String?,
    val author: String?
)

fun main() {
    println("== 명언 앱 ==")
    var index = 0;
    val wiseSayings = mutableListOf<WiseSaying>()

    while (true) {
        print("명령) ")

        val input = readlnOrNull()?.trim()

        if(input == "종료") {
            break
        } else if(input == "등록") {
            print("명언 : ")
            val content = readlnOrNull()?.trim()
            print("작가 : ")
            val author = readlnOrNull()?.trim()

            val wiseSaying = WiseSaying(
                id = ++index,
                content = content,
                author = author
            )

            wiseSayings.add(wiseSaying)

            println("${wiseSaying.id}번 명언이 등록되었습니다.")
        }
    }
}