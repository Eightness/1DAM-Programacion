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
    public Almacen(int maxArticulos, Articulo[] articulos) {

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

    //Método para añadir un artículo al almacén
    public boolean añadirArticulo(Articulo a) {
        if (estaLleno()) {
            System.out.println();
            System.out.println("El almacén está lleno, no se pueden añadir más artículos.");
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
    public boolean quitarArtiuclo(int pos) {
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
}
    

