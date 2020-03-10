package br.edu.ifsul.teste1.controller;

import br.edu.ifsul.teste1.model.Carro;
import br.edu.ifsul.teste1.model.Conta;
import br.edu.ifsul.teste1.model.Funcionario;
import br.edu.ifsul.teste1.model.Produto;

public class Main {

    public static void main(String[] args) {

        //produtos
        Produto produto1 = new Produto();
        produto1.setNome("Leite");
        produto1.setId(1);
        produto1.setDescricao("Leite integral");
        produto1.setValor(3.50);
        produto1.setEstoque(148);
        Produto produto2 = new Produto(2, "Iogurte", "Iogurte de morango", 2.99, 450);

        //sem getter
        System.out.println(produto1);
        System.out.println(produto2);

        //com getter
        produto1.setValor(1.99);
        produto2.setValor(2.10);
        System.out.println("Preço do " + produto2.getNome() + " é igual a: " + produto2.getValor());
        System.out.println("Preço do " + produto1.getNome() + " é igual a: " + produto1.getValor());

        //Carros
        Carro carro1 = new Carro();
        Carro carro2 = new Carro("Marca 2", "modelo 2", 2020);
        carro1.setMarca("Marca 1");
        carro1.setModelo("Modelo 1");
        carro1.setAnoFabricacao(2021);

        //sem getter
        System.out.println(carro1);
        System.out.println(carro2);

        //com getter
        produto1.setValor(1.99);
        produto2.setValor(2.10);
        System.out.println("Modelo do carro 2 é" + carro2.getModelo() + " e o ano de fab é: " + carro2.getAnoFabricacao());
        System.out.println("Modelo do carro 1 é" + carro1.getModelo() + " e o ano de fab é: " + carro1.getAnoFabricacao());


        //Conta
        Conta c1 = new Conta(18000);
        Conta c2 = new Conta();
        c2.deposita(5000);
        System.out.println("Saldo conta 1: " +c1.getSaldo());
        System.out.println("Saldo conta 2: " +c2.getSaldo());
        c1.saca(13000);
        c2.saca(1200);
        System.out.println("Saldo conta 1: " +c1.getSaldo());
        System.out.println("Saldo conta 2: " +c2.getSaldo());
        c1.atualiza(2);
        c2.atualiza(5);
        System.out.println("Saldo conta 1: " +c1.getSaldo());
        System.out.println("Saldo conta 2: " +c2.getSaldo());

        //funcionario
        Funcionario f1 = new Funcionario("Matheus Nunes", 3600);
        Funcionario f2 = new Funcionario();
        f2.setNome("João Cézar");
        f2.setSalario(4200);
        System.out.println(f1);
        System.out.println(f2);

        System.out.println("O nome do funcionário 1 é " + f1.getNome() + " e o salário dele é: " + f1.getSalario());
        System.out.println("O nome do funcionário 2 é " + f2.getNome() + " e o salário dele é: " + f2.getSalario());


    }
}
