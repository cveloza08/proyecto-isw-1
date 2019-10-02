package Interfaz;
	import java.awt.Toolkit;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.DefaultComboBoxModel;
	import javax.swing.JButton;
	import javax.swing.JComboBox;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JTextField;

import Modelo.Empleado;
import Modelo.Fachada;
import Modelo.Proveedor;
	import Modelo.Tienda;

	public class ConsultarEmpleado extends JFrame implements ActionListener{
		
		private JButton btnVolver;
		private JButton btnVerEmpleado;
		private JLabel idEmpleado;
		private JLabel nombreEmpleado;
		private JLabel telefonoEmpleado;
		private JLabel direccionEmpleado;
		private JLabel correoEmpleado;
		
		
		private JTextField txtIdEmpleado;
		private JTextField txtNombreEmpleado;
		private JTextField txtTelefonoEmpleado;
		private JTextField txtDireccionEmpleado;
		private JTextField txtCorreoEmpleado;
		
		private JComboBox listaEmpleado;
		;
		private JTextField txtFechaVencimiento;
		private Empleado empleado = new Empleado();

	    private Tienda a = Fachada.getTienda();
		
		public ConsultarEmpleado(){
			super();
//			setIconImage(Toolkit.getDefaultToolkit().getImage
//			(ClassLoader.getSystemResource("Imagenes/Medico.jpg")));
			this.setTitle("Consultar Proveedor");
			this.setSize(460, 350);
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
			this.idEmpleado.setBounds(10, 43, 70, 35);
			getContentPane().add(idEmpleado);
			
			this.nombreEmpleado=new JLabel();
			this.nombreEmpleado.setText("Nombre");
			this.nombreEmpleado.setBounds(10, 73, 70, 35);
			getContentPane().add(nombreEmpleado);
			
			this.telefonoEmpleado=new JLabel();
			this.telefonoEmpleado.setText("Telefono");
			this.telefonoEmpleado.setBounds(10, 130, 77, 40);
			getContentPane().add(telefonoEmpleado);
			
			this.direccionEmpleado=new JLabel();
			this.direccionEmpleado.setText("Direccion");
			this.direccionEmpleado.setBounds(10, 105, 70, 30);
			getContentPane().add(direccionEmpleado);
			
			this.correoEmpleado=new JLabel();
			this.correoEmpleado.setText("Ciudad");
			this.correoEmpleado.setBounds(10, 163, 77, 35);
			getContentPane().add(correoEmpleado);
			


		}
		
		private void crearIngresoDatos() {
			this.txtIdEmpleado=new JTextField();
			this.txtIdEmpleado.setEditable(false);
			this.txtIdEmpleado.setBounds(90, 50, 180, 20);
			getContentPane().add(txtIdEmpleado);
			
			this.txtNombreEmpleado=new JTextField();
			this.txtNombreEmpleado.setEditable(false);
			this.txtNombreEmpleado.setBounds(90, 80, 180, 20);
			getContentPane().add(txtNombreEmpleado);
			
			this.txtTelefonoEmpleado=new JTextField();
			this.txtTelefonoEmpleado.setEditable(false);
			this.txtTelefonoEmpleado.setBounds(90, 140, 180, 20);
			getContentPane().add(txtTelefonoEmpleado);
			
			this.txtDireccionEmpleado=new JTextField();
			this.txtDireccionEmpleado.setEditable(false);
			this.txtDireccionEmpleado.setBounds(90, 110, 180, 20);
			getContentPane().add(txtDireccionEmpleado);
			
			this.txtCorreoEmpleado=new JTextField();
			this.txtCorreoEmpleado.setEditable(false);
			this.txtCorreoEmpleado.setBounds(90, 170, 180, 20);
			getContentPane().add(txtCorreoEmpleado);
			
	
		}
		private void crearBotones() {
			this.btnVolver=new JButton();
			this.btnVolver.setText("Volver");
			this.btnVolver.setBounds(167, 272, 120, 20);
			btnVolver.addActionListener(this);
			getContentPane().add(btnVolver);
			
			this.btnVerEmpleado=new JButton();
			this.btnVerEmpleado.setText("Visualizar Empleado");
			this.btnVerEmpleado.setBounds(200, 20, 140, 20);
			btnVerEmpleado.addActionListener(this);
			getContentPane().add(btnVerEmpleado);
			
			this.listaEmpleado = new JComboBox();
			this.listaEmpleado.setBounds(10, 20, 149, 20);
			getContentPane().add(listaEmpleado);
			this.leerEmpleado();
			

			
			this.llenarEmpleado();
		}

		public void actionPerformed(ActionEvent e) {	
			if(e.getSource()==btnVolver){
				VentanaAdministrador ventana = new VentanaAdministrador();
				ventana.setVisible(true);
				setVisible(false);
			}
			
			if(e.getSource()==btnVerEmpleado){
				llenarEmpleado();
			}
		}
		
		private void leerEmpleado() {
			DefaultComboBoxModel mlista = new DefaultComboBoxModel();
			
			for (int i = 0; i < a.getLstSEmpleados().size(); i++) {
				mlista.addElement(a.getLstSEmpleados().get(i).getId());
			}
			listaEmpleado.setModel(mlista);
		}
		
		
		
		private void llenarEmpleado() {
			String id = (String) listaEmpleado.getSelectedItem();
			empleado = a.buscarEmpleado(empleado, id);
			txtIdEmpleado.setText(empleado.getId());
			txtNombreEmpleado.setText(empleado.getNombre());
			txtTelefonoEmpleado.setText(empleado.getTelefono());
			txtDireccionEmpleado.setText(empleado.getDireccion());
			txtCorreoEmpleado.setText(empleado.getCorreo());
		
		
		}
	}


