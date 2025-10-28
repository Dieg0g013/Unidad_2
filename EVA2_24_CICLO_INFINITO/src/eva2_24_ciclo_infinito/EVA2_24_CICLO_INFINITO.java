
package eva2_24_ciclo_infinito;

import java.util.Scanner;

public class EVA2_24_CICLO_INFINITO {
    final static String USUARIO = "admin";
    final static String PWD = "admin";
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        String usu, contra;
        
        while(true){
        System.out.println("ACCESO AL SISTEMA---------");
        System.out.println("USUARIO: ");
        usu = captu.nextLine();
        System.out.println("CONTRASEÑA: ");
        contra = captu.nextLine();
        if((usu.equals(USUARIO) && contra.equals(PWD)))
            break;//Termina el cilo
        }
        System.out.println("Bienvenido al sistema");
    }
    
}
//Todos los ciclos (for, while, do while)
//break = romper (termina el ciclo)
//continue = interrumpe la repeticion actual