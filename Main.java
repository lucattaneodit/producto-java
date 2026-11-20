// 5. Clase principal (Main)
public class Main {

    public static void main(String[] args) {

        // 1. Crear un objeto de tipo Producto con los datos del enunciado
        Producto producto1 = new Producto("Ordenador", 799.99, 5);

        // 2. Mostrar la información del producto
        producto1.mostrarInformacio();

        // 3. Modificar el precio a 749.99 mediante el setter
        producto1.setPrecio(749.99);
        System.out.println("Precio modificado a " + producto1.getPrecio() + " €\n");

        // 4. Mostrar nuevamente la información del producto
        producto1.mostrarInformacio();
    }
}
