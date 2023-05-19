public class CuentaPro extends CuentaCorriente {

    //Atributos

    //Constructor

    //Constructor vacío
    public CuentaPro() {

    }

    //Constructor completo
    public CuentaPro(String titular, double saldo) {
        super(titular, saldo);
        comisionMensual = 100;
        comisionOperacion = 0;
        interesesMensual = 0;
    }

    //Setters y Getters

    //Setters

    //Getters

    //Métodos
    
}
