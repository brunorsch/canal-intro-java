package br.com.brunnofdc.consultadepreco;

public class Produto {
    protected final String nome;
    protected final double preco;
    protected final String codigoBarras;

    public Produto(String nome, double preco, String codigoBarras) {
        this.nome = nome;
        this.preco = preco;
        this.codigoBarras = codigoBarras;
    }

    public String obterTextoExibicao() {
        return nome + " - " + getPrecoFormatado();
    }

    private String getPrecoFormatado() {
        return "R$ " + preco;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }
}