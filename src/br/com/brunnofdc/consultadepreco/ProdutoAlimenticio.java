package br.com.brunnofdc.consultadepreco;

public class ProdutoAlimenticio extends Produto {
    public ProdutoAlimenticio(String nome, double preco, String codigoBarras) {
        super(nome, preco, codigoBarras);
    }

    @Override
    public String obterTextoExibicao() {
        return super.obterTextoExibicao() + "; Preço no atacado (Acima de 5 unidades): " + getPrecoFormatadoNoAtacado();
    }

    private String getPrecoFormatadoNoAtacado() {
        double precoComDisconto = this.preco - (this.preco * 0.10);
        return "R$ " + precoComDisconto;
    }
}