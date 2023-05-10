
public class Cuenta {

	private String titular;
	private double cantidad;
	
	public Cuenta(String titular) {
		super();
		this.titular = titular;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public double ingresar(double cantidad) {
		if(cantidad <= 0){
			System.out.println("La cantidad es negativa");
		}else {
			return this.cantidad += cantidad;	
		}
		return 0;
	}
	public double retiro(double cantidad) {
		if(cantidad>this.cantidad) {
			System.out.println("La cantidad que desea supera a su saldo.");
		}else {
			return this.cantidad -=cantidad;
		}
		return 0;
	}
}

