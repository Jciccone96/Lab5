fun main() {
    val n:Int = 8
    val p:Int = 7
    val result:Int

    result = compare(n, p)

    println(+result)
}

// The compare function if x < y return 1, if x > y return -1
//// else return 0.
fun compare(x: Int, y: Int): Int {
    var answer:Int

    if (x < y){
        answer = 1
    }
    else if (x > y){
        answer = -1
    }
    else
    {
        answer = 0
    }
    return answer
}