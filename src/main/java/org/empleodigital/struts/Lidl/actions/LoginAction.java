package org.empleodigital.struts.Lidl.actions;

import org.empleodigital.struts.Lidl.jpa.Cliente;

import com.opensymphony.xwork2.ActionSupport;

import classes.GestorUsuarios;

public class LoginAction extends ActionSupport{

	private String usuario;
	private String contrasena;
	
	
	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getContrasena() {
		return contrasena;
	}


	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	//Método STRUTS 2
	/*public String execute() throws Exception{
		if (GestorUsuarios.usuarioExiste(usuario, contrasena)) {
			return SUCCESS;
		} else {
			return ERROR;	
		}
		
	}*/
	
	//Método HIBERNATE
	public String execute() throws Exception{
		
		Cliente cli = GestorUsuarios.loginUsuario(usuario, contrasena);
		
		if (cli!=null) {
			return SUCCESS;
		} else {
			return ERROR;	
		}
}
}
