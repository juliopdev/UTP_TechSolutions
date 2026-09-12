package utp;

public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("Laptop Lenovo ThinkPad", 3000.00);

        System.out.println("==================================================");
        System.out.println("   TechSolutions - Sistema de Gestion de Inventarios");
        System.out.println("==================================================");
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Precio Base: S/. " + producto.getPrecioBase());
        System.out.println("Precio Final: S/. " + producto.calcularPrecioFinal());
        System.out.println("==================================================");
    }
}