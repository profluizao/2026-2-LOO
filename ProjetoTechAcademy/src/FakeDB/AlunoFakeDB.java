package FakeDB;

import java.util.ArrayList;

import Dominio.*;

public class AlunoFakeDB extends AbsFakeDB{

    @Override
    protected void autoPreencher() {
        this.dados.add(new Aluno(11, "Laura Silva", "12301", "2026001"));
        this.dados.add(new Aluno(12, "Ana Moura", "12302", "2026002"));
        this.dados.add(new Aluno(13, "Carlos Almeida", "12303", "2026003"));
        this.dados.add(new Aluno(14, "Diego Costa", "12304", "2026004"));
        this.dados.add(new Aluno(15, "Eduarda Lima", "12305", "2026005"));
    }
    
    public AlunoFakeDB(){
        this.dados = new ArrayList<>();
        this.autoPreencher();
    }
}
