import java.util.Scanner;

public class String5 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Escribe una cadena de texto: ");
        String texto = input.nextLine();

        char letra;
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;


        for (int c = 0; c < texto.length(); c++) {

            letra = texto.charAt(c);

            switch (letra) {

                case 'a':
                    a++;
                break;

                case 'e':
                    e++;
                break;

                case 'i':
                    i++;
                break;

                case 'o':
                    o++;
                break;

                case 'u':
                    u++;
                break;

            }
            
        }

        System.out.println("Nº de A: " + a);
        System.out.println("Nº de E: " + e);
        System.out.println("Nº de I: " + i);
        System.out.println("Nº de O: " + o);
        System.out.println("Nº de U: " + u);
       
    }
    
}
