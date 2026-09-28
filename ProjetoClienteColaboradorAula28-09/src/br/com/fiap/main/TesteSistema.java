package br.com.fiap.main;

import br.com.fiap.entities.Cliente;
import br.com.fiap.entities.Colaborador;
import br.com.fiap.entities.Endereco;

import javax.swing.*;

public class TesteSistema {

    // java 21 psvm // java 25 public psvma
    public static void main(String[] args) {

        // instanciar objetos
        Cliente objCliente = new Cliente();
        Colaborador objColaborador = new Colaborador();
        Endereco objEndereco = new Endereco();

        // entradas clientes

        objCliente.setNome(JOptionPane.showInputDialog("INFORMAÇÔES DO CLIENTE\nNome do cliente: "));
        objCliente.setRg( JOptionPane.showInputDialog("Digite o RG: "));
        objCliente.setIdade( Integer.parseInt(JOptionPane.showInputDialog("Digite a idade") ));
        objCliente.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura") ));

        //entrada colaborador

        objColaborador.setNumeroRegistro(Integer.parseInt(JOptionPane.showInputDialog("INFORMAÇÔES DO COLABORADOR\nNumero de registro: ")));
        objColaborador.setNome(JOptionPane.showInputDialog("Nome do colaborador: "));
        objColaborador.setSetor(JOptionPane.showInputDialog("Setor"));
        objColaborador.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Salario")));
        objColaborador.setEndereco(objEndereco);

        //Entradas endereço

        objEndereco.setLogradouro("INFORMAÇÕES DE ENDEREÇO\nEndereço claborador\nLogradouro");
        objEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Numero")));
        objEndereco.setComplemento(JOptionPane.showInputDialog("Endereço"));
        objEndereco.setCep(JOptionPane.showInputDialog("Cep"));
        objEndereco.setBairro(JOptionPane.showInputDialog("Bairro"));
        objEndereco.setCidade(JOptionPane.showInputDialog("Cidade"));
        objEndereco.setEstado(JOptionPane.showInputDialog("Estado"));

        //saida

        System.out.println(
                objCliente + "" + objColaborador

        );


    }




}
