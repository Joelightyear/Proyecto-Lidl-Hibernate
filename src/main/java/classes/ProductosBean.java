package classes;

public class ProductosBean {

	private String nombre;
	private double precio;
	private double peso;
	private String descripcion;
	private String imagen;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public ProductosBean(String nombre, double precio, double peso, String descripcion, String imagen) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.descripcion = descripcion;
		this.imagen = imagen;
	}
	
	
}
