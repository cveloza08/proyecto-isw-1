package Interfaz;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import Modelo.Fachada;
import Modelo.Tienda;

public class VentanaPrincipal extends JFrame implements ActionListener{
	
	
private JMenuBar menuClientes;
private JMenu empleados;
private JMenu nuestroCentro;
private JMenu contactos;
private JMenuItem iniciarSesion;
private JMenuItem historia;
private JMenuItem misionVision;
private JMenuItem politica;
private JMenuItem telefono;
private JMenuItem ubicacion;

public VentanaPrincipal(Tienda tienda){
	super();
			setIconImage(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Hospital.jpg")));
			this.setTitle(" -- INVENTARIO(Pagina Principal)");
			this.setSize(500, 400);
			this.setContentPane(new JLabel(new ImageIcon(ClassLoader.getSystemResource("Imagenes/SupermercadoVentanaPrincipal.jpg"))));
	        
			this.setLocationRelativeTo(null);
			getContentPane().setLayout(null);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.crearMenu();
		}
		

		private void crearMenu() {
			menuClientes = new JMenuBar();
			setJMenuBar(menuClientes);
			
			empleados = new JMenu("Empleados");
			menuClientes.add(empleados);
			
			nuestroCentro = new JMenu("Nuestro Centro");
			menuClientes.add(nuestroCentro);
			
			contactos = new JMenu("Contactos");
			menuClientes.add(contactos);
			
			iniciarSesion = new JMenuItem("IniciarSesion");
			iniciarSesion.setIcon(new ImageIcon((ClassLoader.getSystemResource("Imagenes/LoginEmpleado.jpg"))));
			iniciarSesion.addActionListener(this);
			empleados.add(iniciarSesion);
			
			historia = new JMenuItem("Historia");
			historia.setIcon(new ImageIcon((ClassLoader.getSystemResource("Imagenes/Historia.png"))));
			historia.addActionListener(this);
			nuestroCentro.add(historia);
			
			misionVision = new JMenuItem("Mision y Vision");
			misionVision.setIcon(new ImageIcon((ClassLoader.getSystemResource("Imagenes/Mision.jpg"))));
			misionVision.addActionListener(this);
			nuestroCentro.add(misionVision);
			
			politica = new JMenuItem("Politica de Calidad");
			politica.setIcon(new ImageIcon((ClassLoader.getSystemResource("Imagenes/Politica.jpg"))));
			politica.addActionListener(this);
			nuestroCentro.add(politica);
			
			telefono = new JMenuItem("Telefonos");
			telefono.setIcon(new ImageIcon((ClassLoader.getSystemResource("Imagenes/Telefono.jpg"))));
			telefono.addActionListener(this);
			contactos.add(telefono);
			
			ubicacion = new JMenuItem("Ubicacion");
			ubicacion.setIcon(new ImageIcon((ClassLoader.getSystemResource("Imagenes/Ubicacion.png"))));
			ubicacion.addActionListener(this);
			contactos.add(ubicacion);
		}

		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource()==iniciarSesion){
				InicioSesion login = new InicioSesion();
				login.setVisible(true);
				setVisible(false);
			}
			
//			if(e.getSource()==historia){
//				Historia v = new Historia();
//				v.setVisible(true);
//				setVisible(false);
//			}
			
//			if(e.getSource()==misionVision){
//				MisionVision v = new MisionVision();
//				v.setVisible(true);
//				setVisible(false);
//			}
//			
//			if(e.getSource()==politica){
//				Politica v = new Politica();
//				v.setVisible(true);
//				setVisible(false);
//			}
//			
//			if(e.getSource()==telefono){
//				Telefono v = new Telefono();
//				v.setVisible(true);
//				setVisible(false);
//			}
//			
//			if(e.getSource()==ubicacion){
//				Ubicacion v = new Ubicacion();
//				v.setVisible(true);
//				setVisible(false);
//			}
//		}
//	}
}
}
