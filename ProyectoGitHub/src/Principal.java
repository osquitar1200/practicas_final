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
			ejercicio16();
			break;
		case 17:
			break;
		case 18:
			break;
		case 19:
			break;
		case 20:
			ejercicio20();
			break;
		case 21:
			break;
		case 22:
			ejercicio22();
			break;
		case 23:
			break;
		case 24:
			ejercicio24();
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
	
	/* Ejercicio 16, Tema 4, Alejandro Rozas */
	public static void ejercicio16() {

		double[][] tabla = { { 1.0, 2.0, 3.0, 4.0 }, { 5.0, 6.0, 7.0, 8.0 }, { 9.0, 10.0, 11.0, 12.0 },
				{ 13.0, 14.0, 15.0, 16.0 } }; // Array bidimensional con numeros reales
												// Ya introducidos

		// Este for pasara valor a valor todos los valores de el Array
		for (int fila = 0; fila < tabla.length; fila++) {
			for (int columna = 0; columna < tabla[fila].length; columna++) {
				System.out.print(tabla[fila][columna] + "\t"); // Imprimira cada valor del array si se cumplen las
																// condiciones

			}
			System.out.println("");
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
	public static void ejercicio24(){
		/*
		 * declaramos las variables
		 */
		String[] cadena = {"wz","ap","wx", "ac"}; 
		int cont = 0;
		int cont2 = 0;
		String aux = "a";
		
		/*
		 * En este bucle for iremos augmentando el contador "cont" que nos servira
		 *  para cojer las posiciones de los valores a comparar
		 */
		for (cont = 1; cont < cadena.length; cont++) { 
			/*
			 *En este bucle for iremos augmentando el contador "cont2" que nos
			 * servira para cojer las posiciones de comparacion
			 */
			for (cont2 = cont; cont2 > 0; cont2--) {				
				
				/*
				 *  En este if comprovamos si la comparacion es negativa,en caso 
				 *  de serlo cambiaremos los valores de posicion
				 */
				if (cadena[cont2].compareTo(cadena[cont2-1]) < 0) {
					
					/*
					 * Utilizamos la variable aux para almacenar el valor de la cadena "pos x+1"
					 */
					aux = cadena[cont2]; 	
					/*
					 *  Cambiamos el valor de la cadena para cambiar el orden "pos x+1" por "pos x"
					 */
					cadena[cont2] = cadena[cont2-1];
					/*
					 * Volvemos a cambiar el valor de la cadena para dejarlo ya ordenado "pos x" = al valor de "aux"
					 */
					cadena[cont2-1] = aux; 							
				}

			}

		}
		/*
		 * En este bucle for utilizamos el contador para imprimir todas
		 * las posiciones del array
		 */
		for (cont = 0; cont < cadena.length; cont++) { 				
			System.out.print(cadena[cont] + " ");
		}
	}
	public static void ejercicio20(){
		/*
								 * Coger el valor de la string introducida por teclado y cambiar las minúsculas
								 * por las mayúsculas
								 */

		public static void main(String[] args) {

			int longitud = 0;
			int i = 0;
			char letra = 'a';
			String frase = "";
			Scanner teclado = new Scanner(System.in);

			/* Fin de las declaraciones de variables */

			System.out.print("Escriba una frase: ");
			frase = teclado.nextLine();
			longitud = frase.length();

			for (i = 0; i < longitud; i++) { // Este for se encarga de pasar por cada carácter de la cadena

				if ((frase.charAt(i) >= 'a') && (frase.charAt(i) <= 'z')) { // Si está entre la a y la z minúsculas, hazla mayúscula

					letra = (char) (frase.charAt(i) - ' ');
					System.out.print(letra);

				} else {

					letra = (char) (frase.charAt(i)); // Sino, imprime la letra tal cual
					System.out.print(letra);

				}
			}

		}
	}
}
