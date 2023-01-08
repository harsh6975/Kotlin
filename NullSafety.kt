fun main() {
    // data types are not nullable so we have to make it nullable
    // var name: String = null; will give error

    // put ? at end of data type to make it nullable
    var name: String? = null
    println(name)

    // as name is null so it can't have length
    // println(name.length)

    // so there is safe call operator ?.
    // is val is null then it return null else it call as usual
    println(name?.length)

    // Elvis operator ?: -> if right side is null then it return left side value
    println(name?.length ?: 0)
}
