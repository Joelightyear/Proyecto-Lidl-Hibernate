package org.empleodigital.struts.Lidl.actions;

import com.opensymphony.xwork2.ActionSupport;

import classes.GestorUsuarios;

public class RegisterAction extends ActionSupport {

	private String nombre;
	private int edad;
	private String usuario;
	private int contrasena;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public int getContrasena() {
		return contrasena;
	}

	public void setContrasena(int contrasena) {
		this.contrasena = contrasena;
	}

	//Método normal de Struts2
	
	/*public String execute() throws Exception{
		
		if (GestorUsuarios.usuarioExiste(usuario, contrasena, nombre, edad)) {
			return SUCCESS;
		} else {
			return ERROR;
		}		
	}*/
	

//Método HIBERNATE
public String execute() throws Exception{
		
		if (GestorUsuarios.nuevoUsuario(nombre, edad, usuario, contrasena)) {
			return SUCCESS;
		} else {
			return ERROR;
		}
}


}


