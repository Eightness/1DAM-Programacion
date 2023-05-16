public class Triangulo extends Figura {
    
    //Atributos
    private double base;
    private double altura;

    //Constructores
    public Triangulo() {

    }

    //Constructor vacío
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //Constructor completo

    //Métodos

    //Método para calcular el área
    @Override
    public double area() {
        return (base * altura) / 2;
    }
}
