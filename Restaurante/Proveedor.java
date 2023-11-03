public class Proveedor {

    private String nombre_p;
    private String producto;
    private int cantidad_p;

    public Proveedor(){
        nombre_p = "Martin";
        producto = "Tomate";
        cantidad_p = 0;
    }

    public void mostrardatos(){
        System.out.println("----------Proveedor-----------");
        System.out.println("Proveedor a cargo: " + nombre_p);
        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad_p);
        System.out.println("------------------------------" + "\n");
    }
}
