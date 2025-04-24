package main.interfaces;

public class TesteInterface {
    public  static void main(String[] args){
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar( 5000.00);
        System.out.println(contaCorrente.getSaldo());

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.depositar(15000.00);
        System.out.println(contaPoupanca.getSaldo());
    }
}
