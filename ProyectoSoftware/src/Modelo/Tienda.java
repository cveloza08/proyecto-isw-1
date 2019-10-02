package Modelo;

import java.util.ArrayList;

public class Tienda {
private String nombre;
private String ciudad;
private String direccion;
private String telefono;
private ArrayList<Producto> lstProductos = new ArrayList<Producto>();
private ArrayList<Empleado> lstSEmpleados = new ArrayList<Empleado>();
private ArrayList<Proveedor> lstProveedor = new ArrayList<Proveedor>();


public Tienda() {

}

public Producto buscarProducto(Producto producto, String id) {
	for (int i = 0; i < getLstProductos().size(); i++) {
		if (getLstProductos().get(i).getId().equals(id)) {
			 producto = (Producto) getLstProductos().get(i); 
		}
	}
 return producto;
}
public void eliminarProducto(String id) {
	for (int i = 0; i < lstProductos.size(); i++) {
		if (lstProductos.get(i).getId().equals(id)) {
			lstProductos.remove(i);
		}
	}
	
	}
public void crearProducto(Producto producto) {
	lstProductos.add(producto);
}
 
public Proveedor buscarProveedor(Proveedor proveedor, String id) {
	for (int i = 0; i < getLstProveedor().size(); i++) {
		if (getLstProveedor().get(i).getId().equals(id)) {
			 proveedor = (Proveedor) getLstProveedor().get(i); 
		}
	}
 return proveedor;
}

public void eliminarProveedor(String id) {
	for (int i = 0; i < lstProveedor.size(); i++) {
		if (lstProveedor.get(i).getId().equals(id)) {
			lstProveedor.remove(i);
		}
	}
	
	}
public void crearProveedor(Proveedor proveedor) {
	lstProveedor.add(proveedor);
}



public Empleado buscarEmpleado(Empleado empleado, String id) {
	for (int i = 0; i < getLstSEmpleados().size(); i++) {
		if (getLstSEmpleados().get(i).getId().equals(id)) {
			 empleado = (Empleado) getLstSEmpleados().get(i); 
		}
	}
 return empleado;
}
public void eliminarEmpleado(String id) {
	for (int i = 0; i < lstSEmpleados.size(); i++) {
		if (lstSEmpleados.get(i).getId().equals(id)) {
			lstSEmpleados.remove(i);
		}
	}
	
	}
public void crearEmpleado(Empleado empleado) {
	lstSEmpleados.add(empleado);
}
 



public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getCiudad() {
	return ciudad;
}
public void setCiudad(String ciudad) {
	this.ciudad = ciudad;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public String getTelefono() {
	return telefono;
}
public void setTelefono(String telefono) {
	this.telefono = telefono;
}
public ArrayList<Producto> getLstProductos() {
	return lstProductos;
}
public void setLstProductos(ArrayList<Producto> lstProductos) {
	this.lstProductos = lstProductos;
}
public ArrayList<Empleado> getLstSEmpleados() {
	return lstSEmpleados;
}
public void setLstSEmpleados(ArrayList<Empleado> lstSEmpleados) {
	this.lstSEmpleados = lstSEmpleados;
}
public ArrayList<Proveedor> getLstProveedor() {
	return lstProveedor;
}
public void setLstProveedor(ArrayList<Proveedor> lstProveedor) {
	this.lstProveedor = lstProveedor;
}




}
