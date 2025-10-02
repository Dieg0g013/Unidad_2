
package eva2_1_exa1;

import java.util.Scanner;

public class EVA2_1_EXA1 {
    public static void main(String[] args) {
        int natacion, ciclismo, carrera, total;
        Scanner captu = new Scanner(System.in);
        System.out.println("Tiempo en natación");
        natacion = captu.nextInt();
        System.out.println("Tiempo en natación");
        ciclismo = captu.nextInt();
        System.out.println("Tiempo en natación");
        carrera = captu.nextInt();
        
        total = natacion + ciclismo + carrera;
        if((total < 120) && (natacion < 60) && (ciclismo < 60) && (carrera < 60)){
            System.out.println("Excelente!!");
        } else if((total < 150) || (natacion < 70) || (ciclismo < 70) || (carrera < 70))
            System.out.println("Buena");
            else {
                    System.out.println("Regular");
                    }
        }
    }
    
