public class ProductoFisico extends Producto {

    private double costoEnvio; // costo de envío del producto físico

    public ProductoFisico(String nombre, double precio) {
        super(nombre, precio); // llamada al constructor de la clase padre con el nombre y precio del producto
    }

    public double getCostoEnvio() {
        return costoEnvio; // devuelve el costo de envío del producto físico
    }

    public void setCostoEnvio(double costoEnvio) {
        this.costoEnvio = costoEnvio; // establece el costo de envío del producto físico
    }

    public double calcularPrecioTotal() {
        double precioTotal = super.getPrecio() + costoEnvio; // cálculo del precio total del producto físico
        return precioTotal; // devuelve el precio total del producto físico
    }
}
