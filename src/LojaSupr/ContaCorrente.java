package LojaSupr;

public class ContaCorrente {
    private String numero;
    private String agencia;
    private double saldo;

    public ContaCorrente(String numero, String agencia, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo < 0 ? 0 : saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo < 0 ? 0 : saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
        }
    }
}
