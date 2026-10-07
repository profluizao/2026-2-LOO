import java.util.Locale;
import java.util.Scanner;

import Dominio.Aluno;

public class MenuAluno {
    public void executar(){
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.println("--- CADASTRO DO ALUNO ---");

        System.out.println("Digite o código: ");
        int codigo = scan.nextInt();
        scan.nextLine();

        System.out.println("Digite o nome: ");
        String nome = scan.nextLine();

        System.out.println("Digite o CPF: ");
        String cpf = scan.nextLine();

        System.out.println("Digite a Matrícula: ");
        String matricula = scan.nextLine();

        System.out.println("Digite a nota: ");
        double nota = scan.nextDouble();

        Aluno a1 = new Aluno(codigo, nome, cpf, matricula);
        a1.setNota(nota);

        scan.close();

        a1.exibir();
    }
}
