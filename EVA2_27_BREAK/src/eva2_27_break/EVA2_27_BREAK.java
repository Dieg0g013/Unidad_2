
package eva2_27_break;

import java.util.Scanner;

public class EVA2_27_BREAK {
    public static void main(String[] args) {
         Scanner captu = new Scanner(System.in);
        int valor, adivinar;
        do{
            adivinar = (int)(Math.random() * 5);
            System.out.print("Adivina el numero. (1 - 5)"
                    + " o ingrese -1 para terminar de jugar");
            System.out.println("");
            valor = captu.nextInt();
            if(valor == adivinar)
                System.out.println("Felicidades, adivinaste :)");
            else if(valor == -1){
                System.out.println("Gracias por jugar");
                break;//Termina la ejecucion del ciclo
            }else{
                System.out.println("No adivinaste");
            }
        }while(true);//Condicion para repetir (true)
    }
    
}
