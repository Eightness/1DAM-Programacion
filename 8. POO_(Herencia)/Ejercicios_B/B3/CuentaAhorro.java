public class CuentaAhorro extends CuentaCorriente {

    //Atributos
    private int MAX_OPERACIONES;
    private int contadorOperaciones;

    //Constructor

    //Constructor vacío
    public CuentaAhorro() {
        
    }

    //Constructor completo
    public CuentaAhorro(int MAX_OPERACIONES, int contadorOperaciones) {
        setMAX_OPERACIONES(MAX_OPERACIONES);
        setContadorOperaciones(contadorOperaciones);
        comisionOperacion = 1;
        comisionMensual = 0;
        interesesMensual = 0.1;
    }

    //Setters y Getters

    //Setters
    public void setMAX_OPERACIONES(int mAX_OPERACIONES) {
        MAX_OPERACIONES = mAX_OPERACIONES;
    }

    public void setContadorOperaciones(int contadorOperaciones) {
        this.contadorOperaciones = contadorOperaciones;
    }

    //Getters
    public int getMAX_OPERACIONES() {
        return MAX_OPERACIONES;
    }

    public int getContadorOperaciones() {
        return contadorOperaciones;
    }

    //Métodos

    //Método para ver cuenta
    public void verCuenta() {
        super.verCuenta();
        System.out.println("Operaciones disponbiles: " + (MAX_OPERACIONES - contadorOperaciones));
        System.out.println();
    }
    
}
