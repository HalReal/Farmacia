import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private static List<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public static List<Producto> getProductos() {
        return productos;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void comprarMedicamento(String nombre, int cantidadComprada) {
        // Buscar el producto por nombre
        // Disminuir la cantidad en inventario según la cantidad comprada
    }

    public void venderMedicamento(String nombre, int cantidadVendida) {
        // Buscar el producto por nombre
        // Aumentar la cantidad en inventario según la cantidad vendida
    }

}