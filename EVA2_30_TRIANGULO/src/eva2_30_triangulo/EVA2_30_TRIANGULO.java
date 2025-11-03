
package eva2_30_triangulo;

import java.util.Scanner;

public class EVA2_30_TRIANGULO {
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        System.out.println("Ingrese un numero para realizar una piramide de ese tamaño");
        int num = captu.nextInt();
        int i = 1;
        while (i <= num) {
            int y = 1;
            while (y <= i){
                System.out.print("*");
                y++;
            }
            System.out.println();
            i++;
        }
        
        
    }
    
}
