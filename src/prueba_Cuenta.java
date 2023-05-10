
public class prueba_Cuenta {

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(null);
		cuenta.ingresar(1500);
		cuenta.ingresar(-150);
		System.out.println(cuenta.getCantidad());
		
		cuenta.retiro(150);
		cuenta.retiro(1450);
		System.out.println(cuenta.getCantidad());
		
	}
}
