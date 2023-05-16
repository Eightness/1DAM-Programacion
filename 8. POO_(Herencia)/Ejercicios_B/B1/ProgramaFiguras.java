import java.util.ArrayList;

public class ProgramaFiguras {

    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<Figura>();
        figuras.add(new Figura());
        figuras.add(new Circulo(10));
        figuras.add(new Cuadrado(5));
        figuras.add(new Triangulo(10, 5));
        for (Figura f : figuras) {
            System.out.println("Área: " + f.area());
        } 
    }
    
}
