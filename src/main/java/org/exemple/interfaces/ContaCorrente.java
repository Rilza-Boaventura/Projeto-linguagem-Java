
package org.exemple.interfaces;

public class ContaCorrente implements Conta{
    private Double saldo = 100.00;
    private final Double taxaOpreracao = 0.60;

    @Override
    public void depositar(Double valor){
        this.saldo += valor - taxaOpreracao;

    }

    @Override
    public void sacar(Double valor){
        this.saldo -= valor - taxaOpreracao;

    }

    @Override
    public Double getSaldo() {
        return saldo;
    }
}

