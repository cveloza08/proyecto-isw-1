package ConexionBD;

import java.sql.SQLException;
import java.sql.Statement;



public class DAO_Modificar {
/*
	public DAO_Modificar(){
		
	}
	
	public void modificarMedicoDAO(Medicos medico) {
		Conexion conex = new Conexion();
		try {
			Statement estatuto = conex.getConnection().createStatement();
			estatuto.executeUpdate("UPDATE medicos SET NombreMedico = '" 
			+ medico.getNombreMedico() + "', ApellidoMedico = '" 
			+ medico.getApellidoMedico() + "', TelefonoMedico = '" 
			+ medico.getTelefonoMedico()+ "' WHERE IdentificacionMedico = '"
			+ medico.getIdentificacion() + "' ");
			estatuto.close();
			conex.desconectar();
			
		} catch (SQLException e1) {
			System.out.println(e1.getMessage());
		}
	}
	
	public void modificarEspecialidadDAO(Especialidad especialidad,Medicos medico) {
		Conexion conex = new Conexion();
		try {
			Statement estatuto = conex.getConnection().createStatement();
			estatuto.executeUpdate("UPDATE especialidad SET NombreEspecialidad = '" 
			+ especialidad.getNombreEspecialidad() +
			"' WHERE IdentificacionMedico = '"
			+ medico.getIdentificacion() + "' ");
			estatuto.close();
			conex.desconectar();
			
		} catch (SQLException e1) {
			System.out.println(e1.getMessage());
		}
	}
	
	public void modificarDisponibilidadDAO(Disponibilidad dispo,Medicos medico) {
		Conexion conex = new Conexion();
		try {
			Statement estatuto = conex.getConnection().createStatement();
			estatuto.executeUpdate("UPDATE disponibilidad SET FechaDisponibilidad = '" 
			+ dispo.getFecha() + "', HoraInicio = '" 
			+ dispo.getHora_inicio() + "', HoraFin = '" 
			+ dispo.getHora_fin() + "' WHERE IdentificacionMedico = '"
			+ medico.getIdentificacion()+ "' ");
			estatuto.close();
			conex.desconectar();
			
		} catch (SQLException e1) {
			System.out.println(e1.getMessage());
		}
	}
	
	public void modificarServicioDAO(Servicios servicio) {
		Conexion conex = new Conexion();
		try {
			Statement estatuto = conex.getConnection().createStatement();
			estatuto.executeUpdate("UPDATE servicios SET DescripcionServicio = '" 
			+ servicio.getDescripcionServicio() + "', ComplejidadServicio = '" 
			+ servicio.getComplejidadServicio() + "', DuracionServicio = '" 
			+ servicio.getDuracionServicio() + "', CostoServicio = '" 
			+ servicio.getCostoServicio()+ "' WHERE NombreServicio = '"
			+ servicio.getNombreServicio() + "' ");
			estatuto.close();
			conex.desconectar();
			
		} catch (SQLException e1) {
			System.out.println(e1.getMessage());
		}
	}*/
}
