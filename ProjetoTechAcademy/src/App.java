import Dominio.*;
import Servico.ColaboradorServ;
import DAO.*;

public class App {
    public static void main(String[] args) throws Exception {
        testarSRV();
    }

    private static void testarSRV(){
        System.out.println("***** TESTANDO SERVIÇO *****");
        ColaboradorServ srv = new ColaboradorServ();

        System.out.println("\n\n\n\n\n");
        System.out.println("***** ORIGINAL *****");
        for(Colaborador item : srv.listar()){
            item.exibir();
        }

        System.out.println("\n\n\n\n\n");
        System.out.println("***** ADICIONANDO *****");
        Colaborador colab01 = new Colaborador(0, "Lula", "95101", "Presidente");
        srv.adicionar(colab01);
        colab01.exibir();        

        System.out.println("\n\n\n\n\n");
        System.out.println("***** APÓS ADIÇÃO DE REGISTRO *****");
        for(Colaborador item : srv.listar()){
            item.exibir();
        }

        System.out.println("\n\n\n\n\n");
        System.out.println("***** ALTERANDO *****");
        colab01.setNome("Renan");
        Colaborador colab02 = srv.editar(colab01);
        colab02.exibir();

        System.out.println("\n\n\n\n\n");
        System.out.println("***** APÓS ALTERAÇÃO DE REGISTRO *****");
        for(Colaborador item : srv.listar()){
            item.exibir();
        }

        System.out.println("\n\n\n\n\n");
        System.out.println("***** APAGANDO *****");
        srv.excluir(colab02);
        colab02.exibir();

        System.out.println("\n\n\n\n\n");
        System.out.println("***** APÓS APAGAR O REGISTRO *****");
        for(Colaborador item : srv.listar()){
            item.exibir();
        }        
    }

    private static void testarDAO(){
        ColaboradorDAO dao = new ColaboradorDAO();

        System.out.println("\n\n\n\n\n");
        System.out.println("***** ORIGINAL *****");
        for(Colaborador item : dao.readAll()){
            item.exibir();
        }

        System.out.println("\n\n\n\n\n");
        System.out.println("***** ADICIONANDO *****");
        Colaborador colab01 = new Colaborador(0, "Lula", "95101", "Presidente");
        dao.create(colab01);
        colab01.exibir();

        System.out.println("\n\n\n\n\n");
        System.out.println("***** APÓS ADIÇÃO DE REGISTRO *****");
        for(Colaborador item : dao.readAll()){
            item.exibir();
        }

        System.out.println("\n\n\n\n\n");
        System.out.println("***** ALTERANDO *****");
        colab01.setNome("Renan");
        Colaborador colab02 = dao.update(colab01);
        colab02.exibir();

        System.out.println("\n\n\n\n\n");
        System.out.println("***** APÓS ALTERAÇÃO DE REGISTRO *****");
        for(Colaborador item : dao.readAll()){
            item.exibir();
        }

        System.out.println("\n\n\n\n\n");
        System.out.println("***** APAGANDO *****");
        dao.delete(colab02);
        colab02.exibir();

        System.out.println("\n\n\n\n\n");
        System.out.println("***** APÓS APAGAR O REGISTRO *****");
        for(Colaborador item : dao.readAll()){
            item.exibir();
        }
    }
}
