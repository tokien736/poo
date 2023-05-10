public class PruebaProductos {
    public static void main(String[] args) {
        // Creamos un producto digital
        Producto productoDigital = new ProductoDigital("Curso de Java", 100.0);

        // Imprimimos información del producto digital
        System.out.println("Información del producto digital:");
        System.out.println("Nombre: " + productoDigital.getNombreProducto());
        System.out.println("Precio: " + productoDigital.getPrecio());
        System.out.println("Precio total: " + productoDigital.calcularPrecioTotal());

        // Creamos un producto físico
        Producto productoFisico = new ProductoFisico("Libro de programación", 50.0);

        // Asignamos el costo de envío
        ((ProductoFisico) productoFisico).setCostoEnvio(10.0);

        // Imprimimos información del producto físico
        System.out.println("Información del producto físico:");
        System.out.println("Nombre: " + productoFisico.getNombreProducto());
        System.out.println("Precio: " + productoFisico.getPrecio());
        System.out.println("Costo de envío: " + ((ProductoFisico) productoFisico).getCostoEnvio());
        System.out.println("Precio total: " + productoFisico.calcularPrecioTotal());
    }
}
