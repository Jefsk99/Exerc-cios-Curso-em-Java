package entities;

public class ProdutoImportado extends Produto {
    private Double taxaAduaneira;

    public ProdutoImportado() {
        super();
    }

    public ProdutoImportado(String nome, Double preco, Double taxaAduaneira) {
        super(nome, preco);
        this.taxaAduaneira = taxaAduaneira;
    }

    public Double getTaxaAduaneira() {
        return taxaAduaneira;
    }

    public void setTaxaAduaneira(Double taxaAduaneira) {
        this.taxaAduaneira = taxaAduaneira;
    }

    public Double precoTotal() {
        return getPreco() + taxaAduaneira;
    }

    @Override
    public String toString() {
        return  getNome() +
         " $" + String.format("%.2f", precoTotal())+
         " (Taxa Aduaneira: $"+String.format("%.2f",taxaAduaneira)+")";}
}