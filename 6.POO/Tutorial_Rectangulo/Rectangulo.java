// Albert Lozano Blasco

public class Rectangulo {

    //Variables

    //Atributos de clase
    private static int numRectangulos;  //Número de objetos creados hasta el momento
    public static String nombreFigura = "Rectángulo";   //Nombre de la figura  
    public static double PI = Math.PI;    //Constante PI

    //Atributos de objeto
    private static String nombre;   //Nombre del rectángulo
    public double x1, y1;    //Coordenadas del vértice inferior izquierdo
    public double x2, y2;    //Coordenadas del vértice superior derecho

    //Métodos

    //Método para obtener el nombre del rectángulo
    public String obtenerNombre() {
        return nombre;
    }

    //Método para establecer el nombre del rectángulo
    public void establecerNombre(String nom) {
        nombre = nom;
    }

    //Método para calcular la superfície del rectángulo
    public double calcularSuperficie() {
        return (x2 - x1) * (y2 - y1);
    }
    
    //Método para calcular el perímetro del rectángulo
    public double calcularPerimetro() {
        return ((x2 - x1) + (y2 - y1)) * 2;
    }
    
    //Método para desplazar las dos coordenadas
    public void desplazar(double x, double y) {
        x1 += x;
        x2 += x;
        y1 += y;
        y2 += y;
    }

    //Método para obtener el número de rectángulos actuales
    public int obtenerNumRectangulos() {
        return numRectangulos;
    }

    //Constructores

    //Constructor 1
    public Rectangulo() {
        x1 = 0.0;
        y1 = 0.0;
        x2 = 1.0;
        y2 = 1.0;
    }

    //Constructor 2
    public Rectangulo (double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    //Constructor 3
    public Rectangulo (double base, double altura) {
        this.x1 = 0.0;
        this.y1 = 0.0;
        this.x2 = base;
        this.y2 = altura;
    }

    //Constructor copia
    public Rectangulo (Rectangulo r) {
        this.x1 = r.x1;
        this.x2 = r.x2;
        this.y1 = r.y1;
        this.y2 = r.y2;
    }

}
