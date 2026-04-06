package br.com.fiap.entities;

public class Colaborador {
    private String nome;
    private String sobreNome;
    private String cpf;
    private int identificacao;
    private double altura;
    private double salarioMes;
    private String numeroCelular;
    private Endereco endereco;


    //vazio

    public Colaborador() {

    }

    //cheio

    public Colaborador(String nome, String sobreNome, String cpf, int identificacao, double altura, double salarioMes, String numeroCelular) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.cpf = cpf;
        this.identificacao = identificacao;
        this.altura = altura;
        this.salarioMes = salarioMes;
        this.numeroCelular = numeroCelular;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getSalarioMes() {
        return salarioMes;
    }

    public void setSalarioMes(double salarioMes) {
        this.salarioMes = salarioMes;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Colaborador:" +
                "\nnome:" + nome +
                "\nsobreNome:" + sobreNome +
                "\ncpf:" + cpf +
                "\nidentificacao:" + identificacao +
                "\naltura:" + altura +
                "\nsalarioMes:" + salarioMes +
                "\nnumeroCelular:" + numeroCelular +
                "\nendereco:" + endereco;
    }
}
