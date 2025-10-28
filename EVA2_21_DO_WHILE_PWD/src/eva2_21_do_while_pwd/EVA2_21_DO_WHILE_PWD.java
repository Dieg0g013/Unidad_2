
package eva2_21_do_while_pwd;

import java.util.Scanner;

public class EVA2_21_DO_WHILE_PWD {
    final static String USUARIO = "admin";
    final static String PWD = "admin";
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        String usu, contra;
        do{
        System.out.println("ACCESO AL SISTEMA---------");
        System.out.println("USUARIO: ");
        usu = captu.nextLine();
        System.out.println("CONTRASEÑA: ");
        contra = captu.nextLine();
        
    }while(!(usu.equals(USUARIO) && contra.equals(PWD)));
        
        System.out.println("Bienvenido al sistema");
    }
}
