import java.util.ArrayList;

import Dominio.Aluno;
import Dominio.Professor;

public class Listas {
    
    public void testeAlunos(){
        System.out.println("Testando listas...");
        ArrayList<Aluno> listaDeAlunos = new ArrayList<>();
        Aluno a1 = new Aluno(10, "Alberto", "123", "ABC123");
        listaDeAlunos.add(a1);

        listaDeAlunos.add(new Aluno(11, "Breno", "321", "ABC124"));
        listaDeAlunos.add(new Aluno(12, "Carlos", "322", "ABC125"));
        listaDeAlunos.add(new Aluno(13, "Diego", "323", "ABC126"));
        listaDeAlunos.add(new Aluno(14, "Evandro", "324", "ABC127"));
        listaDeAlunos.add(new Aluno(15, "Fabio", "325", "ABC128"));
        listaDeAlunos.add(new Aluno(16, "Gustavo", "326", "ABC129"));

        System.out.println("Tamanho da lista: " + listaDeAlunos.size());

        for(int x = 0; x < listaDeAlunos.size(); x++){
            System.out.println("----- Usando um 'for' comum -----");
            listaDeAlunos.get(x).exibir();
        }

        int y = 0;
        while (y < listaDeAlunos.size()) {
            System.out.println("----- Usando um 'while' -----");
            listaDeAlunos.get(y).exibir();
            y++;
        }

        for(Aluno al : listaDeAlunos){
            System.out.println("----- Usando 'for each' -----");
            al.exibir();
        }
    }

    public void testeProfessores(){
        ArrayList<Professor> listaProfs = new ArrayList<>();
        listaProfs.add(new Professor(101, "Adão", "123", 3200.0));
        listaProfs.add(new Professor(102, "Betina", "124", 3500.0));
        listaProfs.add(new Professor(103, "Cláudia", "125", 3500.0));

        for (Professor prof : listaProfs) {            
            System.out.println("----------");
            prof.exibir();
        }
    }

    public Listas(){ }
}
