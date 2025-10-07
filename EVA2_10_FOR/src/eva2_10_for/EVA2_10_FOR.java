
package eva2_10_for;

import java.util.Scanner;

public class EVA2_10_FOR {
    public static void main(String[] args) {
        //Imprimir del 1 al 20
        for(int i = 1; i <= 20; i++){
            System.out.print(i + " - ");
        }
        //Imprimir al reves (20 al 1)
        System.out.println("");
        for(int i = 20; i >= 1; i--){
            System.out.print(i + " - ");
        }
        //Imprimir los pares de 0 a 100
        //0 - 2 - 4 - 6 - 8 ...98 / 100
        //=+, -=, *=, /=
        System.out.println("");
        for(int i = 0; i <= 100; i+=2){
            System.out.print(i + " - ");
        }
        //Imprimir en orden inverso
         System.out.println("");
        for(int i = 100; i >= 0; i-=2){
            System.out.print(i + " - ");
        }
        //Solicitar dos numeros al usuario, imprimir la lista
        //Entre esos numeros
        //-3 y 3 --> -3 -2 -1 0 1 2 3
        //En orden inverso
        int num, num2;
        System.out.println("");
        Scanner captu = new Scanner(System.in);
        System.out.println("Escriba el primer numero");
        num = captu.nextInt();
        
        System.out.println("Escriba el segundo numero");
        num2 = captu.nextInt();
        
        if(num < num2){
            for(int i = num; i <= num2; i++)
            System.out.println(i);
        } else {
            for(int i = num; i >= num2; i--)
            System.out.println(i);
            
     
        }
        
    }
    
}
