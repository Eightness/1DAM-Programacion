import java.util.ArrayList;

public class Pedido {

    //Atributos de la clase
    private String nombre;
    private double subtotal;
    private double porcentDescuento;
    private double precioFinal;
    private ArrayList<Articulo> carrito = new ArrayList<>();    
    private ArrayList<Integer> cantidades = new ArrayList<>();  

    //---------------------------------------------------------------------

    //Constructores

    //Constructor vacío
    public Pedido() {

    }

    //Constructor completo
    public Pedido(String nombre, double porcentDescuento) {
        setNombre(nombre);
        setPorcentDescuento(porcentDescuento);
    }

    //---------------------------------------------------------------------

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

    public void setCarrito(ArrayList<Articulo> carrito) {
        this.carrito = carrito;
    }

    public void setCantidades(ArrayList<Integer> cantidades) {
        this.cantidades = cantidades;
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

    public ArrayList<Articulo> getCarrito() {
        return carrito;
    }

    public ArrayList<Integer> getCantidades() {
        return cantidades;
    }

    //---------------------------------------------------------------------

    //Métodos

    //Método para comprobar si ya existe un artículo en el pedido
    public boolean existeArticulo(String nombre) {
        for (int i = 0; i < carrito.size(); i++) {
            if (carrito.get(i).getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }

    //Método que *devuelve* la posición de un artículo en el carrito
    public int indexArticulo(String nombre) {
        for (int i = 0; i < carrito.size(); i++) {
            if (carrito.get(i).getNombre().equals(nombre)) {
                return i;
            }
        }
        return 0;
    }

    //Método para ver la lista de artículos añadidos al pedido
    public void verCarrito() {
        for (int i = 0; i < carrito.size(); i++) {
            System.out.println();
            System.out.println("Artículo " + (i + 1) + ":");
            System.out.println();
            System.out.println("Nombre: " + carrito.get(i).getNombre());
            System.out.println("Cantidad: " + cantidades.get(i));
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
        System.out.println("Carrito:");
        if (carrito.isEmpty()) {
            System.out.println();
            System.out.println("No hay artículos añadidos al pedido.");
        } else {
            verCarrito();
        }
    }

    //Método para añadir artículo
    public void añadirArticulo (Articulo articulo, int cantidad) throws Exception {
        if (articulo != null && cantidad > 0) {
            if (existeArticulo(articulo.getNombre())) {
                int indexPedido = indexArticulo(articulo.getNombre());
                cantidades.set(indexPedido, (cantidades.get(indexPedido) + cantidad));
                System.out.println();
                System.out.println("Se han añadido " + cantidad + " unidad/es más del artículo " + articulo.getNombre() + ".");
            } else {
                carrito.add(articulo);
                cantidades.add(cantidad);
                System.out.println();
                System.out.println("Artículo y cantidad añadidos al pedido con éxito.");
            }
        } else {
            throw new Exception("No se pudo añadir el artículo ni la cantidad al carrito.");
        }
    }

    //Método para quitar artículo
    public void quitarArticulo (int index) throws Exception {
        if (index >= 0 && index < carrito.size()) {
            carrito.remove(index);
            cantidades.remove(index);
            System.out.println();
            System.out.println("Artículo eliminado del pedido con éxito.");
        } else {
            throw new Exception("No se pudo quitar el artículo seleccionado.");
        }
    }

    //Método para modfiicar artículo (cantidad)
    public void modificarCarrito(int index, int cantidad) throws Exception {
        if (index >= 0 && index < carrito.size() && cantidad > 0) {
            cantidades.set(index, cantidad);
            System.out.println();
            System.out.println("Cantidad del artículo modificada con éxito.");
        } else {
            throw new Exception("No se pudo modificar la cantidad del artículo seleccionado.");
        }
    }

    //Método para calcular el subtotal
    public double calcularSubtotal () {
        double subtotal = 0;
        for (int i = 0; i < carrito.size(); i++) {
            subtotal += (carrito.get(i).getPrecio() * cantidades.get(i));
        }
        return subtotal;
    }

    //Método para calcular el IVA total
    public double calcularIVA () {
        double IVA = 0;
        for (int i = 0; i < carrito.size(); i++) {
            switch(carrito.get(i).getTipoIVA()) {
                case NORMAL:
                    IVA += (carrito.get(i).getPrecio() * cantidades.get(i)) * 0.21;
                break;

                case REDUCIDO:
                    IVA += (carrito.get(i).getPrecio() * cantidades.get(i)) * 0.1;
                break;

                case SUPERREDUCIDO:
                    IVA += (carrito.get(i).getPrecio() * cantidades.get(i)) * 0.04;
                break;
            }
        }
        return IVA;
    }

    //Método para calcular el precio final
    public double calcularPrecioFinal () {
        double precioFinal = 0;
        for (int i = 0; i < carrito.size(); i++) {
            switch (carrito.get(i).getTipoIVA()) {
                case NORMAL:
                    precioFinal += (carrito.get(i).getPrecio() * cantidades.get(i)) * 1.21;
                break;

                case REDUCIDO:
                    precioFinal += (carrito.get(i).getPrecio() * cantidades.get(i)) * 1.1;
                break;

                case SUPERREDUCIDO:
                    precioFinal += (carrito.get(i).getPrecio() * cantidades.get(i)) * 1.04;
                break;
            }
        }
        double descuento = precioFinal * (porcentDescuento / 100);
        precioFinal -= descuento;
        return precioFinal;
    }

    //Método para realizar el pedido
    public Pedido realizarPedido() {
        System.out.println();
        System.out.println("Transferencia de " + calcularPrecioFinal() + " euros completada.");
        System.out.println("Pedido realizado con éxito.");
        System.out.println("¡Gracias!");
        return null;
    }

}
