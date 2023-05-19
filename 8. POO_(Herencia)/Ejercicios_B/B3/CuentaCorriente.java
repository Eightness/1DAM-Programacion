public class CuentaCorriente {

    //Atributos
    private String titular;
    private double saldo;
    protected double comisionOperacion;
    protected double comisionMensual;
    protected double interesesMensual;

    //Constructor

    //Constructor vacío
    public CuentaCorriente() {

    }

    //Constructor completo
    public CuentaCorriente(String titular, double saldo) {
        setTitular(titular);
        setSaldo(saldo);
    }

    //Setters y Getters

    //Setters
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Getters
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getComisionMensual() {
        return comisionMensual;
    }

    public double getComisionOperacion() {
        return comisionOperacion;
    }

    public double getInteresesMensual() {
        return interesesMensual;
    }

    //Métodos

    //Método para ver la cuenta
    public void verCuenta() {
        System.out.println();
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo + " euros");
        System.out.println();
        System.out.println("Comisión operación: " + comisionOperacion);
        System.out.println("Comisión mensual: " + comisionMensual);
        System.out.println("Intereses mensuales: " + interesesMensual);
        System.out.println();
    }

    //Método para ingresar
    public boolean ingresar(double dinero) {
        return false;
    }

    //Método para retirar
    public boolean retirar(double dinero) {
        return false;
    }

    //Método para actualizar mensualidad
    public void actualizarMensualidad() {

    }
    
}
