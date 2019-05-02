import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    var end = true
    var first = 0
    var second = 0
    var sum = 1
    var operation : String

    while(end) {
        print("Type of of Operation(End to quit): ")
        operation = scan.nextLine().toLowerCase()

        if(operation != "end") {
            print("\nFirst number: ")
            first = scan.nextLine().toInt()

            if(operation != "!") {
                print("\nSecond number: ")
                second = scan.nextLine().toInt()
            }
        }

        when(operation) {
            "+" -> println(first + second)
            "-" -> println(first - second)
            "x" -> println(first * second)
            "/" -> println(first / second)
            "!" -> println({sum = 1; for(i in 0 .. first) {sum *= i} })
            "end" -> end = false
            else -> println("invalid operator")
        }
    }
}