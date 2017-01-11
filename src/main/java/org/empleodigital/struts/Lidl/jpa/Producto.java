package org.empleodigital.struts.Lidl.jpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table ( name = "producto")
public class Producto implements Serializable {
	
	@Id
	@Column(name = "id", unique = true)
	private int id;
	
	@Column ( name = "nombre", nullable = false)
	private String nombre;
	
	@Column ( name = "peso", nullable = false)
	private double peso;
	
	@Column ( name = "precio", nullable = false)
	private double precio;
	
	@Column ( name = "imagen", nullable = false)
	private String imagen;
	
	@Column ( name = "descripcion", nullable = false)
	private String descripcion;

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

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", peso=" + peso + ", precio=" + precio + ", imagen="
				+ imagen + ", descripcion=" + descripcion + "]";
	}
	
	

}
