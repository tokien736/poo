/**
 * Clase abstracta Producto
 * Representa un producto genérico con un nombre y un precio.
 * Esta clase es abstracta y no puede ser instanciada directamente.
 * Se espera que las subclases implementen el método calcularPrecioTotal().
 * 
 * Los atributos nombreProducto y precio son privados y se acceden mediante los métodos de acceso.
 * 
 * @author [nombre del autor]
 * @version [número de versión]
 */
public abstract class Producto {

	private String nombreProducto; // nombre del producto
	private double precio; // precio del producto
	
	/**
	 * Constructor de la clase Producto.
	 * 
	 * @param nombreProducto El nombre del producto.
	 * @param precio El precio del producto.
	 */
	public Producto(String nombreProducto, double precio) {
		this.nombreProducto = nombreProducto; // asignación del nombre del producto
		this.precio = precio; // asignación del precio del producto
	}

	/**
	 * Obtiene el nombre del producto.
	 * 
	 * @return El nombre del producto.
	 */
	public String getNombreProducto() {
		return nombreProducto; // devuelve el nombre del producto
	}

	/**
	 * Establece el nombre del producto.
	 * 
	 * @param nombreProducto El nuevo nombre del producto.
	 */
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto; // establece el nombre del producto
	}

	/**
	 * Obtiene el precio del producto.
	 * 
	 * @return El precio del producto.
	 */
	public double getPrecio() {
		return precio; // devuelve el precio del producto
	}

	/**
	 * Establece el precio del producto.
	 * 
	 * @param precio El nuevo precio del producto.
	 */
	public void setPrecio(double precio) {
		this.precio = precio; // establece el precio del producto
	}
	
	/**
	 * Método abstracto para calcular el precio total del producto.
	 * Este método debe ser implementado en las subclases.
	 * 
	 * @return El precio total del producto.
	 */
	public abstract double calcularPrecioTotal();

}
