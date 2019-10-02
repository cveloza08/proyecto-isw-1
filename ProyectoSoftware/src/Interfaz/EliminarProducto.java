package Interfaz;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import ConexionBD.DAO_Eliminar;
import Modelo.Fachada;
import Modelo.Producto;
//import Modelo.CentroMedico;
//import Modelo.Disponibilidad;
//import Modelo.Especialidad;
//import Modelo.Medicos;
import Modelo.Tienda;

public class EliminarProducto extends JFrame implements ActionListener{
	private JButton btnVolver;
	private JButton btnVerProducto;
	private JButton btnEliminarProducto;
	private JLabel identificacionproducto;
	private JLabel nombreProducto;
	private JLabel cantidadProducto;
	private JLabel PrecioIngreso;
	private JLabel precioVenta;
	private JLabel fechaIngreso;
	private JTextField txtId;
	private JTextField txtNombreProducto;
	private JTextField txtCantidadProductos;
	private JTextField txtPrecioingreso;
	private JComboBox listaproductos;
	private String identificacion,nombre,fecha;
	private Producto producto = new Producto();
//	private Especialidad espec = new Especialidad();
//	private Disponibilidad dispo = new Disponibilidad();
//	private DAO_Eliminar dao = new DAO_Eliminar();
	private Tienda a = Fachada.getTienda();
	private JTextField txtPrecioVenta;
	private JTextField txtfechaIngreso;
	private JTextField txtFechaVencimiento;
	
	public EliminarProducto(){
		super();
//		setIconImage(Toolkit.getDefaultToolkit().getImage
//		(ClassLoader.getSystemResource("Imagenes/Medico.jpg")));
		this.setTitle("Eliminar Medico");
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		getContentPane().setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.crearEtiquetas();
		this.crearIngresoDatos();
		this.crearBotones();
	}
	
	private void crearEtiquetas() {
		this.identificacionproducto=new JLabel();
		this.identificacionproducto.setText("Identificacion");
		this.identificacionproducto.setBounds(10, 37, 200, 32);
		getContentPane().add(identificacionproducto);
		
		this.nombreProducto=new JLabel();
		this.nombreProducto.setText("Nombres");
		this.nombreProducto.setBounds(10, 61, 91, 32);
		getContentPane().add(nombreProducto);
		
		this.cantidadProducto=new JLabel();
		this.cantidadProducto.setText("Cantidad");
		this.cantidadProducto.setBounds(10, 91, 86, 32);
		getContentPane().add(cantidadProducto);
		
		this.PrecioIngreso=new JLabel();
		this.PrecioIngreso.setText("Precio Ingreso");
		this.PrecioIngreso.setBounds(10, 124, 75, 26);
		getContentPane().add(PrecioIngreso);
		
		this.precioVenta=new JLabel();
		this.precioVenta.setText("Precio Venta");
		this.precioVenta.setBounds(10, 152, 75, 32);
		getContentPane().add(precioVenta);
		
		this.fechaIngreso=new JLabel();
		this.fechaIngreso.setText("Fecha Ingreso");
		this.fechaIngreso.setBounds(10, 182, 86, 32);
		getContentPane().add(fechaIngreso);
	}
	
	private void crearIngresoDatos() {
		this.txtId=new JTextField();
		this.txtId.setEditable(false);
		this.txtId.setBounds(95, 43, 180, 20);
		getContentPane().add(txtId);
		
		this.txtNombreProducto=new JTextField();
		this.txtNombreProducto.setEditable(false);
		this.txtNombreProducto.setBounds(95, 67, 180, 20);
		getContentPane().add(txtNombreProducto);
		
		this.txtCantidadProductos=new JTextField();
		this.txtCantidadProductos.setEditable(false);
		this.txtCantidadProductos.setBounds(95, 97, 180, 20);
		getContentPane().add(txtCantidadProductos);
		
		this.txtPrecioingreso=new JTextField();
		this.txtPrecioingreso.setEditable(false);
		this.txtPrecioingreso.setBounds(95, 127, 180, 20);
		getContentPane().add(txtPrecioingreso);
	}
	private void crearBotones() {
		this.btnVolver=new JButton();
		this.btnVolver.setText("Volver");
		this.btnVolver.setBounds(212, 249, 120, 20);
		btnVolver.addActionListener(this);
		getContentPane().add(btnVolver);
		
		this.btnVerProducto=new JButton();
		this.btnVerProducto.setText("Visualizar Producto");
		this.btnVerProducto.setBounds(211, 11, 140, 20);
		btnVerProducto.addActionListener(this);
		getContentPane().add(btnVerProducto);
		
		this.btnEliminarProducto=new JButton();
		this.btnEliminarProducto.setText("Eliminar Producto");
		this.btnEliminarProducto.setBounds(20, 249, 130, 20);
		btnEliminarProducto.addActionListener(this);
		getContentPane().add(btnEliminarProducto);
		
		this.listaproductos = new JComboBox();
		this.listaproductos.setBounds(10, 11, 149, 20);
		getContentPane().add(listaproductos);
		
		txtPrecioVenta = new JTextField();
		txtPrecioVenta.setEditable(false);
		txtPrecioVenta.setBounds(95, 158, 180, 20);
		getContentPane().add(txtPrecioVenta);
		
		txtfechaIngreso = new JTextField();
		txtfechaIngreso.setEditable(false);
		txtfechaIngreso.setBounds(95, 188, 180, 20);
		getContentPane().add(txtfechaIngreso);
		
		JLabel fechaVencimiento = new JLabel();
		fechaVencimiento.setText("Fecha Vencimiento");
		fechaVencimiento.setBounds(10, 212, 99, 32);
		getContentPane().add(fechaVencimiento);
		
		txtFechaVencimiento = new JTextField();
		txtFechaVencimiento.setEditable(false);
		txtFechaVencimiento.setBounds(105, 218, 180, 20);
		getContentPane().add(txtFechaVencimiento);
		this.leerProducto();
		
		this.llenarProducto();
	}
	public void actionPerformed(ActionEvent e) {	
		
		String id = (String) listaproductos.getSelectedItem();
		
		if(e.getSource()==btnVolver){
			VentanaAdministrador ventana = new VentanaAdministrador();
			ventana.setVisible(true);
			setVisible(false);
		}
		
		if(e.getSource()==btnEliminarProducto){
			
			
			a.eliminarProducto(id);
//			dao.eliminarMedicoDAO(producto);
			EliminarProducto eli= new EliminarProducto();
			this.setVisible(false);
			eli.setVisible(true);
			JOptionPane.showMessageDialog(null, "Producto Eliminado");
		}
		
		if(e.getSource()==btnVerProducto){
			llenarProducto();
		}
	}
	
	private void leerProducto() {
		DefaultComboBoxModel mlista = new DefaultComboBoxModel();
		
		for (int i = 0; i < a.getLstProductos().size(); i++) {
			mlista.addElement(a.getLstProductos().get(i).getId());
		}
		listaproductos.setModel(mlista);
	}
	
	
	private void llenarProducto() {
		String id = (String) listaproductos.getSelectedItem();
		producto = a.buscarProducto(producto, id);
		txtId.setText(producto.getId());
		txtNombreProducto.setText(producto.getNombre());
		txtCantidadProductos.setText(producto.getCantidad());
		txtPrecioingreso.setText(producto.getPrecioIngreso());
		txtPrecioVenta.setText(producto.getPrecioVenta());
		txtfechaIngreso.setText(producto.getFechaIngreso());
		txtFechaVencimiento.setText(producto.getFechaVencimiento());
		
	}
}
