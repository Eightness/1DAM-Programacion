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

    //Constructor
    public Pedido(String nombre, int maxCarrito) {
        setNombre(nombre);
        setMaxCarrito(maxCarrito);
        setCarrito(new Articulo[maxCarrito]);
        setCantidadArticulos(new int[maxCarrito]);
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

    public void setCarrito(Articulo[] carrito) {
        this.carrito = carrito;
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
    public void añadirArticulo (Articulo articulo, int cantidad) {
        //Añadimos el artículo a la lista de artículos de pedido
        carrito[numArticulos] = articulo;
        //Añadimos la cantidad del artículo a la lista de cantidades de pedido
        cantidadArticulos[numArticulos] = cantidad;
        //Sumamos un artículo al contador
        numArticulos++;
        //Mostramos mensaje de "añadido correctamente"
        System.out.println();
        System.out.println("Artículo y cantidad añadidos al pedido con éxito.");
    }

    //Método para quitar artículo
    public void quitarArticulo (int pos) {
        carrito[pos] = null;
        cantidadArticulos[pos] = 0;
        //Desplazamos posiciones en los arrays
        for (int i = pos; i < numArticulos; i++) {
            carrito[i] = carrito[i + 1];
            cantidadArticulos[i] = cantidadArticulos[i + 1];
        }
        numArticulos--;
        //Mostramos mensaje de "eliminado correctamente"
        System.out.println();
        System.out.println("Artículo y cantidad quitados del pedido con éxito.");
    }

    //Método para modificar artículo
    public void modificarArticulo (int pos, Articulo articulo) {
        //
    }

    //Método para pagar
    public Pedido pagarPedido () {
        return null;
    }
    
}
