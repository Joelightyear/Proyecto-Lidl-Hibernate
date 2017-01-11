package org.empleodigital.struts.Lidl.jpa;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")

public class Cliente implements Serializable{

	@Id
    @Column(name = "id", unique = true)
    private int id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "edad", nullable = false)
    private int edad;
    
    @Column(name = "usuario", nullable = false)
    private String usuario;
    
    @Column(name = "contrasena", nullable = false)
    private int contrasena;
    
    @OneToMany(mappedBy = "cliente")
    private List<Pedido> pedidos;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", usuario=" + usuario + ", contrasena="
				+ contrasena + ", pedidos=" + pedidos + "]";
	}

	
    
}
