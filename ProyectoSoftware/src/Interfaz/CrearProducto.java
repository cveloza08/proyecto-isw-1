package Interfaz;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import ConexionBD.DAO_Crear;
import Modelo.Fachada;
import Modelo.Producto;
import Modelo.Tienda;
public class CrearProducto extends JFrame implements ActionListener{
	private JLabel idProducto;
	private JLabel nombreProducto;
	private JLabel cantidadProducto;
	private JLabel precioIngreso;
//	private JLabel especialidadMed;
//	private JLabel fechaMed;
//	private JLabel horaInicio;
//	private JLabel horaFin;
	private JTextField txtIdProducto;
	private JTextField txtNombreProducto;
	private JTextField txtCantidad;
	private JTextField txtPrecioIngreso;
//	private JTextField txtEspecialidad;
//	private JTextField txtFechaMed;
//	private JTextField txtHoraInicio;
//	private JTextField txtHoraFin;
	private JButton btnCrearProducto;
	private JButton btnVolver;
	private Producto producto;
//	private Especialidad especialidad;
//	private Disponibilidad dispo;
	private DAO_Crear dao;
	private Tienda a = Fachada.getTienda();
	private JTextField txtPrecioVenta;
	private JTextField txtFechaIngreso;
	private JTextField txtFechaVencimiento;
	
	public CrearProducto(Producto producto){
		super();
//		setIconImage(Toolkit.getDefaultToolkit().getImage
//		(ClassLoader.getSystemResource("Imagenes/Medico.jpg")));
		this.setTitle("Crear Producto");
		this.setSize(400, 350);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		getContentPane().setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.crearEtiquetas();
		this.crearIngreseDatos();
		this.crearBotones();
	}
	private void crearEtiquetas() {
		this.idProducto=new JLabel();
		this.idProducto.setText("ID");
		this.idProducto.setBounds(10, 31, 79, 29);
		getContentPane().add(idProducto);
		
		this.nombreProducto=new JLabel();
		this.nombreProducto.setText("Nombre");
		this.nombreProducto.setBounds(10, 61, 79, 29);
		getContentPane().add(nombreProducto);
		
		this.cantidadProducto=new JLabel();
		this.cantidadProducto.setText("Cantidad");
		this.cantidadProducto.setBounds(10, 91, 79, 29);
		getContentPane().add(cantidadProducto);
		
		this.precioIngreso=new JLabel();
		this.precioIngreso.setText("Precio Ingreso");
		this.precioIngreso.setBounds(10, 121, 79, 29);
		getContentPane().add(precioIngreso);
		
//		this.especialidadMed=new JLabel();
//		this.especialidadMed.setText("Especialidad");
//		this.especialidadMed.setBounds(10, 125, 200, 80);
//		this.add(especialidadMed);
//		
//		this.fechaMed=new JLabel();
//		this.fechaMed.setText("Fecha Disp.");
//		this.fechaMed.setBounds(10, 155, 200, 80);
//		this.add(fechaMed);
//		
//		this.horaInicio=new JLabel();
//		this.horaInicio.setText("Hora Ini. Disp.");
//		this.horaInicio.setBounds(10, 185, 200, 80);
//		this.add(horaInicio);
//		
//		this.horaFin=new JLabel();
//		this.horaFin.setText("Hora Fin Disp.");
//		this.horaFin.setBounds(10, 215, 200, 80);
//		this.add(horaFin);
	}
	
	private void crearIngreseDatos() {
		this.txtIdProducto=new JTextField();
		this.txtIdProducto.setBounds(90, 35, 180, 20);
		getContentPane().add(txtIdProducto);
		
		this.txtNombreProducto=new JTextField();
		this.txtNombreProducto.setBounds(90, 65, 180, 20);
		getContentPane().add(txtNombreProducto);
		
		this.txtCantidad=new JTextField();
		this.txtCantidad.setBounds(90, 95, 180, 20);
		getContentPane().add(txtCantidad);
		
		this.txtPrecioIngreso=new JTextField();
		this.txtPrecioIngreso.setBounds(90, 125, 180, 20);
		getContentPane().add(txtPrecioIngreso);
		
//		this.txtEspecialidad=new JTextField();
//		this.txtEspecialidad.setBounds(90, 155, 180, 20);
//		this.add(txtEspecialidad);
//		
//		this.txtFechaMed=new JTextField();
//		this.txtFechaMed.setBounds(90, 185, 180, 20);
//		this.add(txtFechaMed);
//		
//		this.txtHoraInicio=new JTextField();
//		this.txtHoraInicio.setBounds(90, 215, 180, 20);
//		this.add(txtHoraInicio);
//		
//		this.txtHoraFin=new JTextField();
//		this.txtHoraFin.setBounds(90, 245, 180, 20);
//		this.add(txtHoraFin);
	}
	
	private void crearBotones() {
		this.btnCrearProducto=new JButton();
		this.btnCrearProducto.setText("Crear");
		this.btnCrearProducto.setBounds(40, 280, 120, 20);
		btnCrearProducto.addActionListener(this);
		getContentPane().add(btnCrearProducto);
		
		this.btnVolver=new JButton();
		this.btnVolver.setText("Volver");
		this.btnVolver.setBounds(180, 280, 120, 20);
		btnVolver.addActionListener(this);
		getContentPane().add(btnVolver);
		
		JLabel precioVenta = new JLabel();
		precioVenta.setText("Precio Venta");
		precioVenta.setBounds(10, 154, 79, 29);
		getContentPane().add(precioVenta);
		
		JLabel fechaIngreso = new JLabel();
		fechaIngreso.setText("Fecha Ingreso");
		fechaIngreso.setBounds(10, 188, 79, 29);
		getContentPane().add(fechaIngreso);
		
		JLabel fechaDeVencimiento = new JLabel();
		fechaDeVencimiento.setText("Fecha De Vencimiento");
		fechaDeVencimiento.setBounds(10, 220, 105, 29);
		getContentPane().add(fechaDeVencimiento);
		
		txtPrecioVenta = new JTextField();
		txtPrecioVenta.setBounds(90, 161, 180, 20);
		getContentPane().add(txtPrecioVenta);
		
		txtFechaIngreso = new JTextField();
		txtFechaIngreso.setBounds(90, 194, 180, 20);
		getContentPane().add(txtFechaIngreso);
		
		txtFechaVencimiento = new JTextField();
		txtFechaVencimiento.setBounds(120, 224, 180, 20);
		getContentPane().add(txtFechaVencimiento);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCrearProducto) {
			if (txtIdProducto.getText().equals("") || txtNombreProducto.getText().equals("")
					|| txtCantidad.getText().equals("") || txtPrecioIngreso.getText().equals("")
					|| txtPrecioVenta.getText().equals("")|| txtFechaIngreso.getText().equals("")
					|| txtFechaVencimiento.getText().equals("")){
				JOptionPane.showMessageDialog(null, "Completa el formulario");
			} else {
				producto = new Producto();
//				especialidad = new Especialidad();
//				dispo = new Disponibilidad();
//				dao = new DAO_Crear();
				producto.setId(txtIdProducto.getText());
				producto.setNombre(txtNombreProducto.getText());
				producto.setCantidad(txtCantidad.getText());
				producto.setPrecioIngreso(txtPrecioIngreso.getText());
				producto.setPrecioVenta(txtPrecioVenta.getText());
				producto.setFechaIngreso(txtFechaIngreso.getText());
				producto.setFechaVencimiento(txtFechaVencimiento.getText());
				a.crearProducto(producto);
//				dao.crearProductoDAO(producto);
//				especialidad.setNombreEspecialidad(txtEspecialidad.getText());
//				medico.crearEspecialidad(especialidad);
//				dao.crearEspecialidadDAO(especialidad);
//				dispo.setFecha(txtFechaMed.getText());
//				dispo.setHora_inicio(txtHoraInicio.getText());
//				dispo.setHora_fin(txtHoraFin.getText());
//				medico.crearDisponibilidad(dispo);
//				dao.crearDisponibilidadDAO(dispo);
				JOptionPane.showMessageDialog(null, "Producto Creado Exitosamente");
				limpiarFormulario();
			}
		}
		
		if(e.getSource()==btnVolver){
			VentanaAdministrador ventana = new VentanaAdministrador();
			ventana.setVisible(true);
			setVisible(false);
		}
	}
	
	private void limpiarFormulario() {
		txtIdProducto.setText("");
		txtNombreProducto.setText("");
		txtCantidad.setText("");
		txtPrecioIngreso.setText("");
		txtPrecioVenta.setText("");
		txtFechaIngreso.setText("");
		txtFechaVencimiento.setText("");
		
	}
}
