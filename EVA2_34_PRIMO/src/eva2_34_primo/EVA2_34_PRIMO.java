
package eva2_34_primo;

import java.util.Scanner;

public class EVA2_34_PRIMO {
    public static void main(String[] args) {
        int num, divi = 0;
        Scanner captu = new Scanner(System.in);
        System.out.println("Ingresa un numero para saber si es primo o no");
        num = captu.nextInt();
        
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                divi++;
            }
        }
        if(divi == 2){
            System.out.println(num + " es primo");
        } else{
            System.out.println(num + " no es primo");
        }
    }
    
}
