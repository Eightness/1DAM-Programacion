public class Circulo extends Figura {

    //Atributos
    private double radio;

    //Constructores

    //Constructor vacío
    public Circulo() {

    }

    //Constructor completo
    public Circulo(double radio) {
        this.radio = radio;
    }

    //Métodos

    //Método para calcular el área
    @Override
    public double area() {
        return Math.PI * (radio * radio);
    }
    
}
