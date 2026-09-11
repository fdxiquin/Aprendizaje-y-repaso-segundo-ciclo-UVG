public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Ana", 500.00);

        //mostrar saldo inicial
        cuenta.mostrarSaldo();

        //cambiar el saldo usando el setSaldo
        cuenta.setSaldo(2000.50);

        //mostar el nuevo saldo
        cuenta.mostrarSaldo();

        //imprimir solo el saldo con el getSaldo
        System.out.println("Su saldo actual es de: " + cuenta.getSaldo());
    }
}

