
package eva2_12_tabla_mult;

import java.util.Scanner;

public class EVA2_12_TABLA_MULT {
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int num;
        System.out.println("Ingrese el numero del que quieres conocer la tabla");
        num = captu.nextInt();
        
        for(int i = 1; i<=10; i++){
            int mult = num * i;
            System.out.println(num + " x " + i + " = " + mult);
            
    }
        
    }
    
}
