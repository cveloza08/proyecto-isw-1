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
import Modelo.Proveedor;
import Modelo.Tienda;
public class CrearProveedores extends JFrame implements ActionListener{
	private JLabel idProveedor;
	private JLabel nombreProveedor;
	private JLabel telefonoProveedor;
	private JLabel direccionProveedor;
	private JLabel ciudadProveedor;

	private JTextField txtIdProveedor;
	private JTextField txtNombreProveedor;
	private JTextField txtTelefonoProveedor;
	private JTextField txtDireccionProveedor;
	private JTextField txtciudadProveedor;
	private JTextField txtTipoDeProducto;

	private JButton btnCrearProveedor;
	private JButton btnVolver;
	private Proveedor proveedor;

	private DAO_Crear dao;
	private Tienda a = Fachada.getTienda();

	
	public CrearProveedores(Proveedor proveedor){
		super();
//		setIconImage(Toolkit.getDefaultToolkit().getImage
//		(ClassLoader.getSystemResource("Imagenes/Medico.jpg")));
		this.setTitle("Crear Proveedor");
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
		this.idProveedor=new JLabel();
		this.idProveedor.setText("ID");
		this.idProveedor.setBounds(10, 31, 79, 29);
		getContentPane().add(idProveedor);
		
		this.nombreProveedor=new JLabel();
		this.nombreProveedor.setText("Nombre");
		this.nombreProveedor.setBounds(10, 61, 79, 29);
		getContentPane().add(nombreProveedor);
		
		this.telefonoProveedor=new JLabel();
		this.telefonoProveedor.setText("Telefono");
		this.telefonoProveedor.setBounds(10, 91, 79, 29);
		getContentPane().add(telefonoProveedor);
		
		this.direccionProveedor=new JLabel();
		this.direccionProveedor.setText("Direccion");
		this.direccionProveedor.setBounds(10, 121, 79, 29);
		getContentPane().add(direccionProveedor);
		
		this.ciudadProveedor=new JLabel();
		this.ciudadProveedor.setText("Ciudad");
		this.ciudadProveedor.setBounds(10, 154, 79, 29);
		getContentPane().add(ciudadProveedor);
		
			}
	
	private void crearIngreseDatos() {
		this.txtIdProveedor=new JTextField();
		this.txtIdProveedor.setBounds(90, 35, 180, 20);
		getContentPane().add(txtIdProveedor);
		
		this.txtNombreProveedor=new JTextField();
		this.txtNombreProveedor.setBounds(90, 65, 180, 20);
		getContentPane().add(txtNombreProveedor);
		
		this.txtTelefonoProveedor=new JTextField();
		this.txtTelefonoProveedor.setBounds(90, 95, 180, 20);
		getContentPane().add(txtTelefonoProveedor);
		
		this.txtDireccionProveedor=new JTextField();
		this.txtDireccionProveedor.setBounds(90, 125, 180, 20);
		getContentPane().add(txtDireccionProveedor);
		
		this.txtciudadProveedor=new JTextField();
		this.txtciudadProveedor.setBounds(90, 158, 180, 20);
		getContentPane().add(txtciudadProveedor);
		
		this.txtTipoDeProducto=new JTextField();
		this.txtTipoDeProducto.setBounds(100, 192, 180, 20);
		getContentPane().add(txtTipoDeProducto);
		
	
		

	}
	
	private void crearBotones() {
		this.btnCrearProveedor=new JButton();
		this.btnCrearProveedor.setText("Crear");
		this.btnCrearProveedor.setBounds(40, 280, 120, 20);
		btnCrearProveedor.addActionListener(this);
		getContentPane().add(btnCrearProveedor);
		
		this.btnVolver=new JButton();
		this.btnVolver.setText("Volver");
		this.btnVolver.setBounds(180, 280, 120, 20);
		btnVolver.addActionListener(this);
		getContentPane().add(btnVolver);
		
		JLabel tipoDeProducto = new JLabel();
		tipoDeProducto.setText("Tipo De Producto");
		tipoDeProducto.setBounds(10, 188, 120, 29);
		getContentPane().add(tipoDeProducto);
		

	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCrearProveedor) {
			if (txtIdProveedor.getText().equals("") || txtNombreProveedor.getText().equals("")
					|| txtTelefonoProveedor.getText().equals("") || txtDireccionProveedor.getText().equals("")
					|| txtciudadProveedor.getText().equals("")|| txtTipoDeProducto.getText().equals("")){
				JOptionPane.showMessageDialog(null, "Completa el formulario");
			} else {
				proveedor = new Proveedor();

//				dao = new DAO_Crear();
				proveedor.setId(txtIdProveedor.getText());
				proveedor.setNombre(txtNombreProveedor.getText());
				proveedor.setTelefono(txtTelefonoProveedor.getText());
				proveedor.setDireccion(txtDireccionProveedor.getText());
				proveedor.setCiudad(txtciudadProveedor.getText());
				proveedor.setTipoDeProducto(txtTipoDeProducto.getText());
				
				a.crearProveedor(proveedor);
//				dao.crearProductoDAO(producto);
//				especialidad.setNombreEspecialidad(txtEspecialidad.getText());
//				medico.crearEspecialidad(especialidad);
//				dao.crearEspecialidadDAO(especialidad);
//				dispo.setFecha(txtFechaMed.getText());
//				dispo.setHora_inicio(txtHoraInicio.getText());
//				dispo.setHora_fin(txtHoraFin.getText());
//				medico.crearDisponibilidad(dispo);
//				dao.crearDisponibilidadDAO(dispo);
				JOptionPane.showMessageDialog(null, "Proveedor Creado Exitosamente");
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
		txtIdProveedor.setText("");
		txtNombreProveedor.setText("");
		txtTelefonoProveedor.setText("");
		txtDireccionProveedor.setText("");
		txtciudadProveedor.setText("");
		txtTipoDeProducto.setText("");
		
		
	}
}

