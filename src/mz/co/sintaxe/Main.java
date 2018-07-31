package mz.co.sintaxe;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Livraria livraria = new Livraria();


        Caixa.adicionarLivros(Livraria.livrosInformatica.get(0));
        Caixa.adicionarLivros(Livraria.livrosInformatica.get(2));


        Caixa.calcularTotalAPagar();


    }
}
