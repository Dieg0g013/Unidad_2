
package eva2_4_arreglos;
public class EVA2_4_ARREGLOS {
    public static void main(String[] args) {
        //Necesitan capturar los datos de un grupo
        //Arreglo --> Estructura de datos
        //Son identificador
        //Secuencia (consecutiva) de valores del mismo tipo
        int[] arreglo;//crear el arreglo (basicamente decir su tamano)
        arreglo = new int[5];
        //int[] arreglo = ne int[10]
        //Posiciones de los elementos de un arreglo:
        //Primer elemento --> 0 (cero)
        //Ultimo elemento --> Tamano -1
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[2] = 300;
        arreglo[3] = 400;
        arreglo[4] = 500;
        System.out.println(arreglo[0]);
        System.out.println(arreglo[1]);
        System.out.println(arreglo[2]);
        System.out.println(arreglo[3]);
        System.out.println(arreglo[4]);
    }
    
}
