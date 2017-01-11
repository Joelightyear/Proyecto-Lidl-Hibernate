package org.empleodigital.struts.Lidl.jpa;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "pedido")

public class Pedido implements Serializable{
	
	@Id
	@Column(name = "id", unique = true)
	private int id;
	
	@Column (name = "confirmado", nullable = false)
	private boolean confirmado;
	
	@ManyToOne
	@JoinColumn (name = "cliente")
	private Cliente cliente;
	
	//private List <Producto> productos;

}
