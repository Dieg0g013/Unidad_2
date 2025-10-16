
package eva2_17_arreglos_multi;
public class EVA2_17_ARREGLOS_MULTI {
    public static void main(String[] args) {
        int matriz[][] = new int[3][4];//el primero es Filas y el segundo Columnas, osea las 3 filas tienen 4 columnas cada una (como ejemplo un excel)
        //int cubo[][][] = new int[2][2][2] Un cubo tiene 3 dimensiones y por eso se puso asi
        matriz[0][0] = 100;// Fila 0 columna 0
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[0][3] = 400;
        System.out.println(matriz.length);//Me imprime el numero 3, por lo tanto se puede utilizar en el primer for
        System.out.println(matriz[0].length);
        System.out.println(matriz[1].length);
        System.out.println(matriz[2].length);
        
        //CICLOS ANIDADOS
        //Se necesita un for por cada dimension
        //Este for siempre trabajara mientras i sea 0, es decir solo una columna
        for(int i = 0; i < matriz.length; i++){ //El primer for siempre trabaja la primera dimension, el segundo la segunda y asi
            for(int j = 0; j < matriz[i].length; j++){ //Llega hasta 4 ya que trabaja con la segunda dimension que en este caso fue 4 (Linea 5)
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }
    }
    
}
