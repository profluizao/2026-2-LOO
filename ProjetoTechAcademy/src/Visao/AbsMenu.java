package Visao;

import java.util.Scanner;

public abstract class AbsMenu {

    protected Scanner scan;

    public abstract void executar();

    protected int exibirMenuPrincipal(String dominio){
        System.out.println("----- MENU PRINCIPAL [" + dominio + "] -----");
        System.out.println("1 - Listar");
        System.out.println("2 - Pesquisar por Código");
        System.out.println("3 - Incluir");
        System.out.println("4 - Alterar");
        System.out.println("5 - Excluir");
        System.out.println("9 - Sair");
        System.out.print("Selecione uma opção: ");
        int escolha = this.scan.nextInt();
        return escolha;
    }

}
