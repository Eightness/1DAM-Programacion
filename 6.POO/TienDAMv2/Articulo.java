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

    //---------------------------------------------------------------------

    //Constructores

    //Constructor vacío
    public Articulo() {

    }

    //Constructor completo
    public Articulo(String nombre, double precio, IVA tipoIva, int cantidad) throws Exception {
        setNombre(nombre);
        setPrecio(precio);
        setTipoIVA(tipoIva);
        setCantidad(cantidad);
    }

    //---------------------------------------------------------------------

    //Setters y Getters

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) throws Exception {
        if (precio > 0) {
            this.precio = precio;
        } else {
            throw new Exception("El precio debe ser mayor que cero.");
        }
    }

    public void setTipoIVA(IVA tipoIVA) {
        this.tipoIVA = tipoIVA;
    }

    public void setCantidad(int cantidad) throws Exception {
        if (cantidad > 0) {
            this.cantidad = cantidad;
        } else {
            throw new Exception("La cantidad debe ser mayor que cero.");
        }
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

    //---------------------------------------------------------------------

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
    public void aumentar(int cantidad) throws Exception {
        if (cantidad > 0) {
            this.cantidad += cantidad;
            System.out.println();
            System.out.println("Se han recibido " + cantidad + " unidad/es de " + nombre + " en el almacén.");
        } else {
            throw new Exception("La cantidad a aumentar debe ser mayor que cero.");
        }
    }

    //Método para disminuir x cantidad a un artículo
    public void disminuir(int cantidad) throws Exception {
        if (cantidad > 0 && cantidad <= this.cantidad) {
            this.cantidad -= cantidad;
            System.out.println();
            System.out.println("Se han retirado " + cantidad + " unidad/es de " + nombre + " del almacén.");
        } else {
            throw new Exception("La cantidad a disminuir es inválida.");
        }
    }
    
}
