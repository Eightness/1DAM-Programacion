public class Pedido {

    //Atributos de la clase
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
    public Pedido(String nombre, int maxCarrito, double porcentDescuento) {
        setNombre(nombre);
        setMaxCarrito(maxCarrito);
        setPorcentDescuento(porcentDescuento);
        setCarrito(new Articulo[maxCarrito]);
        setCantidadArticulos(new int[maxCarrito]);
    }

    //Constructor completo
    public Pedido(String nombre, double subtotal, double porcentDescuento, double precioFinal, int maxCarrito) {
        setNombre(nombre);
        setSubtotal(subtotal);
        setPorcentDescuento(porcentDescuento);
        setPrecioFinal(precioFinal);
        setMaxCarrito(maxCarrito);
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

    //Método para ver si el carrito está vacío
    public boolean estaVacio() {
        if (carrito[0] == null && cantidadArticulos[0] == 0) {
            return true;
        } else {
            return false;
        }
    }

    //Método para ver si el carrito está lleno
    public boolean estaLleno() {
        if (numArticulos == maxCarrito) {
            return true;
        } else {
            return false;
        }
    }

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
        System.out.println("Subtotal: " + calcularSubtotal() + " euros");
        System.out.println("IVA: " + calcularIVA() + " euros");
        System.out.println("Porcentaje aplicado: " + porcentDescuento + "%");
        System.out.println("Precio final: " + calcularPrecioFinal() + " euros");
        System.out.println("Listado de artículos y cantidades:");
        if (estaVacio()) {
            System.out.println();
            System.out.println("No hay artículos añadidos al pedido.");
        } else {
            verListaArticulos();
        }
    }

    //Método para añadir artículo
    public void añadirArticulo (Articulo articulo, int cantidad) {
        carrito[numArticulos] = articulo;
        cantidadArticulos[numArticulos] = cantidad;
        numArticulos++;
        System.out.println();
        System.out.println("Artículo y cantidad añadidos al pedido con éxito.");
    }

    //Método para quitar artículo
    public void quitarArticulo (int pos) {
        carrito[pos] = null;
        cantidadArticulos[pos] = 0;
        for (int i = pos; i < numArticulos; i++) {
            carrito[i] = carrito[i + 1];
            cantidadArticulos[i] = cantidadArticulos[i + 1];
        }
        numArticulos--;
        System.out.println();
        System.out.println("Artículo y cantidad quitados del pedido con éxito.");
    }

    //Método para modificar artículo (Artículo entero)
    public void modificarArticuloEntero (int pos, Articulo articulo, int cantidad) {
        carrito[pos] = articulo;
        cantidadArticulos[pos] = cantidad;
    }

    //Método para modificar artículo (sólo cantidad)
    public void modificarArticuloCantidad (int pos, int cantidad) {
        cantidadArticulos[pos] = cantidad;
    }

    //Método para calcular el subtotal
    public double calcularSubtotal () {
        double subtotal = 0;
        for (int i = 0; i < numArticulos; i++) {
            subtotal += carrito[i].getPrecio();
        }
        return subtotal;
    }

    //Método para calcular el IVA total
    public double calcularIVA () {
        double IVA = 0;
        for (int i = 0; i < numArticulos; i++) {
            switch(carrito[i].getTipoIVA()) {
                case NORMAL:
                    IVA += carrito[i].getPrecio() * 0.21;
                break;

                case REDUCIDO:
                    IVA += carrito[i].getPrecio() * 0.1;
                break;

                case SUPERREDUCIDO:
                    IVA += carrito[i].getPrecio() * 0.04;
                break;
            }
        }
        return IVA;
    }

    //Método para calcular el precio final
    public double calcularPrecioFinal () {
        double precioFinal = 0;
        for (int i = 0; i < numArticulos; i++) {
            switch (carrito[i].getTipoIVA()) {
                case NORMAL:
                    precioFinal += carrito[i].getPrecio() * 1.21;
                break;

                case REDUCIDO:
                    precioFinal += carrito[i].getPrecio() * 1.1;
                break;

                case SUPERREDUCIDO:
                    precioFinal += carrito[i].getPrecio() * 1.04;
                break;
            }
        }
        double descuento = precioFinal * (porcentDescuento / 100);
        precioFinal -= descuento;
        return precioFinal;
    }

    //Método para realizar pedido
    public Pedido realizarPedido () {
        System.out.println();
        System.out.println("Pedido realizado con éxito.");
        return null;
    }
    
}
