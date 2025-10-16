
package eva2_19_tic_tac_toe;

import java.util.Scanner;

public class EVA2_19_TIC_TAC_TOE {
    public static void main(String[] args) {
        int fila,col, jug;
        Scanner captu = new Scanner(System.in);
        int tictac[][] = new int [3][3];
        for (int i = 0; i < 10; i++){ //El juego del gato tiene 9 cuadros, por lo tanto se puso menor a 10
        System.out.println("Introduce tu jugada");
        System.out.println("Introduce tu jugada. Fila");
        fila = captu.nextInt();
        System.out.println("Introduce tu jugada. Columna");
        col = captu.nextInt();
        System.out.println("Jugador (1 o 2):");
        jug = captu.nextInt();
        tictac[fila][col] = jug;
        
    }
        //Ciclos anidados
        for(int i = 0; i < tictac.length; i++){
            for(int j = 0; j < tictac[i].length; j++){
                System.out.print("[" + tictac[i][j] + "]");
            }
            System.out.println();
        }
    }
    
}
