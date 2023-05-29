import java.util.Arrays;

public class VectorInt implements IMinMax, IEstadisticas, IComparable {

    //Atributos
    private int[] vector;

    //-------------------------------------------------

    //Constructores

    //Constructor vacío
    public VectorInt () {

    }

    //Constructor con vector
    public VectorInt (int tamaño){
        this.vector = new int[tamaño];
    }

    //-------------------------------------------------

    //Setters y Getters

    //Setter
    public void setVector(int[] vector) {
        this.vector = vector;
    }

    //Getters
    public int[] getVector() {
        return vector;
    }

    //-------------------------------------------------

    //Métodos

    //Métodos de la clase

    //Método para mostrar el vector
    public String toString () {
        String vector = "Vector: [";
        for (int i = 0; i < this.vector.length; i++) {
            if (i == this.vector.length - 1) {
                vector += Integer.toString(this.vector[i]);
            } else {
                vector += Integer.toString(this.vector[i]) + " ";
            }
        }
        vector += "]";
        return vector;
    }

    //Método random que rellena todas las posiciones del array con números aleatorios entre min y max
    public void random (int min, int max) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * (max - min + 1)) + min;
        }
    }

    //Métodos de la interfaz IMinMax

    @Override
    public int getMinimo() {
        int minimo = Integer.MAX_VALUE;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < minimo) {
                minimo = vector[i];
            }
        }
        return minimo;
    }

    @Override
    public int getMaximo() {
        int maximo = Integer.MIN_VALUE;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > maximo) {
                maximo = vector[i];
            }
        }
        return maximo;
    }

    //Métodos de la interfaz IEstadisticas

    @Override
    public double getMedia() {
        double media = 0;
        for (int i = 0; i < vector.length; i++) {
            media += vector[i];
        }
        media /= vector.length;
        return media;
    }

    @Override
    public double getMediana() {
        Arrays.sort(vector);
        if (vector.length % 2 == 0) {
            int indexMitad1 = vector.length / 2 - 1;
            int indexMitad2 = vector.length / 2;
            return (vector[indexMitad1] + vector[indexMitad2] / 2);
        } else {
            int mitad = (vector.length / 2);
            return vector[mitad]; 
        }
    }

    @Override
    public double getModa() {
        Arrays.sort(vector);

        int numActual = vector[0];
        int maxRepeticiones = 1;
        int repeticiones = 1;
        int moda = numActual;

        for (int i = 1; i < vector.length; i++) {
            if (vector[i] == numActual) {
                repeticiones++;
            } else {
                if (repeticiones > maxRepeticiones) {
                    moda = numActual;
                }
                numActual = vector[i];
                repeticiones = 1;
            }
        }

        if (repeticiones > maxRepeticiones) {
            moda = numActual;
        }

        return moda;
    }

    //Métodos de la interfaz IComparable
    //Al comparar dos vectores se tienen que comparar los números resultantes de concatenar los números que contienen (ignorando el signo negativo)

    @Override
    public boolean esIgual(int[] v) {
        String cad1 = "";
        for (int i = 0; i < vector.length; i++) {
            cad1 += Integer.toString(Math.abs(vector[i]));
        }

        String cad2 = "";
        for (int i = 0; i < v.length; i++) {
            cad2 += Integer.toString(Math.abs(vector[i]));
        }

        int v1 = Integer.parseInt(cad1);
        int v2 = Integer.parseInt(cad2);

        if (v1 == v2) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean esMayor(int[] v) {
        String cad1 = "";
        for (int i = 0; i < vector.length; i++) {
            cad1 += Integer.toString(Math.abs(vector[i]));
        }

        String cad2 = "";
        for (int i = 0; i < v.length; i++) {
            cad2 += Integer.toString(Math.abs(vector[i]));
        }

        int v1 = Integer.parseInt(cad1);
        int v2 = Integer.parseInt(cad2);

        if (v1 > v2) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean esMenor(int[] v) {
        String cad1 = "";
        for (int i = 0; i < vector.length; i++) {
            cad1 += Integer.toString(Math.abs(vector[i]));
        }

        String cad2 = "";
        for (int i = 0; i < v.length; i++) {
            cad2 += Integer.toString(Math.abs(vector[i]));
        }

        int v1 = Integer.parseInt(cad1);
        int v2 = Integer.parseInt(cad2);

        if (v1 < v2) {
            return true;
        } else {
            return false;
        }
    }

    //-------------------------------------------------

    public static void main(String[] args) {

        VectorInt vi = new VectorInt(5);
        vi.random(0, 5);

        System.out.println(vi);
        System.out.println("Minimo: " + vi.getMinimo());
        System.out.println("Maximo: " + vi.getMaximo());
        System.out.println("Media: " + vi.getMedia());
        System.out.println("Mediana: " + vi.getMediana());
        System.out.println("Moda: " + vi.getModa());
        System.out.println();

        VectorInt vi2 = new VectorInt(3);
        vi2.random(-20, 20);

        System.out.println(vi2);
        System.out.println("¿Es igual? " + vi.esIgual(vi2.getVector()));
        System.out.println("¿Es mayor? " + vi.esMayor(vi2.getVector()));
        System.out.println("¿Es menor? " + vi.esMenor(vi2.getVector()));

    }
    
}
