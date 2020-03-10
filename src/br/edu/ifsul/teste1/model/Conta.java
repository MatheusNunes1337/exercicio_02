package br.edu.ifsul.teste1.model;

public class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public Conta() {

    }

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double valor) {
        this.saldo += valor;

    }
    public void saca(double valor) {
        if(saldo > 0) {
            this.saldo -= valor;
        } else {
            System.out.println("Não foi possível fazer o saque");
        }
    }

    public void atualiza(double taxa) {
        this.saldo += this.saldo * (taxa / 100);
    }


    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                '}';
    }
}
