
package eva2_13_numeros_pares;

import java.util.Scanner;

public class EVA2_13_NUMEROS_PARES {
    public static void main(String[] args) {
        //3 50
        int ini, fin;
        System.out.println("");
        Scanner captu = new Scanner(System.in);
        System.out.println("Inicio");
        ini = captu.nextInt();
        
        System.out.println("Fin");
        fin = captu.nextInt();
        for(int i = ini; i <= fin; i++){
            int resi = i % 2;
            if(resi == 0){
                System.out.print(i + " - ");
        }
        }
    }
    
}
