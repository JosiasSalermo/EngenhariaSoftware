public class Conta {

    private double saldo = 0;

    public Conta(double saldoInicial){
        saldo = saldoInicial;
    }

    public void depositar(double quantia){
        saldo += quantia;
    }

    public void sacar (double quantia){
        saldo -= quantia;
    }

    public double getSaldo(){
        return saldo;
    }
}
