import java.lang.StringBuilder

class Solution {
}

fun main(args: Array<String>) {
    val s1 = readLine()!!
    var res = StringBuilder()
    s1.forEach {char->
        if(char.isUpperCase()) res.append(char.lowercaseChar())
        else res.append(char.uppercaseChar())
    }
    println(res)
}