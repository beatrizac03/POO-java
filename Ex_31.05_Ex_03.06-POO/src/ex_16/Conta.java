package ex_16;

public class Conta {
    public String titular, numeroConta;
    public double saldo;

    public Conta(String titular, String numero, double saldo) {
        this.titular = titular;
        this.numeroConta = numero;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numeroConta;
    }

    public void setNumero(String numero) {
        this.numeroConta = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "titular='" + titular + '\'' +
                ", numero=" + numeroConta +
                ", saldo=R$" + saldo +
                '}';
    }

}
