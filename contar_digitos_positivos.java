import java.util.Scanner;

public class contar_digitos_positivos{
    public static void main(String[] args){
        Scanner entra = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = entra.nextInt();
	String n = String.valueOf(numero);
	int limite = n.length();
	System.out.println(limite);
	int suma = 0;
	if(numero >= 0){
	    
	    String cambio = String.valueOf(numero);
	    int contador = 0;
	    while(contador < limite){
	        char obtener = cambio.charAt(contador);
	        int regreso = obtener - '0';
	        suma += regreso;
	        contador += 1;
	    }
	    System.out.println("La suma es: " + suma);
	    
	        
	    
	}else{
	    System.out.println("Fuera de rango");
	}

    }

}

