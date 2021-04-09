import java.util.*

fun removeMiddleDigits(n: Int): Int{
    fun firstDigit(n: Int):Int = if(n>= 10) firstDigit(n/10) else n
    return firstDigit(n) * 10 + n % 10
}

fun canApplyTrick(n: Int): Boolean {
    if(n < 100){
        return n == 0 || n == 1
    }

    var big = n
    val small = removeMiddleDigits(n)

    while (big % small == 0){
        big /= small
    }

    return big == 1
}

fun main() {
    val sc = Scanner(System.`in`)
    var n = sc.nextInt()

    while (!canApplyTrick(n)){
        n++
    }

    print(n)
}