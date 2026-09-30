fun main() {
    println("=".repeat(28))
    println("       Mi Restaurante")
    println("=".repeat(28))

    println("1. Ver menu")
    println("2. Realizar pedido")
    println("3. Ver pedido")
    println("4. Calcular total")
    println("5. Salir")

    println("Seleccione la opcion: ")
    val opcion = readln().toInt()

    when (opcion) {
        1 -> println("Has seleccionado: Ver menu")
        2 -> println("Has seleccionado: Realizar pedido")
        3 -> println("Has seleccionado: Ver pedido")
        4 -> println("Has seleccionado: Calcular total")
        5 -> println("Has seleccionado: Salir")
        else -> println("Opcion Invalida. Debe estar entre 1 y 5.")
    }
}