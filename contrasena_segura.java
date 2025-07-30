import java.util.Scanner;
public class contrasena_segura{
	public static void main(String[] args){
		// System.out.println();
		Scanner entra = new Scanner(System.in);	
		String usuario;
		do {
			System.out.print("Ingresa una contraseña de al menos 8 caracteres, una mayuscula, una minuscula y un numero: ");
			usuario = entra.nextLine();
		} while(!usuario.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}"));
		System.out.println("Contraseña valida");
		System.out.println(usuario);
	}
}
