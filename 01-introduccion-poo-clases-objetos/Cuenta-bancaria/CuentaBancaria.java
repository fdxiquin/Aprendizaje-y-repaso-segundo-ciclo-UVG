public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void mostrarSaldo() {
        System.out.println("Estos son los datos de su cuenta bancaria");
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
        System.out.println();
    }
}
