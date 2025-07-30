import java.util.Scanner;
public class menu{
	public static void main(String[] args){
		Scanner entra = new Scanner(System.in);
		numeros_perfectos numero = new numeros_perfectos();
		tabla_multiplicar tabla = new tabla_multiplicar();
		collatz coll = new collatz();
		contrasena_segura contrasena = new contrasena_segura();
		int sel;
		do {
			System.out.println("0- salir");
			System.out.println("1- numeros perfectos");
			System.out.println("2- tabla de multiplicar");
			System.out.println("3- serie de collatz");
			System.out.println("4- generar una contraseña segura");
			sel = entra.nextInt();
			switch (sel){
				case 1:
					numero.comienzo();
					continue;
				case 2:
					tabla.comienzo();
					continue;
				case 3:
					coll.comienzo();
					continue;
				case 4:
					contrasena.comienzo();
					continue;
			}
		}while(sel != 0);
		System.out.println("Gracias por usar");
	}
}
