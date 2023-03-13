//Albert Lozano Blasco

public class ProgramaRectangulo {
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo();
        Rectangulo rectangulo2 = new Rectangulo();

        rectangulo1.x1 = 0;
        rectangulo1.y1 = 0;
        rectangulo1.x2 = 5;
        rectangulo1.y2 = 5;

        rectangulo2.x1 = 7;
        rectangulo2.y1 = 9;
        rectangulo2.x2 = 2;
        rectangulo2.y2 = 3;

        System.out.println("Las coordenadas del rectangulo 1 son: (" + rectangulo1.x1 + rectangulo1.y1 + ")(" + rectangulo1.x2 + rectangulo1.y2);
        System.out.println("El perímetro del rectángulo 1 es: " + ((rectangulo1.x2 - rectangulo1.x1) + (rectangulo1.y2 - rectangulo1.y1)) * 2);
        System.out.println("El área del rectángulo 1 es: " + (rectangulo1.x2 - rectangulo1.x1) * (rectangulo1.y2 - rectangulo1.y1));
        System.out.println("Las coordenadas del rectangulo 2 son: (" + rectangulo2.x1 + rectangulo2.y1 + ")(" + rectangulo2.x2 + rectangulo2.y2);
        System.out.println("El perímetro del rectángulo 1 es: " + ((rectangulo2.x2 - rectangulo2.x1) + (rectangulo2.y2 - rectangulo2.y1)) * 2);
        System.out.println("El área del rectángulo 1 es: " + (rectangulo2.x2 - rectangulo2.x1) * (rectangulo2.y2 - rectangulo2.y1));
    }
}
