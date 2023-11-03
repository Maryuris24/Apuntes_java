import java.util.Scanner;
public class opti{

    public static Scanner entrada = new Scanner(System.in);

    static void saludo(){
        String nombre;
        System.out.print("Introduzca su nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Hola " + nombre + "!!");
    }

    static void cubo(){
        double numero;
        System.out.print("Ingrese un numero: ");
        numero = Integer.parseInt(entrada.nextLine());
        System.out.println("El cubo de "+numero+ " es: "+ Math.pow(numero,3));
    }

    static void multiplicacion(){
        int numero1,numero2;
        System.out.print("Ingrese un numero: ");
        numero1 = Integer.parseInt(entrada.nextLine());
        System.out.print("Ingrese un numero: ");
        numero2 = Integer.parseInt(entrada.nextLine());
        System.out.println("El producto de: "+numero1+" por "+numero2+" es: "+ numero1*numero2);
    }

    static void tablademultiplicar(){
        int num;
        System.out.print("Ingrese un numero: ");
        num = Integer.parseInt(entrada.nextLine());
        for (int i=1 ; i<11 ; i++) {
             System.out.println(num+"*"+i+"="+num*i);
            }
    }

    static void par(){
        int nume;
        System.out.print("Ingrese un numero: ");
        nume = Integer.parseInt(entrada.nextLine());
        if (nume%2==0){
            System.out.println("El numero "+nume+", es par.");
        }
        else{
            System.out.println("El numero "+nume+", no es par.");
        }

    }

    static void menu(){
        int opcion;
        do {
            System.out.println("Escoja la operacion a realizar: ");
            System.out.println("1) Saludo.");
            System.out.println("2) Cubo.");
            System.out.println("3) Multiplicarcion.");
            System.out.println("4) Tabla de multiplicar.");
            System.out.println("5) Par.");
            System.out.println("6) salir.");

            opcion = Integer.parseInt(entrada.nextLine());
            switch (opcion) { 
                case 1:
                saludo();
                 break;
                case 2:
                cubo();
                 break;
                case 3:
                multiplicacion();
                 break;
                case 4:
                tablademultiplicar();
                 break;
                 case 5:
                par();
                 break;
                 case 6:
                 System.out.println("salio.");
                 break;
                default:
                System.out.println("Del 1 al 5, bobo. ");
              }           
            } while (opcion != 6);
        
    }

    public static void main(String args[]){

        menu();
    }
}

