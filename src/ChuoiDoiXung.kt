import java.util.*

fun doiXung(s: String, from: Int, to: Int): Boolean{
    if(from >= to) return true
    if(s[from] != s[to]) return false
    return doiXung(s, from + 1, to - 1)
}

fun main() {
    val s = Scanner(System.`in`).nextLine()
    var maxLength = 1

    for(i in s.indices){
        for(j in (maxLength + 1) .. (s.length - i)){
            if(doiXung(s, i, i + j - 1)){
                maxLength = j
            }
        }
    }

    print(maxLength)
}