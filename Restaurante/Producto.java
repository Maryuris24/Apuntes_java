public class Producto {
    
    private String tipo_p;
    private int cantidad_p;

    public Producto(){
        tipo_p = "tomate ";
        cantidad_p = 0;
    }

    public void mostrardatos(){
        System.out.println("-----------Producto-----------");
        System.out.println("Producto: " + tipo_p);
        System.out.println("Cantidad:" + cantidad_p);
        System.out.println("------------------------------" + "\n");
    }
}
