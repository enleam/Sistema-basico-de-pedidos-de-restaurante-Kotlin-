class Producto (
    val nombre: String,
    val precio: Double
)

fun calcularTotal(pedido: Map<Producto, Int>): Double {
    var total = 0.0

    for ((producto, cantidad) in pedido) {
        total += producto.precio * cantidad
    }

    return total
}

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

    var opcion = 0

    while (opcion != 5) {
        println("=".repeat(28))
        println("       Mi Restaurante")
        println("=".repeat(28))

        println("1. Ver menu")
        println("2. Realizar pedido")
        println("3. Ver pedido")
        println("4. Calcular total")
        println("5. Salir")

        print("Seleccione la opcion: ")
        opcion = readln().toInt()

        when (opcion) {
            1 -> {
                println("\n===========Menu===========")

                for (producto in menu) {
                    println("${producto.nombre} - S/. ${producto.precio}")
                }

                println("Presione Enter para regresar al menu principal...")
                readln()
            }
            2 -> {
                println("\n==========Realizar Pedido===========")

                for ((indice, producto) in menu.withIndex()) {
                    println("${indice + 1}. ${producto.nombre} - S/. ${producto.precio}")
                }

                println("Seleccione un producto: ")
                val seleccion = readln().toInt()

                if (seleccion in 1..menu.size) {
                    val productoSeleccionado = menu[seleccion - 1]

                    println("Ingrese cantidad: ")
                    val cantidad = readln().toInt()

                    if (cantidad > 0) {
                        pedido[productoSeleccionado] = (pedido[productoSeleccionado] ?: 0) + cantidad

                        println("${productoSeleccionado.nombre} x$cantidad agregada al pedido.")
                    } else {
                        println("La cantidad debe ser mayor a 0.")
                    }
                } else {
                    println("Producto no valido.")
                }

                println("Presione Enter para regresar al menu principal...")
                readln()
            }
            3 -> {
                println("\n==========Mi Pedido===========")

                if (pedido.isEmpty()) {
                    println("El pedido esta vacio.")
                } else {
                    for ((producto, cantidad) in pedido) {
                        println("${producto.nombre} x$cantidad")
                    }
                }

                println("Presione Enter para regresar al menu principal...")
                readln()
            }
            4 -> {
                println("\n==========Total===========")

                if (pedido.isEmpty()) {
                    println("El pedido esta vacio.")
                } else {
                    val total = calcularTotal(pedido)
                    println("Total a pagar: S/. $total")
                }

                println("Presione Enter para regresar al menu principal...")
                readln()
            }
            5 -> println("Gracias por visitar Mi Restaurante.")
            else -> println("Opcion Invalida. Debe estar entre 1 y 5.")
        }
    }
}