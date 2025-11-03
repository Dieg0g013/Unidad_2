
package eva2_31_piramide;

import java.util.Scanner;

public class EVA2_31_PIRAMIDE {
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
       i = num - 1;
        while (i >= 1) {
            int y = 1;
            while (y <= i) {
                System.out.print("*");
                y++;
            }
            System.out.println();
            i--;
        }
    }

}
