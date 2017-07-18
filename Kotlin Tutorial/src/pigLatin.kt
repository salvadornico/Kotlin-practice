import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    while (true) {
        print("Type a word: ")
        val rawString = input.next()
        println(pigLatinize(rawString))
        println()
    }
}

fun pigLatinize(string: String): String {
    val lettersList = mutableListOf<String?>()

    val firstConsonantsRegex = Regex("^[^aeiouAEIOU]+")
    if (firstConsonantsRegex.containsMatchIn(string)) {
        val firstLetters = firstConsonantsRegex.find(string)?.value
        val continueAtIndex = firstConsonantsRegex.find(string)?.range?.last?.plus(1)

        continueAtIndex?.rangeTo((string.length - 1))!!.mapTo(lettersList) { string[it].toString() }
        lettersList.add(firstLetters)
    } else {
        (0..(string.length - 1)).mapTo(lettersList) { string[it].toString() }
        lettersList.add("w")
    }

    lettersList.add("a")
    lettersList.add("y")

    val output = lettersList.joinToString("")
    val capitalRegex = Regex("^[A-Z]+")
    if (capitalRegex.containsMatchIn(string)) return output.toLowerCase().capitalize() else return output
}