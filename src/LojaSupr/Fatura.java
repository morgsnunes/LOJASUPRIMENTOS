package LojaSupr;

public class Fatura {
    private String numero;
    private String descricao;
    private int quantidade;
    private double preco;

    public Fatura(String numero, String descricao, int quantidade, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade < 0 ? 0 : quantidade;
        this.preco = preco < 0 ? 0.0 : preco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade < 0 ? 0 : quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco < 0 ? 0.0 : preco;
    }

    public double getTotalFatura() {
        return quantidade * preco;
    }
}