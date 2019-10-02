package Modelo;

public class Fachada {
	public static Tienda tienda;

	public static Tienda getInstance() {
		if (tienda == null) {
			tienda = new Tienda();
		}
		return tienda;
	}

	public static Tienda getTienda() {
		return tienda;
	}


}
