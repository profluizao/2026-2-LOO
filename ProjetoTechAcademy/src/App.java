import java.util.ArrayList;

import Dominio.Colaborador;
import FakeDB.ColaboradorFakeDB;

public class App {
    public static void main(String[] args) throws Exception {
        ColaboradorFakeDB fdb = new ColaboradorFakeDB();
        for (Colaborador item : fdb.getDados()) {
            item.exibir();
        }
    }
}
