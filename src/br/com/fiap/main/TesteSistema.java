package br.com.fiap.main;

import br.com.fiap.entities.Colaborador;
import br.com.fiap.entities.Empresa;
import br.com.fiap.entities.Endereco;

import javax.swing.*;

public class TesteSistema {

    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    static double real(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));

    }

    public static void main(String[] args) {

        //String nome, String sobreNome, String cpf, int identificacao, double altura, double salarioMes, String numeroCelular

        Colaborador objColaborador = new Colaborador(

                texto("Nome"),
                texto("Sobrenome"),
                texto("CPF"),
                inteiro("Indentificacao"),
                real("Altura"),
                real("salario do mes"),
                texto("Numero de celular")

        );

        //int numeroCasa, String logradouro, String bairro, String cidade, String estado, String cep, String complemento

        Endereco objEndereco = new Endereco(

                inteiro("Numero da casa"),
                texto("Logradouro"),
                texto("Bairro"),
                texto("Cidade"),
                texto("estado"),
                texto("Cep"),
                texto("Complemento")
        );

        objColaborador.setEndereco(objEndereco);

        //String marca, String tipoProduto, String modelo, double preco, double numeroProduto

        Empresa objEmpresa = new Empresa(

                texto("Marca"),
                texto("Tipo de produto"),
                texto("Modelo"),
                real("preco"),
                real("Numero do Produto")
        );

        System.out.println(
                objColaborador + "" + objEmpresa
        );


    }



}
