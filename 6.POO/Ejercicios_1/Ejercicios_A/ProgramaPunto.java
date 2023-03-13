//Albert Lozano Blasco

public class ProgramaPunto {
    public static void main(String[] args) {
        Punto punto1 = new Punto();
        punto1.x = 5;
        punto1.y = 0;

        Punto punto2 = new Punto();
        punto2.x = 10;
        punto2.y = 10;

        Punto punto3 = new Punto();
        punto3.x = -3;
        punto3.y = 7;
        
        System.out.println("Las coordenadas del punto 1 son: " + punto1.x + ", " + punto1.y);
        System.out.println("Las coordenadas del punto 2 son: " + punto2.x + ", " + punto2.y);
        System.out.println("Las coordenadas del punto 3 son: " + punto3.x + ", " + punto3.y);

        punto1.x += 2;
        punto1.y += 6;

        punto2.x += 6;
        punto2.y -= 9;

        punto3.x *= 2;
        punto3.y += 5;

        System.out.println("Las coordenadas del punto 1 son: " + punto1.x + ", " + punto1.y);
        System.out.println("Las coordenadas del punto 2 son: " + punto2.x + ", " + punto2.y);
        System.out.println("Las coordenadas del punto 3 son: " + punto3.x + ", " + punto3.y);
    }
}
