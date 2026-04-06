package br.com.fiap.entities;

public class Endereco {
    private int numeroCasa;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String complemento;

    public Endereco() {

    }

    public Endereco(int numeroCasa, String logradouro, String bairro, String cidade, String estado, String cep, String complemento) {
        this.numeroCasa = numeroCasa;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.complemento = complemento;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "\n\nEndereco:" +
                "\nnumeroCasa:" + numeroCasa +
                "\nlogradouro:" + logradouro +
                "\nbairro:" + bairro +
                "\ncidade:" + cidade +
                "\nestado:" + estado +
                "\ncep:" + cep +
                "\ncomplemento:" + complemento;
    }
}
