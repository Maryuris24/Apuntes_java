import java.util.Scanner;
public class Iniciacion {
    public static Scanner lee = new Scanner(System.in);    
    
    static void verificarN(int numero){ //primera actividad 
        int numeros[] = {7,9,11,16,23,40,56,62,14,12,5,93,15,20,40,59,81,93,63,58,45,54,23,43,63,83,93,97,87,13,20,40};

        int cantidad = 0;
        for(int i = 0; i < numeros.length; i++) {
            if(numeros[i] == numero )
            cantidad++;
        }
        System.out.println("El Numero " + numero + " ha aparecido "+cantidad+" "+(cantidad == 1 ? "vez" : "veces"));
    }

    static void verificarS(){ //segunda actividad
        //int n;
        String cadena;
        //System.out.print("Introduzca la longitud del array: ");
        //n = Integer.parseInt(lee.nextLine());
        String cadenas[] = {"hola", "como", "estas"};//new String[n];
        cadena = cadenas[0];
        for(int i = 0; i < cadenas.length; i++) {
            //System.out.println("Ingrese una palabra: ");
            //cadenas[i] = lee.nextLine();
            if(cadenas.length > cadena.length())
             cadena = cadenas[i];
            
        }
        System.out.println("La cadena mas larga es: " + cadena );
    }

    public static void main (String Args[]){    
        int numero;
        System.out.print("Introduzca un numero que desea verificar: ");
        numero = Integer.parseInt(lee.nextLine());
        verificarN(numero);
        verificarS();
    }
}