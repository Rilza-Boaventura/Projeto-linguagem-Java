package org.exemple.lombok;

public class TestePessoa {

    public static  void main(String[] args){
        Pessoa pessoaJulia = new Pessoa();

        pessoaJulia.setId(1l);
        pessoaJulia.setNome("Julia");
        pessoaJulia.setIdade(25);

        System.out.println("Id:" + pessoaJulia.getId());
        System.out.println("Nome:" + pessoaJulia.getNome());
        System.out.println("Idade:" + pessoaJulia.getIdade());
    }
}

