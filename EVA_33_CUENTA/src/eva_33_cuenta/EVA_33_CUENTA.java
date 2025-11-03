
package eva_33_cuenta;

import java.util.Scanner;

public class EVA_33_CUENTA {
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        double saldo = 1000000;

        System.out.println("Tu cuenta tiene: " + saldo);

        while (saldo > 0) {
            System.out.print("Cuanto quieres retirar");
            double retiro = captu.nextDouble();

            saldo -= retiro;

            System.out.println("Saldo restante: " + saldo);
        }

        System.out.println("️ Tu cuenta se ha vaciado o está en números negativos.");
        captu.close();
    }
    
}
