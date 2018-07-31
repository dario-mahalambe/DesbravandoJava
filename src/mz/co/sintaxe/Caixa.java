package mz.co.sintaxe;

import java.util.ArrayList;

public class Caixa {


    public static ArrayList<Livro> carrinho = new ArrayList<>();



    public static void adicionarLivros(Livro livro){

        carrinho.add(livro);

    }


    public static void calcularTotalAPagar(){

        double total = 0;

        System.out.println("-------------Recibo-----------------");

        for (int i = 0; i < carrinho.size(); i++) {

            System.out.println(carrinho.get(i).getNome() + " " + carrinho.get(i).getValor());

            total += carrinho.get(i).getValor();
        }

        System.out.println("-----------------------------------");

        System.out.println("--------" +"O valor a pagar e " + total+ "----------");
    }


}
