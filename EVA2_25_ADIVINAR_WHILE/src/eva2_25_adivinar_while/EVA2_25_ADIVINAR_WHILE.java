
package eva2_25_adivinar_while;

import java.util.Scanner;

public class EVA2_25_ADIVINAR_WHILE {
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int valor = 0, adivinar;
        while(valor != -1){
            adivinar = (int)(Math.random() * 5);
            System.out.print("Adivina el numero. (1 - 5)"
                    + " o ingrese -1 para terminar de jugar");
            System.out.println("");
            valor = captu.nextInt();
            if(valor == adivinar)
                System.out.println("Felicidades, adivinaste :)");
            
        }
    }
    
}
