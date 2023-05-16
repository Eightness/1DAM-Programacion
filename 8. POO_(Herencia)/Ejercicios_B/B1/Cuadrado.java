public class Cuadrado extends Figura {
    
    //Atributos
    private double lado;

    //Constructores

    //Constructor vacío
    public Cuadrado() {

    }

    //Constructor completo
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    //Métodos

    //Método para calcular el área
    @Override
    public double area() {
        return lado * lado;
    }
}
