package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
private Date dataDeFabricaçao;

public ProdutoUsado() {
    super();}

public ProdutoUsado(String nome, Double preco, Date dataDeFabricaçao) {
    super(nome, preco);
    this.dataDeFabricaçao = dataDeFabricaçao;}

public Date getDataDeFabricaçao() {
    return dataDeFabricaçao;
}

public void setDataDeFabricaçao(Date dataDeFabricaçao) {
    this.dataDeFabricaçao = dataDeFabricaçao;
}

@Override
    public String toString() {
        return  getNome()+" (usado) " +
         " $" + String.format("%.2f", getPreco())+
         " (Data de Fabricação: "+sdf.format(dataDeFabricaçao) + ")";}

}
