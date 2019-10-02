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

import ConexionBD.DAO_Modificar;
import Modelo.Fachada;
import Modelo.Producto;
import Modelo.Tienda;
//import Modelo.CentroMedico;
//import Modelo.Disponibilidad;
//import Modelo.Especialidad;
//import Modelo.Medicos;

public class ModificarProducto extends JFrame implements ActionListener{
	private JButton btnVolver;
	private JButton btnVerProducto;
	private JButton btnModificarProducto;
    private JLabel idProducto;
	private JLabel nombreProducto;
	private JLabel cantidadProducto;
	private JLabel precioIngreso;
	private JLabel precioVenta;
	private JLabel fechaIngreso;
	private JLabel fechaDeVencimiento;
	private JTextField txtIdProducto;
	private JTextField txtNombreProducto;
	private JTextField txtCantidadProducto;
	private JTextField txtPrecioIngreso;
	private JTextField txtPrecioVenta;
	private JTextField txtFechaIngreso;
	private JTextField txtFechaDeVencimiento;
	private JComboBox listaProductos;

	private Producto producto = new Producto();

//	private DAO_Modificar dao = new DAO_Modificar();
	private Tienda a = Fachada.getTienda();
	
	public ModificarProducto(){
		super();
//		setIconImage(Toolkit.getDefaultToolkit().getImage
//		(ClassLoader.getSystemResource("Imagenes/Medico.jpg")));
		this.setTitle("Modificar Medico");
		this.setSize(500, 350);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		getContentPane().setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.crearEtiquetas();
		this.crearIngresoDatos();
		this.crearBotones();
	}
	private void crearEtiquetas() {
		this.idProducto=new JLabel();
		this.idProducto.setText("ID");
		this.idProducto.setBounds(10, 39, 75, 42);
		getContentPane().add(idProducto);
		
		this.nombreProducto=new JLabel();
		this.nombreProducto.setText("Nombre");
		this.nombreProducto.setBounds(10, 50, 200, 80);
		getContentPane().add(nombreProducto);
		
		this.cantidadProducto=new JLabel();
		this.cantidadProducto.setText("Cantidad");
		this.cantidadProducto.setBounds(10, 80, 200, 80);
		getContentPane().add(cantidadProducto);
		
		this.precioIngreso=new JLabel();
		this.precioIngreso.setText("Precio Ingreso");
		this.precioIngreso.setBounds(10, 110, 200, 80);
		getContentPane().add(precioIngreso);
		
		this.precioVenta=new JLabel();
		this.precioVenta.setText("Precio Venta");
		this.precioVenta.setBounds(10, 140, 200, 80);
		getContentPane().add(precioVenta);
		
		this.fechaIngreso=new JLabel();
		this.fechaIngreso.setText("Fecha Ingreso");
		this.fechaIngreso.setBounds(10, 170, 200, 80);
		getContentPane().add(fechaIngreso);
		
		this.fechaDeVencimiento=new JLabel();
		this.fechaDeVencimiento.setText("Fecha De Vencimiento");
		this.fechaDeVencimiento.setBounds(10, 200, 200, 80);
		getContentPane().add(fechaDeVencimiento);
		

	}
	
	private void crearIngresoDatos() {
		this.txtIdProducto=new JTextField();
		this.txtIdProducto.setBounds(90, 50, 180, 20);
		getContentPane().add(txtIdProducto);
		
		this.txtNombreProducto=new JTextField();
		this.txtNombreProducto.setBounds(90, 80, 180, 20);
		getContentPane().add(txtNombreProducto);
		
		this.txtCantidadProducto=new JTextField();
		this.txtCantidadProducto.setBounds(90, 110, 180, 20);
		getContentPane().add(txtCantidadProducto);
		
		this.txtPrecioIngreso=new JTextField();
		this.txtPrecioIngreso.setBounds(90, 140, 180, 20);
		getContentPane().add(txtPrecioIngreso);
		
		this.txtPrecioVenta=new JTextField();
		this.txtPrecioVenta.setBounds(90, 171, 180, 20);
		getContentPane().add(txtPrecioVenta);
		
		this.txtFechaIngreso=new JTextField();
		this.txtFechaIngreso.setBounds(126, 201, 180, 20);
		getContentPane().add(txtFechaIngreso);
		
		this.txtFechaDeVencimiento=new JTextField();
		this.txtFechaDeVencimiento.setBounds(160, 231, 180, 20);
		getContentPane().add(txtFechaDeVencimiento);
		

	}
	private void crearBotones() {
		this.btnVolver=new JButton();
		this.btnVolver.setText("Volver");
		this.btnVolver.setBounds(300, 290, 120, 20);
		btnVolver.addActionListener(this);
		getContentPane().add(btnVolver);
		

		
		this.btnModificarProducto=new JButton();
		this.btnModificarProducto.setText("Modificar Producto");
		this.btnModificarProducto.setBounds(20, 290, 150, 20);
		btnModificarProducto.addActionListener(this);
		getContentPane().add(btnModificarProducto);
		
		this.btnVerProducto=new JButton();
		this.btnVerProducto.setText("Visualizar Producto");
		this.btnVerProducto.setBounds(200, 20, 140, 20);
		btnVerProducto.addActionListener(this);
		getContentPane().add(btnVerProducto);
		
		this.listaProductos = new JComboBox();
		this.listaProductos.setBounds(10, 20, 149, 20);
		getContentPane().add(listaProductos);
		this.leerProducto();

	}
	public void actionPerformed(ActionEvent e) {
		String nombreProducto = (String) listaProductos.getSelectedItem();
		producto = a.buscarProducto(producto, nombreProducto);
		if(e.getSource()==btnVolver){
			VentanaAdministrador ventana = new VentanaAdministrador();
			ventana.setVisible(true);
			setVisible(false);
		}
		
		if(e.getSource()==btnVerProducto){
			llenarProducto();
		}
		
		if(e.getSource()==btnModificarProducto){
			producto.setNombre(txtNombreProducto.getText());
			producto.setId(txtIdProducto.getText());
			producto.setCantidad(txtCantidadProducto.getText());
			producto.setPrecioIngreso(txtPrecioIngreso.getText());
			producto.setPrecioVenta(txtPrecioVenta.getText());
			producto.setFechaIngreso(txtFechaIngreso.getText());
			producto.setFechaVencimiento(txtFechaDeVencimiento.getText());
//			dao.modificarMedicoDAO(medico);
//			espe.setNombreEspecialidad(txtPrecioVenta.getText());
//			dao.modificarEspecialidadDAO(espe,medico);
//			dispo.setFecha(txtFechaIngreso.getText());
//			dispo.setHora_inicio(txtFechaDeVencimiento.getText());
//			dispo.setHora_fin(txtHoraFin.getText());
//			dao.modificarDisponibilidadDAO(dispo,medico);
			ModificarProducto eli= new ModificarProducto();
			this.setVisible(false);
			eli.setVisible(true);
			JOptionPane.showMessageDialog(null, "Producto Modificado");
		}
		
	}
	private void leerProducto() {
		DefaultComboBoxModel mlista = new DefaultComboBoxModel();
		
		for (int i = 0; i < a.getLstProductos().size(); i++) {
			mlista.addElement(a.getLstProductos().get(i).getId());
		}
		listaProductos.setModel(mlista);
	getContentPane().add(listaProductos);
	}
	
	private void llenarProducto() {
		String id = (String) listaProductos.getSelectedItem();
		producto = a.buscarProducto(producto, id);
		txtIdProducto.setText(producto.getId());
		txtNombreProducto.setText(producto.getNombre());
		txtCantidadProducto.setText(producto.getCantidad());
		txtPrecioIngreso.setText(producto.getPrecioIngreso());
		txtPrecioVenta.setText(producto.getPrecioVenta());
		txtFechaIngreso.setText(producto.getFechaIngreso());
		txtFechaDeVencimiento.setText(producto.getFechaVencimiento());
		
	}
	
	
}
