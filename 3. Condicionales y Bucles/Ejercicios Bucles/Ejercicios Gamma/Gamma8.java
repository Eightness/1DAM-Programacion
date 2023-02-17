public class Gamma8 {

    public static void main(String[] args) {
        
        int numDias = 0;

        for (int m = 1; m <= 12 ; m++) {

            switch (m) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
                    numDias = 31;
                break;
                
                case 4: case 6: case 9: case 11:
                    numDias = 30;
                break;
                
                case 2:
                    numDias = 28;
                break;
                
                default:
                    System.out.println("Error en el mes.");
                break;
            }

            for (int d = 1; d <= numDias; d++) {
                    System.out.println(d + "/" + m);
                }
        }
    }
}  
