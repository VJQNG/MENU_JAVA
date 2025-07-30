// serie de collatz desde un numero +N
import java.util.Scanner;
class collatz{
    public void comienzo(){
        Scanner entra = new Scanner(System.in);
        System.out.print("Serie de Collatz. Ingrese N: ");
        int N = entra.nextInt();
		// Este contador es para hacer que un for actue como un bucle infinito
        int contador = 1;
        for(int a=0;a<contador;a++){ // un numero siempre es mas pequeño que su siguiente (bucle infinito)
			/* Cuando N valga 1 se termina el bucle. ¿1? porque esta serie dice que todo numero positivo haciendo para un par
			dividirlo entre 2 y un impar multiplicar por 3 y sumarle 1, siempre se llega a la serie de numeros (8, 4, 2, 1), de ahí
			el 1 para detener el bucle.*/
            if(N == 1){
                break;
            }
			// Si N es par se divide entre 2 y se suma 1 al contador para que el bucle siga iterando
            if(N%2 == 0){
                N /=  2;
                System.out.println(N);
                contador += 1;
            }else{// Si N es impar se multiplica por 3 y se le suma 1, tambien se suna 1 al contador
                N = (N * 3) + 1;
                System.out.println(N);
                contador += 1;
            }
			// Se hace las veces que sea necesaria para seguir con la serie
        }
    }
}
