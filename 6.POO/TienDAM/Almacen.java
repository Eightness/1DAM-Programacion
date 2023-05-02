public class Almacen {

    //Atributos
    private int maxArticulos;
    private Articulo[] articulos = new Articulo[maxArticulos];
    private int numArticulos = 0;

    //Constructores
    //Constructor vacío
    public Almacen() {

    }

    //Constructor completo
    public Almacen(int maxArticulos) {
        setMaxArticulos(maxArticulos);
    }

    //Getters y Setters
    //Setters
    public void setMaxArticulos(int maxArticulos) {
        this.maxArticulos = maxArticulos;
    }

    //Getters
    public Articulo[] getArticulos() {
        return articulos;
    }
    
    public int getMaxArticulos() {
        return maxArticulos;
    }

    //Métodos
    //Método para ver/imprimir un Almacén
    public void verAlmacen() {
        for (int i = 0; i < numArticulos; i++) {
            System.out.println();
            System.out.println("Artículo " + (i + 1) + ":");
            articulos[i].verArticulo();
            System.out.println("-------------------------");
        }
    }

    //Método para comprobar si el array está vacío
    public boolean estaVacio() {
        if (articulos[0] == null) {
            return true;
        } else {
            return false;
        }
    }

    //Método para comprobar si el array está lleno
    public boolean estaLleno() {
        if (numArticulos == maxArticulos) {
            return true;
        } else {
            return false;
        }
    }

    //Método para comprobar si ya existe x artículo en el almacén
    public boolean existeArticulo(Articulo a) {
        for (int i = 0; i < numArticulos; i++) {
            if (articulos[i].getNombre() == a.getNombre()) {
                return true;
            }
        }
        return false;
    }

    //Método para añadir un artículo al almacén
    public boolean añadirArticulo(Articulo a) {
        if (estaLleno()) {
            System.out.println();
            System.out.println("El almacén está lleno, no se pueden añadir más artículos.");
            return false;
        } else if (existeArticulo(a)) {
            System.out.println();
            System.out.println("Ya existe un artículo con el mismo nombre en el almacén.");
            return false;
        } else {
            articulos[numArticulos] = a;
            numArticulos++;
            System.out.println();
            System.out.println("Artículo añadido con éxito al almacén.");
            return true;
        }
    }

    //Método para quitar artículo del almacén
    public boolean quitarArticulo(int pos) {
        if (estaVacio()) {
            System.out.println();
            System.out.println("No hay artículos en el almacén para quitar.");
            return false;
        } else {
            articulos[pos] = null;
            for (int i = pos; i < numArticulos; i++) {
                articulos[i] = articulos[i + 1];
            }
            numArticulos--;
            return true;
        }
    }

    //Método para modificar el precio de un artículo en concreto del almacén
    public boolean modificarPrecio(int pos, double precio) {
        if (precio < 0) {
            System.out.println();
            System.out.println("No se puede introducir un precio negativo.");
            return false;
        } else {
            articulos[pos].setPrecio(precio);
            System.out.println();
            System.out.println("Precio del artículo modificado con éxito.");
            return true;
        }
    }

    //Método para buscar un artículo por nombre
    public void buscarArticulo(String nombre) {
        System.out.println();
        System.out.println("Resultado de la búsqueda:");
        for (int i = 0; i < numArticulos; i++) {
            if (articulos[i].getNombre().contains(nombre)) {
                articulos[i].verArticulo();
            }
        }
    }

    //Método para recibir x cantidad de un artículo (indicamos la posición del artículo)
    public boolean recibir(int pos, int cantidad) {
        if (cantidad < 0) {
            System.out.println();
            System.out.println("No se pueden recibir cantidades negativas.");
            return false;
        } else if (pos < 0 || pos > maxArticulos){
            System.out.println();
            System.out.println("El artículo seleccionado no existe.");
            return false;
        } else {
            articulos[pos].setCantidad(articulos[pos].getCantidad() + cantidad);
            System.out.println();
            System.out.println("Recibidos " + cantidad + " del artículo seleccionado.");
            return true;
        }
    }

    //Método para devolver x cantidad de un artículo (indicamos la posición del artículo)
    public boolean devolver(int pos, int cantidad) {
        if (cantidad < 0) {
            System.out.println();
            System.out.println("No se pueden devolver cantidades negativas.");
            return false;
        } else if (pos < 0 || pos > maxArticulos) {
            System.out.println();
            System.out.println("El artículo seleccionado no existe.");
            return false;
        } else if (cantidad > articulos[pos].getCantidad()) {
            System.out.println();
            System.out.println("No se pueden devolver más productos de los existentes.");
            return false;
        } else {
            articulos[pos].setCantidad(articulos[pos].getCantidad() - cantidad);
            System.out.println();
            System.out.println("Devueltos " + cantidad + " del artículo seleccionado.");
            return true;
        }
    }
}
    

