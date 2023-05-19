public class EjercicioB2 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Pajaro pajaro = new Pajaro();
        PajaroCarpintero pajaroCarpintero = new PajaroCarpintero();
        Gallo gallo = new Gallo();
        Pez pez = new Pez();
        PezPayaso pezPayaso = new PezPayaso();
        PezEspada pezEspada = new PezEspada();

        System.out.println(animal.cantar());
        System.out.println(pajaro.cantar());
        System.out.println(pajaroCarpintero.cantar());
        System.out.println(gallo.cantar());
        System.out.println(pez.cantar());
        System.out.println(pezPayaso.cantar());
        System.out.println(pezEspada.cantar());
    }
}
