public class Producto {
    private String nombre;
    private double precio;
    private int enInventario;

    public Producto(String nombre, double precio, int enInventario) {
        this.nombre = nombre;
        this.precio = precio;
        this.enInventario = enInventario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadEnInventario() {
        return enInventario;
    }

    public void setenInventario(int enInventario) {
        this.enInventario = enInventario;
    }

    // Constructor, getters y setters
}
