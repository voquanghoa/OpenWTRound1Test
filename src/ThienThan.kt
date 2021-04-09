import java.util.*

fun doixung(origin: Int): Boolean {
    var n = origin
    var m = 0
    while (n > 0) {
        m = 10 * m + n % 10
        n /= 10
    }
    return origin == m
}

fun nguyenTo(n: Int): Boolean {
    var i = 2
    while (i * i <= n) {
        if (n % i++ == 0) return false
    }
    return n >= 2
}


fun main() {
    var n = Scanner(System.`in`).nextInt()
    while (!(doixung(n) && nguyenTo(n))) {
        n++
    }
    print(n)
}