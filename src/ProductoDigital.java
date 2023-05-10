public class ProductoDigital extends Producto {

	// Constructor que recibe el nombre y precio del producto digital
	public ProductoDigital(String nombre, double precio) {
		// Llama al constructor de la superclase (Producto) para inicializar el nombre y precio
		super(nombre, precio);
	}
	
	// Implementación del método abstracto calcularPrecioTotal de la superclase
	@Override
	public double calcularPrecioTotal() {
		// En el caso de los productos digitales, no hay costo de envío ni otros cargos, por lo que simplemente se devuelve el precio base del producto
		return getPrecio();
	}
}
