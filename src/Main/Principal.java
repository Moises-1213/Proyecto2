package Main;

import java.time.LocalDate;
import java.util.Scanner;

import Implementacion.LogicaMetodos;
import Model.Computadoras;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lectura = null;
		
		String marca;
		LocalDate fechaRegistro;
		float precio;
		boolean estatus;
		int menuPrin;
		
		Computadoras computadora;
		
		LogicaMetodos imp = new LogicaMetodos();
		
		do {
			System.out.println("MENU PRINCIPAL");
			System.out.println("1---Alta");
			System.out.println("2--Mostrar");
			System.out.println("3--Buscar");
			System.out.println("4---Editar");
			System.out.println("5--Eliminar");
			System.out.println("6---Salir");
			
			lectura = new Scanner(System.in);
			menuPrin = lectura.nextInt();
			
			switch (menuPrin) {
			
			case 1:
				try {
					System.out.println("Ingrese la marca");
					lectura = new Scanner(System.in);
					marca = lectura.nextLine();
					
					System.out.println("Ingrese la fecha de registro: año-mes-dia");
					lectura = new Scanner(System.in);
					String fechaIngresado = lectura.nextLine();
					
					//polimorfismo
					fechaRegistro = LocalDate.parse(fechaIngresado);
					
					System.out.println("Ingrese precio");
					lectura = new Scanner(System.in);
					precio = lectura.nextFloat();
					
					
					System.out.println("Ingrese el estatus");
					lectura = new Scanner(System.in);
					estatus = lectura.nextBoolean();
					
					// cear el objeto
					computadora = new Computadoras(marca, fechaRegistro, precio, estatus);
				
					
					//agregar el hashMap
					imp.guardar(computadora);
					System.out.println("Se guardo");
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al guardr " + e.getCause());
				}
				break;
			case 2:
				
				imp.mostrar();
				break;
			case 3:
				
				System.out.println("Ingrese la marca");
				lectura = new Scanner(System.in);
				marca = lectura.nextLine();
				
				// buscar por marca
				computadora = imp.buscar(marca);
				
				if(computadora != null)
					System.out.println(computadora);
				else
					System.out.println("No existe el registro");
				break;
			case 4:
				
				System.out.println("Ingrese la marca");
				lectura = new Scanner(System.in);
				marca = lectura.nextLine();
				
				// buscar por marca
				computadora = imp.buscar(marca);
				
				if(computadora != null) {
					System.out.println(computadora);
				
				//Proceso para editar
				
				System.out.println("Ingrese el nuevo precio");
				lectura = new Scanner(System.in);
				precio = lectura.nextFloat();
				
				//Actualizar el objeto
				computadora.setPrecio(precio);
				
				//Actualizar en el hashMap
				imp.editar(computadora);
				System.out.println("Se edito");
				
				}else
					System.out.println("No existe el registro");
				
			break;
			case 5:
				System.out.println("Inggrese la marca a eliminar");
				lectura = new Scanner(System.in);
				marca = lectura.nextLine();
				
				//Eliminar
				imp.eliminar(marca);
				System.out.println("Se elimino");
				
				break;
			case 6:
				break;
				
			}
			
		} while(menuPrin < 6);

	}

}
