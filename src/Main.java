import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Productos para demostracion
        Producto producto1 = new Producto("Bekylan", 5.99, 100);
        Producto producto2 = new Producto("Ibuprofeno", 4.49, 80);
        Producto producto3 = new Producto("Amoxicilina", 12.99, 50);

        Inventario inventario = new Inventario();

        inventario.agregarProducto(producto1);
        inventario.agregarProducto(producto2);
        inventario.agregarProducto(producto3);


        System.out.println("Bienvenido a la farmacia! Ingresa el numero de la opcion que quieras llevar a cabo: \n");
        System.out.println("1. Ver inventario actual\n");
        System.out.println("2. Comprar medicamentos \n");
        System.out.println("3. Vender medicamentos\n");
        Scanner select = new Scanner(System.in);
        int opc = select.nextInt();

        switch (opc) {
            case (1):
                mostrarInventario();
                break;

            case(2): //Para efectos de demostracion se usaran datos ya generados
                System.out.println("Realizando compra de medicamentos...\n");
                // Simulación de compra de medicamentos
                inventario.comprarMedicamento("Paracetamol", 20);
                inventario.comprarMedicamento("Ibuprofeno", 15);
                System.out.println("Medicamentos comprados, mostrando nuevo inventario: \n");
                mostrarInventario();
                break;

            case(3): //Para efectos de demostracion se usaran datos ya generados
                System.out.println("Aprobando venta de medicamentos...\n");
                // Simulación de venta a visitadores médicos
                inventario.venderMedicamento("Amoxicilina", 10);
                System.out.println("Venta realizada, mostrando inventario actualizado: \n");
                mostrarInventario();
                break;

            default:
                System.out.println("No ha seleccionado una opcion valida\n");
                break;

        }






    }

    // Mostrar el inventario actual después de las compras y ventas
    public static void mostrarInventario() {
        System.out.println("Inventario actual:");
        for (Producto producto : Inventario.getProductos()) {
            System.out.println("Producto: " + producto.getNombre());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Cantidad en inventario: " + producto.getCantidadEnInventario());
            System.out.println();
        }
    }

}