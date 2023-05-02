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
        
    }
    
}
