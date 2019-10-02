package Modelo;

public class Factura {
	private String producto;
	private String valorProducto;
	private String cantidad;
	private String ValorTotal;
	
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public String getValorProducto() {
		return valorProducto;
	}
	public void setValorProducto(String valorProducto) {
		this.valorProducto = valorProducto;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public String getValorTotal() {
		return ValorTotal;
	}
	public void setValorTotal(String valorTotal) {
		ValorTotal = valorTotal;
	}
}
