/** 
 * Ejercicio GitHub del tema 3
 * 
 * Version: 1.0
 * Fecha creación: 04/12/2018
 * Copyright @author Camilo Juan
 */

import java.util.Scanner;

/**
 * Clase Principal y unica que realizará todo el trabajo
 * 
 * @author Cjc
 *
 */
public class Principal {
	static int iteraciones = 1;

	/*
	 * Funcion principal
	 */
	public static void main(String[] args) {
		boolean seguir = true;
		int opcionMenu = -1;

		while (seguir) {
			System.out.println("\n\n\n\n\nIteracion " + iteraciones + " de nuestro proyecto GitHub.");

			MostrarMenu();
			opcionMenu = pedirOpcion();
			seguir = RealizarAccion(opcionMenu);

			iteraciones++;
		}

	}

	/*
	 * Nos pedira un valor del menú mostrado y devolvera un valor correcto, Esta
	 * función no debe ser modificada por los alumnos
	 */
	public static int pedirOpcion() {
		int opcion = -1;
		do {
			System.out.print("Opcion que desea elegir: ");
			opcion = Entero();
		} while (opcion < 0 || opcion > 30);

		return opcion;
	}

	/*
	 * Procedimiento que unicamente muestra el menú, aquí cada alumno debe
	 * introducir su numero de opción dependiendo del numero de ejecricio que tenga
	 * asignado. En mi caso, tengo el 0.- que es una presentación del proyecto.
	 * (anyadir el nombre de la persona que lo crea)
	 */
	public static void MostrarMenu() {
		System.out.println("Elige una opcion de las propuestas a continuacion/n/n");
		System.out.println("0.- Presentacion (Camilo Juan)");
		System.out.println("12.- Ejercicio12 (Carlos Mota)");
		System.out.println("22.- Ejercicio 22 (Sergi Cortés)");
		System.out.println("30.- Salir");
	}

	/*
	 * Nos devuelve un valor valido de nuestro menú
	 */
	public static int Entero() {
		/* Variables. */
		int entero = 0;
		Scanner input = new Scanner(System.in);

		System.out.print("Escribe un Entero: ");

		/*
		 * Bucle para pedir al usuario un entero y mientras no lo sea no sigue con la
		 * ejecución.
		 */
		while (!input.hasNextInt()) {
			System.out.print("Error, escribe un ENTERO Valido: ");
			input.next();
		}

		/* Almaceno el entero comprobado. */
		entero = input.nextInt();

		/* Una vez obtenido el entero lo devuelvo. */
		return entero;
	}

	/*
	 * Funcion que realizara la accion de llamar a cada uno de los ejercicios que
	 * deben haber creado cada uno de los alumnos. Debe ser modificada por cada uno
	 * de los alumnos
	 */

	public static boolean RealizarAccion(int pOpcionMenu) {

		boolean correcto = true;

		switch (pOpcionMenu) {
		case 0:
			System.out.println("Proyecto que une todos los ejercicios del Tema 4 en un solo fichero./n/n");
			break;
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		case 9: 
			ejercicio09();
			break;
		case 10:
			break;
		case 11:
			break;
		case 12:
			ejercicio12();
			break;
		case 13:
			break;
		case 14:
			break;
		case 15:
			break;
		case 16:
			break;
		case 17:
			break;
		case 18:
			break;
		case 19:
			break;
		case 20:
			break;
		case 21:
			break;
		case 22:
			ejercicio22();
			break;
		case 23:
			break;
		case 24:
			break;
		case 25:
			break;
		case 26:
			ejercicio26();
			break;

		case 30:
			System.out.println("Adios, gracias por participar/n/n");
			correcto = false;
			break;

		default:
			System.out.println("No es un ejercicio valido/n");
			break;
		}

		return correcto;
	}

	/*
	 * A partir de aqui cada alumno realizara su ejercicio del Tema 4
	 */
	public static void ejercicio12() {

		//Vectores

		//Array "original"
		int[] arrayOriginal = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		//Aray "copia"
		int[] arrayCopia = new int[10];

		System.out.print("arrayCopia = ");

		// Asignamos valores y los imprimimos (comprobamos que se está realizando correctamente la copia).
		for (int i = 0; i < arrayCopia.length; i++) {

		    arrayCopia[i] = arrayOriginal[i];
		    System.out.print(arrayCopia[i] + " ");

		}

    }
  
  public static void ejercicio09() {
		int i = 1;
		int num = 0;
		int notas = 0;
		int total = 0;
		int media = 0;
		int notamayor = 0;
		int[] arrayA = new int[num];

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce cuantas notas se van a leer");

		while (teclado.hasNextInt() == false) {// bucle que compueba si es un entero
			System.out.print("Introduce un entero");
			teclado.next();
		}
		num = teclado.nextInt();

		for (i = 1; i <= num; i++) {// bucle para introducir los numeros que se han solicitado antes
			System.out.print("Introduce  numeros ");

			while (teclado.hasNextInt() == false) {// bucle que compueba si es un entero
				System.out.print("Introduce un entero");
				teclado.next();
			}
			notas = teclado.nextInt();
			while (notas >= 0 && notas <= 10) {// bucle que comprueba si el valor esta entre 0 y 10
				arrayA[num] = notas;
				System.out.print("nota valida ");

				if (notas > notamayor) {
					notamayor = notas;
				}

				total = total + notas;
			}
		}
		media = total / num;

		System.out.println("notas: " + arrayA);

		System.out.print("media: " + media + "nota mas alta" + notamayor);

	}

	/**
	 * Ejercicio 22 del Tema 4 - Sergi Cortés
	 */
	public static void ejercicio22()
	{
		/* Variables */
		int posiPrimero=0;														// Primera Posición del caracter
		int posiUltimo=0;														// Ultima Posición del caracter
		char caBusca=' ';														// Caracter a buscar
		String cadena="";														// Frase
		Scanner input=new Scanner (System.in);
		
		System.out.println("Introduce un texto (Puede contener espacios)");
		cadena=input.nextLine();												// Usuario Introduce texto
		
		System.out.print("Caracter a buscar: ");
		caBusca=input.next().charAt(0);											// Usuario Introduce caracter a buscar
		
		/* Si el caracter existe continua */
		if(cadena.indexOf(caBusca)!=-1)
		{
			posiPrimero=cadena.indexOf(caBusca);								// Busca el primer "indice" del caracter que le pasemos
			System.out.println("La primera posicion: "+posiPrimero);
			
			posiUltimo=cadena.lastIndexOf(caBusca);								// Busca el ultimo "indice" del caracter que le pasemos
			System.out.println("La Ultima posición: "+posiUltimo);
		}
		
		/* Si no existe se imprime un mensaje al respecto */
		else
			System.out.println("No existe este caracter en la frase.");
	}
	
	public static void ejercicio26()
	{
		int contador=0;															/*En estas lineas Iniciamos las variables*/
		boolean sicierto=false;
		String cadena=" ";
		Scanner kb=new Scanner (System.in);
		
		System.out.println("Inserte una frase");								/*Aqui pedimos que inserte una cadena y la guardamos en la string cadena */
		cadena=kb.nextLine();
		
		char [] array=new char [cadena.length()];								/*Inicializamos la array de char tan larga como sea la cadena*/
		
		for(contador=0;contador<cadena.length();contador++) 					/*Aqui nos metemos en un bucle, hasta que contador sea menor que la longitud de la cadena */
		{
			array[contador] = cadena.charAt(contador); /* Aqui insertamos en el array caracter a caracter */
			System.out.print(cadena.charAt(contador) + " = " + array[contador] + " :");

			sicierto = array[contador] == cadena
					.charAt(contador); /* Aqui hacemos una comparacion para ver si son iguales o no */

			if (sicierto) /* Si es cierto al lado de cada letra aparecera que coinciden */
			{
				System.out.println("Coinciden");
			} else /* Si no dira que no coinciden */
			{
				System.out.println("No coincide");
			}

		}
	}

}
