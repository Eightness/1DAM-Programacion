import java.util.ArrayList;

public class Almacen {

    //Atributos
    private ArrayList<Articulo> articulos = new ArrayList<>();

    //---------------------------------------------------------------------

    //Constructores

    //Constructor vacío
    public Almacen() {

    }

    //Constructor completo
    public Almacen(ArrayList<Articulo> articulos) {
        setArticulos(articulos);
    }

    //---------------------------------------------------------------------

    //Setters y Getters

    //Setters
    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }

    //Getters
    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    //---------------------------------------------------------------------

    //Métodos

    //Método para comprobar si ya existe x artículo en el almacén
    public boolean existeArticulo(Articulo articuloBuscado) {
        if (articuloBuscado == null) {
            return false;
        }
        for (Articulo articulo : articulos) {
            if (articulo.getNombre() == articuloBuscado.getNombre()) {
                return true;
            }
        }
        return false;
    }

    //Método para ver/imprimir el almacén
    public void verAlmacen() {
        if (articulos.isEmpty()) {
            System.out.println();
            System.out.println("El almacén está vacío.");
            return;
        }
        for (int i = 0; i < articulos.size(); i++) {
            System.out.println();
            System.out.println("Artículo " + (i + 1) + ":");
            articulos.get(i).verArticulo();
            System.out.println("--------------------");
        }
    }

    //Método para añadir un artículo al almacén
    public void añadirArticulo(Articulo a) throws Exception {
        if (!existeArticulo(a) && a != null) {
            articulos.add(a);
            System.out.println();
            System.out.println("Se ha añadido el artículo al almacén.");
        } else {
            throw new Exception("No se ha podido añadir el artículo.");
        }
    }

    //Método para quitar un artículo del almacén
    public void quitarArticulo(int index) throws Exception {
        if (index >= 0 && index < articulos.size()) {
            articulos.remove(index);
            System.out.println();
            System.out.println("Se ha quitado el artículo seleccionado del almacén.");
        } else {
            throw new Exception("No se ha podido eliminar el artículo.");
        }
    }

    //Método para buscar un artículo del almacén (por nombre)
    public void buscarArticulo(String nombre) {
        boolean check = false;
        System.out.println();
        System.out.println("Resultado de la búsqueda:");
        for (int i = 0; i < articulos.size(); i++) {
            if (articulos.get(i).getNombre().toLowerCase().contains(nombre.toLowerCase())) {
                articulos.get(i).verArticulo();
                check = true;
            }
        }
        if (!check) {
            System.out.println();
            System.out.println("No se encontró ningún artículo con ese nombre.");
        }
    }

    //Método para modificar el precio de un artículo del almacén
    public void modificarPrecio(int index, double precio) throws Exception {
        if (precio > 0 && index >= 0 && index < articulos.size()) {
            try {
                articulos.get(index).setPrecio(precio);
                System.out.println();
                System.out.println("Precio del artículo modificado con éxito.");
            } catch (Exception e) {
                System.out.println();
                System.out.println(e.getMessage());
            }
        } else {
            throw new Exception("No se ha podido modificar el precio del artículo seleccionado.");
        }
    }

    //Método para recibir x cantidad de un artículo
    public void recibir(int index, int cantidad) throws Exception {
        if (index >= 0 && index < articulos.size()) {
            try {
                articulos.get(index).aumentar(cantidad);
            } catch (Exception e) {
                System.out.println();
                System.out.println(e.getMessage());
            }
        } else {
            throw new Exception("Artículo seleccionado inválido.");
        }
    }

    //Método para devolver x cantidad de un artículo
    public void devolver(int index, int cantidad) throws Exception {
        if (index >= 0 && index < articulos.size()) {
            try {
                articulos.get(index).disminuir(cantidad);
            } catch (Exception e) {
                System.out.println();
                System.out.println(e.getMessage());
            }
        } else {
            throw new Exception("Artículo seleccionado inválido.");
        }
    }

    //Método que *devuelve* un artículo del almacén
    public Articulo getArticulo(int index) throws Exception {
        if (index >= 0 && index < articulos.size()) {
            return articulos.get(index);
        } else {
            throw new Exception("Artículo seleccionado inválido.");
        }
    }

    //Método que *devuelve* la posición de un artículo de determinado nombre
    public int getIndex(String nombre) {
        for (int i = 0; i < articulos.size(); i++) {
            if (articulos.get(i).getNombre().equals(nombre)) {
                return i;
            }
        }
        return 0;
    }
    
}
