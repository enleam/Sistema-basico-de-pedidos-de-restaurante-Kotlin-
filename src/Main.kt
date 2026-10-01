class Producto (
    val nombre: String,
    val precio: Double
)

fun main() {

    val hamburguesa = Producto("Hamburguesa", 15.0)
    val pizza = Producto("Pizza", 25.0)
    val ceviche = Producto("Ceviche", 30.0)
    val limonada = Producto("Limonada", 8.0)

    val menu = listOf(
        hamburguesa,
        pizza,
        ceviche,
        limonada
    )

    val pedido = mutableMapOf<Producto, Int>()

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
        1 -> {
            println("\n===========Menu===========")

            for (producto in menu) {
                println("${producto.nombre} - S/. ${producto.precio}")
            }
        }
        2 -> {
            println("\n==========Realizar Pedido===========")

            for ((indice, producto) in menu.withIndex()) {
                println("${indice + 1}. ${producto.nombre} - S/. ${producto.precio}")
            }

            println("Seleccione un pedido: ")
            val seleccion = readln().toInt()

            if (seleccion in 1..menu.size) {
                val productoSeleccionado = menu[seleccion - 1]

                println("Ingrese cantidad: ")
                val cantidad = readln().toInt()

                pedido[productoSeleccionado] = cantidad

                println("${productoSeleccionado.nombre} x$cantidad agregada al pedido.")
            } else {
                println("Producto no valido.")
            }
        }
        3 -> println("Has seleccionado: Ver pedido")
        4 -> println("Has seleccionado: Calcular total")
        5 -> println("Has seleccionado: Salir")
        else -> println("Opcion Invalida. Debe estar entre 1 y 5.")
    }
}