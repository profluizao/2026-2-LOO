package FakeDB;

import java.util.ArrayList;

import Dominio.Colaborador;

public class ColaboradorFakeDB {
    private ArrayList<Colaborador> dados;

    public ArrayList<Colaborador> getDados(){
        return this.dados;
    }

    private void autoPreencher(){
        this.dados.add(new Colaborador(101, "Mateus Pereira", "1231", "Estagiário"));
        this.dados.add(new Colaborador(102, "Lucas Braga", "1232", "Técnico de TI"));
        this.dados.add(new Colaborador(103, "Pedro Malta", "1233", "Técnico Adm"));
        this.dados.add(new Colaborador(104, "João Alves", "1234", "Recepcionista"));
        this.dados.add(new Colaborador(105, "Marcos Borba", "1235", "Vendedor"));
    }

    public ColaboradorFakeDB(){
        this.dados = new ArrayList<>();
        this.autoPreencher();
    }
}
