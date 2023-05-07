public class Articulo {
    
    //Enum IVA
    public enum IVA {
        NORMAL,
        REDUCIDO,
        SUPERREDUCIDO
    }

    //Atributos de la clase
    private String nombre;
    private double precio;
    private IVA tipoIVA;
    private int cantidad;

    //Constructores

    //Constructor vacío
    public Articulo() {

    }

    //Constructor completo
    public Articulo(String nombre, double precio, IVA tipoIva, int cantidad) {
        setNombre(nombre);
        setPrecio(precio);
        setTipoIVA(tipoIva);
        setCantidad(cantidad);
    }

    //Setters y Getters

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setTipoIVA(IVA tipoIVA) {
        this.tipoIVA = tipoIVA;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public IVA getTipoIVA() {
        return tipoIVA;
    }

    public int getCantidad() {
        return cantidad;
    }

    //Métodos

    //Método para ver/imprimir un artículo
    public void verArticulo() {
        System.out.println();
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio + " euros");
        System.out.println("Tipo de IVA: " + tipoIVA);
        System.out.println("Cantidad: " + cantidad + " unidades");
        System.out.println();
    }

    //Método para añadir x cantidad a un artículo
    public void aumentar(int cantidad) {
        this.cantidad += cantidad;
    }

    //Método para quitar x cantidad a un artículo
    public void disminuir(int cantidad) {
        if (cantidad > 0 && cantidad <= this.cantidad) {
            this.cantidad -= cantidad;
        } else {
            if (cantidad == 0) {
                System.out.println("No tiene sentido quitar 0 unidades.");
            } else {
                System.out.println("No hay tantas existencias.");
            }
        }
    }
}
