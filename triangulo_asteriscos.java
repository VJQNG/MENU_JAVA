// Hacer un triángulo con asteriscos de tamaño N
import java.util.Scanner;
public class triangulo_asteriscos{
	public static void main(String[] args){
		Scanner entra = new Scanner(System.in);
		System.out.println("Ingrese la altura: ");
		int N = entra.nextInt();
		if (N > 0){
			for(int a=1;a<=N;a++){
				for(int b=1;b<=a;b++){
					System.out.print("*");
				}
				System.out.println("");
			}
		}else{
			System.out.println("Fuera de rango");
		}

	}

}
