import io.github.cdimascio.dotenv.dotenv
import java.sql.Connection
import java.sql.DriverManager

private val configuracion = dotenv()

fun conectarBD(): Connection {
    val url = "jdbc:sqlserver://localhost:1433;databaseName=MiRestauranteDB;encrypt=true;trustServerCertificate=true"

    val usuario = configuracion["DB_USER"]
    val contrasena = configuracion["DB_PASSWORD"]

    return DriverManager.getConnection(url, usuario, contrasena)
}

fun obtenerProductos(): List<Producto> {
    val productos = mutableListOf<Producto>()

    conectarBD().use { conexion ->
        val consulta = conexion.createStatement()
        val resultado = consulta.executeQuery(
            "SELECT nombre, precio FROM Producto"
        )

        while (resultado.next()) {
            val producto = Producto(
                resultado.getString("nombre"),
                resultado.getDouble("precio")
            )
            productos.add(producto)
        }

        resultado.close()
        consulta.close()
    }
    return productos
}