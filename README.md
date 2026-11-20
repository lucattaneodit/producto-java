# Producto: clases y encapsulamiento en Java

Prueba práctica de Java: aplicación para gestionar los productos de una tienda.

## Archivos

| Archivo | Qué hace |
|---|---|
| `Producto.java` | Clase `Producto` con los atributos `private` (`nombre`, `precio`, `stock`), constructor con los tres parámetros, getters, setters y el método `mostrarInformacio()`. |
| `Main.java` | Crea un `Producto` ("Ordenador", 799.99, 5), muestra su información, cambia el precio a 749.99 con el setter y la vuelve a mostrar. |

## Cómo ejecutarlo

```bash
javac *.java
java Main
```

O en VS Code (con la extensión "Extension Pack for Java"): abrir `Main.java` y pulsar **Run** encima del `main`.

## Salida

```
----- Información del producto -----
Nombre: Ordenador
Precio: 799.99 €
Stock:  5 unidades
------------------------------------
Precio modificado a 749.99 €

----- Información del producto -----
Nombre: Ordenador
Precio: 749.99 €
Stock:  5 unidades
------------------------------------
```
