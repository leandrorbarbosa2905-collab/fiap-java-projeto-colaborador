package br.com.fiap.entities;

public class Empresa {
    private String marca;
    private String tipoProduto;
    private String modelo;
    private double preco;
    private double numeroProduto;


    public Empresa() {

    }

    public Empresa(String marca, String tipoProduto, String modelo, double preco, double numeroProduto) {
        this.marca = marca;
        this.tipoProduto = tipoProduto;
        this.modelo = modelo;
        this.preco = preco;
        this.numeroProduto = numeroProduto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getNumeroProduto() {
        return numeroProduto;
    }

    public void setNumeroProduto(double numeroProduto) {
        this.numeroProduto = numeroProduto;
    }

    @Override
    public String toString() {
        return "\n\nEmpresa:" +
                "\nmarca:" + marca +
                "\ntipoProduto:" + tipoProduto +
                "\nmodelo:" + modelo +
                "\npreco:" + preco +
                "\nnumeroProduto=:" + numeroProduto;
    }
}
