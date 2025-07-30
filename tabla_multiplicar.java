import java.util.Scanner;

class tabla_multiplicar{
	public void comienzo(){
        Scanner entra = new Scanner(System.in);
        System.out.println("Ingrese un numero para su tabla: ");
        int numero = entra.nextInt();
		int otro = 1;
		while(otro < 11){
	    	int mul = numero * otro;
		    System.out.println("");
		    System.out.printf("%d x %d = %d", numero, otro, mul);
		    System.out.println("");
		    otro += 1;
		}
    }
}

