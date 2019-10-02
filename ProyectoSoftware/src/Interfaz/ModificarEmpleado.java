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
import Modelo.Empleado;
import Modelo.Fachada;
import Modelo.Proveedor;
import Modelo.Tienda;
//import Modelo.CentroMedico;
//import Modelo.Disponibilidad;
//import Modelo.Especialidad;
//import Modelo.Medicos;

public class ModificarEmpleado extends JFrame implements ActionListener{
	private JButton btnVolver;
	private JButton btnVerEmpleado;
	private JButton btnModificarEmpleador;
    private JLabel idEmpleado;
	private JLabel nombreEmpleado;
	private JLabel telefonoEmpleado;
	private JLabel direccionEmpleado;
	private JLabel correoEmpleadoo;
	
	private JTextField txtIdEmpleado;
	private JTextField txtNombreEmpleador;
	private JTextField txtTelefonoEmpleado;
	private JTextField txtDireccionEmpleado;
	private JTextField txtCorreoEmpleado;
	

	private JComboBox listaEmpleado;

	private Empleado empleado = new Empleado();

//	private DAO_Modificar dao = new DAO_Modificar();
	private Tienda a = Fachada.getTienda();
	
	public ModificarEmpleado(){
		super();
//		setIconImage(Toolkit.getDefaultToolkit().getImage
//		(ClassLoader.getSystemResource("Imagenes/Medico.jpg")));
		this.setTitle("Modificar Empleado");
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
		this.idEmpleado=new JLabel();
		this.idEmpleado.setText("ID");
		this.idEmpleado.setBounds(10, 39, 75, 42);
		getContentPane().add(idEmpleado);
		
		this.nombreEmpleado=new JLabel();
		this.nombreEmpleado.setText("Nombre");
		this.nombreEmpleado.setBounds(10, 50, 200, 80);
		getContentPane().add(nombreEmpleado);
		
		this.telefonoEmpleado=new JLabel();
		this.telefonoEmpleado.setText("Telefono");
		this.telefonoEmpleado.setBounds(10, 80, 200, 80);
		getContentPane().add(telefonoEmpleado);
		
		this.direccionEmpleado=new JLabel();
		this.direccionEmpleado.setText("Direccion");
		this.direccionEmpleado.setBounds(10, 110, 200, 80);
		getContentPane().add(direccionEmpleado);
		
		this.correoEmpleadoo=new JLabel();
		this.correoEmpleadoo.setText("Correo");
		this.correoEmpleadoo.setBounds(10, 140, 200, 80);
		getContentPane().add(correoEmpleadoo);
		


		

	}
	
	private void crearIngresoDatos() {
		this.txtIdEmpleado=new JTextField();
		this.txtIdEmpleado.setBounds(90, 50, 180, 20);
		getContentPane().add(txtIdEmpleado);
		
		this.txtNombreEmpleador=new JTextField();
		this.txtNombreEmpleador.setBounds(90, 80, 180, 20);
		getContentPane().add(txtNombreEmpleador);
		
		this.txtTelefonoEmpleado=new JTextField();
		this.txtTelefonoEmpleado.setBounds(90, 110, 180, 20);
		getContentPane().add(txtTelefonoEmpleado);
		
		this.txtDireccionEmpleado=new JTextField();
		this.txtDireccionEmpleado.setBounds(90, 140, 180, 20);
		getContentPane().add(txtDireccionEmpleado);
		
		this.txtCorreoEmpleado=new JTextField();
		this.txtCorreoEmpleado.setBounds(90, 171, 180, 20);
		getContentPane().add(txtCorreoEmpleado);


		

	}
	private void crearBotones() {
		this.btnVolver=new JButton();
		this.btnVolver.setText("Volver");
		this.btnVolver.setBounds(300, 290, 120, 20);
		btnVolver.addActionListener(this);
		getContentPane().add(btnVolver);
		

		
		this.btnModificarEmpleador=new JButton();
		this.btnModificarEmpleador.setText("Modificar Empleado");
		this.btnModificarEmpleador.setBounds(20, 290, 150, 20);
		btnModificarEmpleador.addActionListener(this);
		getContentPane().add(btnModificarEmpleador);
		
		this.btnVerEmpleado=new JButton();
		this.btnVerEmpleado.setText("Visualizar Empleado");
		this.btnVerEmpleado.setBounds(200, 20, 140, 20);
		btnVerEmpleado.addActionListener(this);
		getContentPane().add(btnVerEmpleado);
		
		this.listaEmpleado = new JComboBox();
		this.listaEmpleado.setBounds(10, 20, 149, 20);
		getContentPane().add(listaEmpleado);
		this.leerEmpleado();

	}
	public void actionPerformed(ActionEvent e) {
		String nombreEmpleado = (String) listaEmpleado.getSelectedItem();
		empleado = a.buscarEmpleado(empleado, nombreEmpleado);
		if(e.getSource()==btnVolver){
			VentanaAdministrador ventana = new VentanaAdministrador();
			ventana.setVisible(true);
			setVisible(false);
		}
		
		if(e.getSource()==btnVerEmpleado){
			llenarProducto();
		}
		
		if(e.getSource()==btnModificarEmpleador){
			empleado.setNombre(txtNombreEmpleador.getText());
			empleado.setId(txtIdEmpleado.getText());
			empleado.setTelefono(txtTelefonoEmpleado.getText());
			empleado.setDireccion(txtDireccionEmpleado.getText());
			empleado.setCorreo(txtCorreoEmpleado.getText());
			
		
//			dao.modificarMedicoDAO(medico);
//			espe.setNombreEspecialidad(txtPrecioVenta.getText());
//			dao.modificarEspecialidadDAO(espe,medico);
//			dispo.setFecha(txtFechaIngreso.getText());
//			dispo.setHora_inicio(txtFechaDeVencimiento.getText());
//			dispo.setHora_fin(txtHoraFin.getText());
//			dao.modificarDisponibilidadDAO(dispo,medico);
			ModificarEmpleado eli= new ModificarEmpleado();
			this.setVisible(false);
			eli.setVisible(true);
			JOptionPane.showMessageDialog(null, "Empleado  Modificado");
		}
		
	}
	private void leerEmpleado() {
		DefaultComboBoxModel mlista = new DefaultComboBoxModel();
		
		for (int i = 0; i < a.getLstSEmpleados().size(); i++) {
			mlista.addElement(a.getLstSEmpleados().get(i).getId());
		}
		listaEmpleado.setModel(mlista);
		getContentPane().add(listaEmpleado);
	}
	
	private void llenarProducto() {
		String id = (String) listaEmpleado.getSelectedItem();
		empleado = a.buscarEmpleado(empleado, id);
		txtIdEmpleado.setText(empleado.getId());
		txtNombreEmpleador.setText(empleado.getNombre());
		txtTelefonoEmpleado.setText(empleado.getTelefono());
		txtDireccionEmpleado.setText(empleado.getDireccion());
		txtCorreoEmpleado.setText(empleado.getCorreo());

	
		
	}
	
	
}