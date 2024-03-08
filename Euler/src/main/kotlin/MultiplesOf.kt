import kotlin.math.IEEErem

fun main() {
    problemTwo()
    sayHello()
}

private fun problemTwo() {
    val threshold = 1000
    var sum = 0
    var count = 0.0

    while (count <= threshold) {
        val pair = checkModulus(count, sum)
        count = pair.first
        sum = pair.second
    }
    print(sum)
}

private fun checkModulus(count: Double, sum: Int): Pair<Double, Int> {
    var count1 = count
    var sum1 = sum
    if ((count1.IEEErem(3.0) == 0.0) || count1.IEEErem(5.0) == 0.0) {
        sum1 += (count1).toInt()
    }
    count1++
    return Pair(count1, sum1)
}