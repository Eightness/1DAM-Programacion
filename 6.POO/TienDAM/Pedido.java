public class Pedido {

    //Atributos
    private String nombre;
    private double subtotal;
    private double porcentDescuento;
    private double precioFinal;
    private int maxCarrito;
    private Articulo[] carrito = new Articulo[maxCarrito];
    private int[] cantidadArticulos = new int[maxCarrito];
    private int numArticulos = 0;

    //Constructores
    //Constructor vacío
    public Pedido() {
        
    }

    //Constructor completo
    public Pedido(String nombre, double subtotal, double porcentDescuento, double precioFinal, int maxCarrito) {

    }

    //Setters y Getters
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void setPorcentDescuento(double porcentDescuento) {
        this.porcentDescuento = porcentDescuento;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public void setMaxCarrito(int maxCarrito) {
        this.maxCarrito = maxCarrito;
    }

    public void setCantidadArticulos(int[] cantidadArticulos) {
        this.cantidadArticulos = cantidadArticulos;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getPorcentDescuento() {
        return porcentDescuento;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public int getMaxCarrito() {
        return maxCarrito;
    }

    //Métodos
    //Método para ver la lista de artículos añadidos al pedido
    public void verListaArticulos() {
        for (int i = 0; i < numArticulos; i++) {
            System.out.println();
            System.out.println("Artículo " + (i + 1) + ":");
            System.out.println();
            System.out.println("Nombre: " + carrito[i].getNombre() + "\tCantidad: " + cantidadArticulos[i]);
            System.out.println();
            System.out.println("-------------------------");
        }
    }

    //Método para ver/imprimir un pedido
    public void verPedido() {
        System.out.println();
        System.out.println("Nombre del cliente: " + nombre);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Porcentaje aplicado: " + porcentDescuento);
        System.out.println("IVA: ");
        System.out.println("Precio final: " + precioFinal);
        System.out.println("Listado de artículos y cantidades:");
        verListaArticulos();
    }

    //Método para añadir artículo

    //Método para quitar artículo

    //Método para modificar artículo

    //Método para pagar
    
}
