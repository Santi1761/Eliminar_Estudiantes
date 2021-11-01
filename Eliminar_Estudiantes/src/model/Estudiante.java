package model;

public class Estudiante {
	
	private String codigo, nombre;
	private Estudiante siguiente, anterior;
	
	public Estudiante(String code, String name) {
		
		codigo = code;
		nombre = name;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Estudiante getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Estudiante siguiente) {
		this.siguiente = siguiente;
	}

	public Estudiante getAnterior() {
		return anterior;
	}

	public void setAnterior(Estudiante anterior) {
		this.anterior = anterior;
	}
	
	public String toString() {
		return codigo + " - " + nombre;
	}
	

}
