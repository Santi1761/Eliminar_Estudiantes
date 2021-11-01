package model;

public class Curso {
	
	private String nombre;
	private int numEstudiantes;
	private Estudiante primero, ultimo;
	
	public Curso(String name, int numberE) {
		
		nombre = name;
		numEstudiantes = numberE;
	}
	
	public void addE(Estudiante student) {
		
		if(primero == null) {
			
			primero = student;
			ultimo = student;
			primero.setAnterior(ultimo);
			primero.setSiguiente(ultimo);
			ultimo.setSiguiente(primero);
			ultimo.setAnterior(primero);
			
		}else {
			
			ultimo.setSiguiente(student);
			student.setSiguiente(primero);
			student.setAnterior(ultimo);
			ultimo = student;
		}
	}
	
	public void deleteE(String aux) {
		
		Estudiante temporary = primero;
		
		do {
			if(temporary.getCodigo().equals(aux)) {
				if(temporary == primero && temporary.getSiguiente() == primero) {
					primero = null;
				} else if(temporary == primero && temporary.getSiguiente() != primero) {
					primero = primero.getSiguiente();
					ultimo.setSiguiente(primero);
				} else {
					temporary.getAnterior().setSiguiente(temporary.getSiguiente());
					temporary.getSiguiente().setAnterior(temporary.getAnterior());
					temporary = primero;
				}
			} else {
				temporary = temporary.getSiguiente();
			}
		}while(temporary != primero);
	}
	
	
	public String printE() {
		
		String print = "";
		Estudiante temporary = primero;
		
		if(primero != null) {
			
			do {
				print += temporary.toString() + "\n";
				temporary = temporary.getSiguiente();
			}while(temporary != primero);
			
		} else {
			
			print = "No exiten estudiantes\n";
		}
		
		return print;
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

	public Estudiante getPrimero() {
		return primero;
	}

	public void setPrimero(Estudiante primero) {
		this.primero = primero;
	}

	public Estudiante getUltimo() {
		return ultimo;
	}

	public void setUltimo(Estudiante ultimo) {
		this.ultimo = ultimo;
	}
	
	
	

}

	
