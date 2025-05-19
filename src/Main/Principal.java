package Main;

import java.util.Scanner;

import Implementacion.ImplementacionIngCivil;
import Model.IngCivil;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lectura = null;
		
		long cedula;
		String carrera, grado;
		float salario;
		
		IngCivil civil = null;
		
		int menuPrin, menuCivil, menuComp;
		
		ImplementacionIngCivil impCivil = new ImplementacionIngCivil();
		
		do {
			System.out.println("Menu principal");
			System.out.println("1---CRUD de Ing. Civil");
			System.out.println("2---CRUD de Ing en Computacion");
			System.out.println("3---Salir");
			
			
			lectura = new Scanner(System.in);
			menuPrin = lectura.nextInt();
			
			switch (menuPrin) {
			case 1:
				do {
					System.out.println("Menu de Ingenieria Civil");
					System.out.println("1---Alta");
					System.out.println("2---Mostrar");
					System.out.println("3---Buscar");
					System.out.println("4---Editar");
					System.out.println("5---Eliminar");
					System.out.println("6---Regresar al menu principal");
					
					lectura = new Scanner(System.in);
					menuCivil = lectura.nextInt();
					
					switch (menuCivil) {
					case 1:
						try {
							//Cedula
							System.out.println("Ingresa el numero de cedula");
							lectura = new Scanner(System.in);
							cedula = lectura.nextLong();
							//Carrera
							System.out.println("Ingresa la carrera");
							lectura = new Scanner(System.in);
							carrera = lectura.nextLine();
							//Grado
							System.out.println("Ingresa el grado");
							lectura = new Scanner(System.in);
							grado = lectura.nextLine();
							//Salario
							System.out.println("Ingresa el salario");
							lectura = new Scanner(System.in);
							salario = lectura.nextFloat();
							
							
							civil = new IngCivil((long) 123456, "Ingeniero Constructor", "Maestria", 20000.05f);
							
							impCivil.guardar(civil);							
						} catch (Exception e) {
							// TODO: handle exception
							System.err.println("Error al agregar");
						}
						break;
					case 2:
						impCivil.mostrar();
						break;
					case 3:
						try {
							System.out.println("Ingrese la cedula");
							lectura = new Scanner(System.in);
							cedula = lectura.nextLong();
							
							//Buscar
							civil = impCivil.buscar(cedula);
							System.out.println("Se encontro " + cedula);
						} catch (Exception e) {
							// TODO: handle exception
							System.err.println("Error al buscar");
						}
						break;
					case 4:
						try {
							System.out.println("Ingrese la cedula");
							lectura = new Scanner(System.in);
							cedula = lectura.nextLong();
							
							//Buscar
							civil = impCivil.buscar(cedula);
							System.out.println("Se encontro " + cedula);
							
							//Editamos
							System.out.println("Ingrese el nuevo grado");
							lectura = new Scanner(System.in);
							grado = lectura.nextLine();
							
							//Actualizamos objeto
							civil.setGrado(grado);
							
							//Actualizamos el hashmap
							impCivil.editar(civil);
							System.out.println("Se edito con exito");
						} catch (Exception e) {
							// TODO: handle exception
							System.err.println("Error al editar");
						}
						break;
						
					case 5:
						try {
							System.out.println("Ingrese la cedula");
							lectura = new Scanner(System.in);
							cedula = lectura.nextLong();
							
							//Eliminar
							impCivil.eliminar(cedula);
							System.out.println("Se elimino correctamente");
													
														
						} catch (Exception e) {
							// TODO: handle exception
							System.err.println("Error al eliminar");
						}
						break;
					case 6:
						System.out.println("Saliendo del sistema");
						break;
					}
					
				} while (menuCivil < 6);
				break;

			case 2:
				do {
					System.out.println("Menu de Ingenieria en Computación");
					System.out.println("1---Alta");
					System.out.println("2---Mostrar");
					System.out.println("3---Buscar");
					System.out.println("4---Editar");
					System.out.println("5---Eliminar");
					System.out.println("6---Regresar al menu principal");
					
					lectura = new Scanner(System.in);
					menuComp = lectura.nextInt();
					
				} while (menuComp < 6);
				
				break;
			case 3:
				break;
			}
			
		} while (menuPrin<3);

	}

}
