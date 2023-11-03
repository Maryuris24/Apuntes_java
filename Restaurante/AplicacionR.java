public class AplicacionR{
	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.mostrardatos();

		Cliente cliente = new Cliente();
		cliente.mostrardatos();

		
		Producto producto = new Producto();
		producto.mostrardatos();

		Proveedor proveedor = new Proveedor();
		proveedor.mostrardatos();
	}
}