
package eva2_11_for;

import java.util.Scanner;

public class EVA2_11_FOR {
    public static void main(String[] args) {
        int rep;
        String mensaje;
        Scanner captu = new Scanner(System.in);
        System.out.println("Mensaje a repetir");
        mensaje = captu.nextLine();
        System.out.println("Cantidad de repeticiones");
        rep = captu.nextInt();
        for(int i = 1; i <= rep; i++){
            System.out.println(mensaje);
            
        }
        
        
    }
    
}
