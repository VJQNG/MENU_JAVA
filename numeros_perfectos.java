//Mostrar los números perfectos hasta un limite.
// Numero perfecto: suma de todos sus divisores de un numero excepto él mismo.
// System.out.println();
import java.util.Scanner;
class numeros_perfectos{
	public void comienzo(){
	    Scanner entra = new Scanner(System.in);    
		System.out.println("Ingrese un limite: ");
		int N = entra.nextInt();
		// Obtener los divisores propios de N
		/* En el segundo for, se obtiene el residuo de todos los numeros desde 1 hasta N entre esos mismos numeros (i%j == 0) para
		saber que el resultado de esa operacion es 0, si lo es entonces es un divisor, haciendo que ese divisor se agregue
		a la variable "suma", así buscando los divisores de cada numero para sumarlos y ... */
	    for(int i=1;i<N+1;i++){
	        int suma = 0;
	        for(int j=1;j<i;j++){
	            if(i%j == 0){
		                suma += j;
	            }else{
	                continue;
	            }
	       	}
			/* ... cuando termine de hacer todas las iteraciones del segundo for verificar que el numero que esté siendo evaluado (i)
			sea igual a la variable "suma" que es la suma de todos los divisores del numero evaluado (i), si sí pues se encontro un
			numero perfecto.*/
	        if(i == suma){
	            System.out.println();
	            System.out.printf("Encontraste un número perfecto: %d", i);
	           	System.out.println();
       		}
   		}
	}
}
