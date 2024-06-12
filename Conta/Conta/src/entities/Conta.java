package entities;

import entities.excecões.DominioExcecao;

public class Conta {
private Integer numero;
private String titular;
private Double balanco;
private Double limiteDeSaque;

public Conta (){}

public Conta(Integer numero, String titular, Double balanco, Double limiteDeSaque) {
    this.numero = numero;
    this.titular = titular;
    this.balanco = balanco;
    this.limiteDeSaque = limiteDeSaque;}

public Integer getNumero() {
    return numero;}

public void setNumero(Integer numero) {
    this.numero = numero;}

public String getTitular() {
    return titular;}

public void setTitular(String titular) {
    this.titular = titular;}

public Double getBalanco() {
    return balanco;}

public Double getLimiteDeSaque() {
    return limiteDeSaque;}

public void setLimiteDeSaque(Double limiteDeSaque) {
    this.limiteDeSaque = limiteDeSaque;}

public void deposito (Double quantia){
  balanco += quantia;}

public void saque (Double quantia){
    validacaoSaque(quantia);
    balanco -= quantia;}

private void validacaoSaque(Double quantia){
    if (quantia > getLimiteDeSaque()){
        throw new DominioExcecao("Erro de saque: Quantia de saque maior que o limite permitido");
    }
    if (quantia > getBalanco()){
        throw new DominioExcecao("Erro de saque: Saldo insufuciente");
    }
}


}
