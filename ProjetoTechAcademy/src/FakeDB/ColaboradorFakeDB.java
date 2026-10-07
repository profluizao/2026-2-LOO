package FakeDB;

import java.util.ArrayList;

import Dominio.Colaborador;

public class ColaboradorFakeDB {
    private ArrayList<Colaborador> dados;

    public ArrayList<Colaborador> getDados(){
        return this.dados;
    }

    public ColaboradorFakeDB(){
        this.dados = new ArrayList<>();
        this.autoPreencher();
    }

    private void autoPreencher(){
        this.dados.add(new Colaborador(101, "Mateus Souza", "12345679811", "Estagiário"));
        this.dados.add(new Colaborador(102, "João Silva", "12345679812", "Bibliotecário"));
        this.dados.add(new Colaborador(103, "Paulo Santos", "12345679813", "Jovem Aprendiz"));
        this.dados.add(new Colaborador(104, "André Matos", "12345679814", "Técnico TI"));
        this.dados.add(new Colaborador(105, "Pedro Lima", "12345679815", "Estagiário"));
    }
}
