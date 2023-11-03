public class Cliente {
    
    private int n_mesa;
    private int n_pedido;

    public Cliente(){
        n_mesa = 0;
        n_pedido= 0;
    }

    public void mostrardatos(){
        System.out.println("----------Cliente-------------");
        System.out.println("EL pedido numero " + n_pedido + ", correspondiente a la mesa " + n_mesa);
        System.out.println("------------------------------" + "\n");

    }
}