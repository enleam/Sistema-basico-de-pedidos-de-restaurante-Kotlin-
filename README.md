# 🍽️ Mi Restaurante

Programa básico desarrollado en **Kotlin** como parte del aprendizaje de los fundamentos del lenguaje.

## 📌 Descripción

**Mi Restaurante** es un programa de consola que simula un sistema básico para gestionar pedidos de un restaurante.

El usuario puede:

- 📋 Ver el menú disponible.
- 🛒 Realizar un pedido seleccionando productos y cantidades.
- 🧾 Consultar los productos agregados al pedido.
- 💰 Calcular el total a pagar.
- 🚪 Salir del programa.

El programa permite agregar varias unidades de un mismo producto y mantiene el pedido mientras el usuario utiliza las diferentes opciones del sistema.

## 🛠️ Tecnologías utilizadas

- **Kotlin**
- **IntelliJ IDEA**

## 📚 Conceptos de Kotlin utilizados

El proyecto aplica diferentes conceptos básicos del lenguaje:

- Variables `val` y `var`
- Tipos de datos `String`, `Int` y `Double`
- Clases y objetos
- Listas (`List`)
- Mapas (`Map` y `MutableMap`)
- Condicionales `if / else`
- Estructura `when`
- Bucles `for` y `while`
- Funciones
- Parámetros y valores de retorno
- Entrada de datos mediante `readln()`
- Null safety mediante el operador `?:`
- Interpolación de strings

## ▶️ Funcionamiento

Al ejecutar el programa se muestra el menú principal:

```text
==============================
       MI RESTAURANTE
==============================
1. Ver menú
2. Realizar pedido
3. Ver pedido
4. Calcular total
5. Salir
```

El usuario selecciona una opción e interactúa con el sistema. Después de realizar cada acción, puede presionar Enter para regresar al menú principal.

## 🍔 Productos disponibles

El programa cuenta actualmente con los siguientes productos:

| Producto | Precio |
|---|---:|
| Hamburguesa | S/ 15.00 |
| Pizza | S/ 25.00 |
| Ceviche | S/ 30.00 |
| Limonada | S/ 8.00 |

## 🎯 Objetivo

El objetivo del proyecto es aplicar de manera práctica los fundamentos de **Kotlin**, desarrollando un programa sencillo que permita comprender el uso de variables, estructuras de control, colecciones, funciones y clases.