import FakeDB.ColaboradorFakeDB;

import Dominio.Colaborador;

public class App {
    public static void main(String[] args) throws Exception {
        ColaboradorFakeDB fdb = new ColaboradorFakeDB();
        for (Colaborador item : fdb.getDados()) {
            item.exibir();
        }
    }
}
