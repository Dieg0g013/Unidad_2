
package eva2_14_arreglos_for;
public class EVA2_14_ARREGLOS_FOR {
    public static void main(String[] args) {
        int arreglo [] = new int[10];
        
        for(int i = 0; i < arreglo.length; i++)
        arreglo[i] = (int)(Math.random() * 100);//El * 100 hace que sea un rango, es decir me va a dar un numero entre 0 y 100
        
        for(int i = 0; i < arreglo.length; i++)
            System.out.print("[" + arreglo[i] + "]");
    }
    
}
