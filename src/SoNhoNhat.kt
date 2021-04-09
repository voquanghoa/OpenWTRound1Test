import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()

    var min = Int.MAX_VALUE
    for(i in 0 until n){
        for(j in 0 until n){
            val element = sc.nextInt()
            if(element < min){
                if(i == j || i+j == n - 1){
                    min = element
                }
            }
        }
    }

    print(min)
}