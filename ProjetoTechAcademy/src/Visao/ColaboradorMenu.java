package Visao;

import java.util.Scanner;

import Dominio.Colaborador;
import Servico.ColaboradorServ;
import Tools.Util;

public class ColaboradorMenu extends AbsMenu {

    private ColaboradorServ servico;
    
    private Colaborador colabSelecionado;

    @Override
    public void executar(){
        int opcao = 0;
        while(opcao != 9){
            System.out.println("\n\n");
            opcao = this.exibirMenuPrincipal("COLABORADOR");
            switch (opcao) {
                case 1:
                    this.listar();
                    break;
                case 2:
                    this.pesquisarPorCodigo();
                    this.pausar();
                    break;
                case 3:
                    this.incluir();
                    break;
                case 4:
                    this.alterar();
                    break;
                case 5:
                    this.excluir();
                    break;
                case 9:
                    System.out.println("TCHAU");
                    break;
                default:
                    System.out.println("OPA, OPÇÃO ERRADA!!!");
                    this.pausar();
                    break;
            }
            Util.limparTerminal();
        }
    }

    private void listar(){
        System.out.println("\n\n");
        System.out.println("***** LISTAR *****");
        for(Colaborador item  : this.servico.listar()){
            item.exibir();
        }
    }

    private void pesquisarPorCodigo(){
        System.out.println("\n\n");
        System.out.println("***** PESQUISAR POR CÓDIGO *****");
        System.out.print("Digite o código: ");
        int codigo = this.scan.nextInt();
        this.scan.nextLine();
        Colaborador colab = this.servico.buscar(codigo);
        if(colab != null){
            colab.exibir();
            this.colabSelecionado = colab;
        }
        else{
            System.out.println("ERRO - código inválido");
        }
    }

    private void incluir(){
        System.out.println("\n\n");
        System.out.println("***** INCLUIR *****");
        System.out.print("Nome: ");
        String nome = this.scan.next();
        System.out.print("CPF: ");
        String cpf = this.scan.next();
        System.out.print("Cargo: ");
        String cargo = this.scan.next();
        Colaborador novo = new Colaborador(0, nome, cpf, cargo);
        novo = this.servico.adicionar(novo);
        novo.exibir();
    }

    private void alterar(){
        System.out.println("\n\n");
        System.out.println("ALTERAR");
        this.pesquisarPorCodigo();
        if (this.colabSelecionado == null){
            System.out.println("ERRO - não posso prosseguir com alteração.");
            this.pausar();
            return;
        }
        int opcao = 0;
        while (opcao != 9) {
            System.out.println("O que vc deseja alterar?");
            System.out.println("1 - Nome");
            System.out.println("2 - CPF");
            System.out.println("3 - Cargo");
            System.out.println("9 - Salvar");
            System.out.print("Selecione um campo: ");
            opcao = this.scan.nextInt();
            this.colabSelecionado.exibir();
            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = this.scan.next();
                    this.colabSelecionado.setNome(nome);
                    break;

                case 2:
                    System.out.print("CPF: ");
                    String cpf = this.scan.next();
                    this.colabSelecionado.setCpf(cpf);
                    break;

                case 3:
                    System.out.print("Cargo: ");
                    String cargo = this.scan.next();
                    this.colabSelecionado.setCargo(cargo);
                    break;
                
                case 9:
                    this.colabSelecionado = this.servico.editar(this.colabSelecionado);
                    this.colabSelecionado.exibir();
                    break;
                default:
                    break;
            }
        }
    }

    private void excluir(){
        System.out.println("\n\n");
        System.out.println("***** EXCLUIR *****");
        this.pesquisarPorCodigo();
        if (this.colabSelecionado == null){
            System.out.println("ERRO - não posso prosseguir com exclusão.");
            this.pausar();
            return;
        }
        System.out.print("Confirma exclusão (1-Sim / 2-Não)? ");
        int opcao = this.scan.nextInt();
        if (opcao == 1){
            this.colabSelecionado = this.servico.excluir(this.colabSelecionado);
            this.colabSelecionado.exibir();
        }
    }

    public ColaboradorMenu(){
        this.servico = new ColaboradorServ();
        this.scan = new Scanner(System.in);        
    }
}
