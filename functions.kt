fun afficherNombresPairsOuImpairs(x: Int, estPair: Boolean) {
    println("Affichage des $x premiers nombres ${if (estPair) "pairs" else "impairs"}")
    var nombre = if (estPair) 0 else 1
    repeat(x) {
        println(nombre)
        nombre += 2
    }
}

fun afficherFibonacci(x: Int) {
    println("Affichage des $x premiers nombres de la suite de Fibonacci")
    var a = 0
    var b = 1
    repeat(x) {
        println(a)
        val temp = a + b
        a = b
        b = temp
    }
}

fun factoriel(x: Int): Long {
    return if (x <= 1) 1 else x * factoriel(x - 1)
}

fun estPremier(n: Int): Boolean {
    if (n < 2) return false
    for (i in 2 until n) {
        if (n % i == 0) return false
    }
    return true
}

fun afficherNombresPremiers(x: Int) {
    println("Affichage des $x premiers nombres premiers")
    var count = 0
    var nombre = 2
    while (count < x) {
        if (estPremier(nombre)) {
            println(nombre)
            count++
        }
        nombre++
    }
}


fun main() {
    afficherNombresPairsOuImpairs(5, true)
    afficherFibonacci(5)
    println("factoriel de (5) = ${factoriel(5)}")
    afficherNombresPremiers(5)
}
