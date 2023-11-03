public class Menu {

    private String platillos;
    private int precio;

    public Menu(){
        platillos = "Salchipapa ";
        precio = 0;
    }

    public void mostrardatos(){
        System.out.println("----------Menu-------------");
        System.out.println("Ordeno: " + platillos );
        System.out.println("Tiene un costo de: $" + precio);
        System.out.println("------------------------------" + "\n");
    }
}
