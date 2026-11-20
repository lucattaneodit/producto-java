// 1. Creación de la clase Producto
public class Producto {

    // 2. Encapsulamiento: todos los atributos son private
    //    (solo se pueden tocar desde dentro de esta clase)
    private String nombre;   // nombre del producto
    private double precio;   // precio del producto
    private int stock;       // unidades disponibles

    // 3. Constructor: recibe los tres parámetros e inicializa los atributos
    //    "this.nombre" es el atributo del objeto, "nombre" es el parámetro
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // 2. Getters: para CONSULTAR los atributos desde fuera
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    // 2. Setters: para MODIFICAR los atributos desde fuera
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // 4. Método adicional: muestra por consola todos los datos del producto
    public void mostrarInformacio() {
        System.out.println("----- Información del producto -----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio + " €");
        System.out.println("Stock:  " + stock + " unidades");
        System.out.println("------------------------------------");
    }
}
