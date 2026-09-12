package utp;

public class Producto {
    private String nombre;
    private double precioBase;

    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    // Metodo que calcula el precio final de un producto (version basica inicial)
    public double calcularPrecioFinal() {
      return (this.precioBase * 0.90) * 1.18;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }
}
