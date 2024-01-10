package br.com.brunnofdc.consultadepreco;

import java.util.Scanner;

public class ConsultaDePrecoApp {
    private static Produto[] produtos = {
        new ProdutoAlimenticio("Guaraná Fruki Lata", 4.00, "789643100222"),
        new Produto("Cotonetes Johnson & Johnson", 10.00, "7891010560737"),
        new ProdutoAlimenticio("Molho p/ Salada Liza Rosé", 15.00, "7896036090909"),
        new Produto("Filtro café 102 Melitta", 5.00, "7891021001885")
    };

    public static void main(String[] args) {
        System.out.println("Informe o código de barras:");

        Scanner scan = new Scanner(System.in);

        String codigoBarrasInformado = scan.nextLine();

        Produto produtoEncontrado = procurarProdutoPorCodigo(codigoBarrasInformado);

        if(produtoEncontrado != null) {
            System.out.println(produtoEncontrado.obterTextoExibicao());
        } else {
            System.out.println("Produto não encontrado");
        }
    }

    private static Produto procurarProdutoPorCodigo(String codigoBarras) {
        for(Produto produtoAtual : produtos) {
            if(produtoAtual.getCodigoBarras().equals(codigoBarras)) {
                return produtoAtual;
            }
        }

        return null;
    }
}