package br.edu.ifsul.teste1.controller;

import br.edu.ifsul.teste1.model.Produto;
import java.util.*;



public class Main_exercicio2 {

    public static void main(String[] args) {
        Produto produto1 = new Produto(1, "Iogurte", "Iogurte de morango", 2.99, 450);
        Produto produto2 = new Produto(4, "Leite", "Leite integral", 2.99, 700);
        Produto produto3 = new Produto(3, "Tomate", "Tomate vermelho", 1.99, 850);
        Produto produto4 = new Produto(2,"Milho", "milho verde", 3.99, 280);
        Produto produto5 = new Produto(5, "Carne", "Carne de porco", 18.99, 450);


        //List

        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        produtos.add(produto1);
        System.out.println(produtos);

        //pegando o item de id 3 - versão antiga de foreach

        /*
        for(Produto prod : produtos) {
            if(prod.getId() == 3) {
                System.out.println(prod);
            }
        }
        */


        //nova versão de forEach
        produtos.forEach(prod -> {
            if(prod.getId() == 3) {
                System.out.println(prod);
                return;
            }
        });

        //ordenação


        //1ª forma

        //Collections.sort(produtos, Comparator.comparing(Produto::getId)); //ordena em ordem crescente
        //Collections.reverse(produtos); //ordem decrescente

        //2ª forma

        produtos.sort(Comparator.comparingInt(Produto::getId).reversed()); //operador 4 pontos é o operador de resolução de escopo

        System.out.println(produtos);


        //método antigo de fazer ordenação
        Collections.shuffle(produtos); //embaralhar
        System.out.println("Lista embaralhada: " + produtos);
        Collections.sort(produtos);
        System.out.println("Lista ordenada: " + produtos);
        Collections.reverse(produtos);
        System.out.println("Lista em ordem decrescente: " + produtos);


        //estratégia de ordenação inline
        produtos.sort((p1, p2) -> {
            if(p1.getId() < p2.getId()) {
                return -1;
            } else if(p1.getId() > p2.getId())  {
                return 1;
            } return 0;
        });



        //Map
        HashMap <String, Produto> prods = new HashMap <String, Produto>();
        prods.put("Produto 1", produto1);
        prods.put("Produto 2", produto2);
        prods.put("Produto 3", produto3);
        prods.put("Produto 4", produto4);
        prods.put("Produto 5", produto5);
        System.out.println(prods);


    }
}
