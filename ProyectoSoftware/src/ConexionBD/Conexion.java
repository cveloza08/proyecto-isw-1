package ConexionBD;

import java.sql.*;

import javax.swing.JOptionPane;

public class Conexion {
	private static String bd = "INVENTARIO";
	private static String login = "root";
	private static String password = "";
	static String url = "jdbc:mysql://localhost:3306/" + bd;
	private static String server = "127.0.0.1";
	public static Connection connection;

	public Conexion() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String connectionUrl = "jdbc:sqlserver://" + server + ":" + "3306" + ";user=" + login
					+ ";password=" + password + ";databasename=" + bd;
//			connection = DriverManager.getConnection(connectionUrl);
			connection = DriverManager.getConnection(url, login, password);
			if (connection != null) {
				System.out.println("Conexion a base de datos " + bd + " OK\n");
			}
		} catch (SQLException | ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.toString());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		}
	}

	public static Connection getConnection() {
		if (connection==null){ new Conexion(); } return connection;
	}

	public void desconectar() {
		connection = null;
	}
}