fun main() {
    var row = 3
    var column = 3
    for (i in 1..row) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }

    var row1 = 3
    var column1 = 3
    for (i in 1..3) {
        for (j in 1..i) {
            print("$j")
        }
        println()
    }

    var row2 = 3
    var column2 = 3
    for (i in 1..3) {
        for (j in 1..i) {
            print("$i")
        }
        println()
    }

    for (i in 65..67) {
        for (j in 65..i) {
            print(j.toChar())
        }
        println()
    }

    for (i in 1..5)
    {
        for (j in 1..5)
        {
            if (i == 1 || i == 5 || j == 1 || j == 5) {
                print("*" + "")
            } else {
                print(" ")}
            }
            println()
        }
    }



