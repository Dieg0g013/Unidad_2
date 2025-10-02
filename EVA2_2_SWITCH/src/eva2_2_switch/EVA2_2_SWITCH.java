
package eva2_2_switch;

import java.util.Scanner;

public class EVA2_2_SWITCH {
    public static void main(String[] args) {
        int dia;
        Scanner day = new Scanner(System.in);
        System.out.println("Numero del dia de la semana");
        dia = day.nextInt();
        //
        switch(dia){//Opciones --> Casos
            case 1:
                System.out.println("Lunes");
                break;//Fin de caso y del switch
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default://Opcional, siempre al final, no necesita break
                System.out.println("Numero incorrecto");
        }
       
       
    }
    
}
