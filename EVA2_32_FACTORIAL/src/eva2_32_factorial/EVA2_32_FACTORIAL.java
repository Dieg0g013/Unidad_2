
package eva2_32_factorial;

import java.util.Scanner;

public class EVA2_32_FACTORIAL {
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int num;
        System.out.println("Introduce un numero para saber su factorial");
        num = captu.nextInt();
        
        int factorial = 1;
        
        for(int i = 1; i <= num; i++){
            factorial *= i;
        }
        System.out.println("Su factorial es: " + factorial);

        
    }
    
}
