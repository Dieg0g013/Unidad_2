
package eva2_15_captura_datos;

import java.util.Scanner;

public class EVA2_15_CAPTURA_DATOS {
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int tama;
        System.out.println("Cuantas calificaciones quieres capturar?");
        tama = captu.nextInt();
        
        int califas[] = new int [tama];
        for(int i = 0; i < califas.length; i++){
            System.out.println("Calificaion #" + (i + 1) + ":");
            califas[i] = captu.nextInt();
            
        }
        //lectura
        for(int i = 0; i < califas.length; i++){
            System.out.println("[" + califas[i] + "]");
            
        }
        //Promedio del grupo
        //Sumar las calificaciones
        int sumaCalifas = 0;
        for(int i = 0; i < califas.length; i++){
            sumaCalifas = sumaCalifas + califas[i];
            //SumaCalifas += califas[i]
        }
        System.out.println("acumulado = " + sumaCalifas);
        double promedio = sumaCalifas / (double)califas.length;/*Aqui se saco el promedio, dividi la suma de calificaciones entre 
                                                               el numero de calificaciones con el length (Creo se puede utilizar
                                                               la variable tama)*/
        System.out.println("Promedio: " + promedio);
    }
    
}
