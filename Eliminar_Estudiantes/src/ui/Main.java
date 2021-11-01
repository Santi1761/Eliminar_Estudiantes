package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import model.Curso;
import model.Estudiante;


public class Main {
	
	private static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	private static Curso course;
	

	public static void main(String [] args) {
		
		Menu();
	}
	
	
	public static void Menu() {
		
		int option = -1;
		
		try {
			
			System.out.println("Holaa bienvenid@ :D");
			System.out.print("Porfa escribe el nombre del curso: ");
			String nameC = buffer.readLine();
			System.out.print("Ahora el Numero de estudiantes del curso: ");
			int numberE = Integer.parseInt(buffer.readLine());
			
			course = new Curso(nameC, numberE);
			
		} catch (IOException e1) {
			
		}
			
		
		do {
			
			try {
				
				option = Menu2();
				
			} catch (IOException e) {
				
				System.out.println("Ingresa el texto: ");
			}
			System.out.println("\n");
			
			
			switch(option){
			
			case 1:
				try {
					
					addStudent();
				} catch (IOException e) {
					
					System.out.println("Ingresa el texto: ");
				}
				break;
				
			case 2:
				try {
					deleteStudent();
					
				} catch (IOException e) {
					
					System.out.println("Ingresa el texto: ");
				}
				break;
				
			case 3:
				
				printStudents();
				break;
				
			default:
				
				option = 0;
				break;
			}
			
		} while(option != 0);
	}
	
	
	public static int Menu2() throws IOException {
		
		System.out.print("1. Agregar un nuevo estudiante\n"
				+ "2. Eliminar un estudiante\n"
				+ "3. Imprimir la lista de estudiante\n"
				+ "4. Para salir\n"
				+ "Opcion: ");
		
		String opt = buffer.readLine();
		return Integer.parseInt(opt);
	}
	
	
	public static void addStudent() throws IOException {
		
		System.out.print("Escribe el nombre: ");
		String name = buffer.readLine();
		System.out.print("Escribe el codigo: ");
		String code = buffer.readLine();
				
		Estudiante nuevo = new Estudiante(code, name);
		course.addE(nuevo);
	}
	
	
	public static void deleteStudent() throws IOException {
		
		System.out.print("Escribe el codigo del estudiante: ");
		String code = buffer.readLine();
		
		course.deleteE(code);
	}
	
	
	public static void printStudents() {
		
		System.out.println("Estos son todos los estudiantes :)");
		System.out.println(course.printE());
	}
	
		

}
