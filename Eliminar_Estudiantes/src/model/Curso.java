package model;

public class Curso {
	
	String nombre;
	int numEstudiantes;
	
	public Curso(String nombre, int numEstudiantes) {
		
		this.nombre = nombre;
		this.numEstudiantes = numEstudiantes;
	}

	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumEstudiantes() {
		return numEstudiantes;
	}

	public void setNumEstudiantes(int numEstudiantes) {
		this.numEstudiantes = numEstudiantes;
	}
	
	

}

	
