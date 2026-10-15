import Dominio.*;

import java.util.ArrayList;

import DAO.*;

public class App {
    public static void main(String[] args) throws Exception {
        ColaboradorDAO dao = new ColaboradorDAO();

        // ArrayList<Colaborador> colab = dao.readAll();
        // for(Colaborador item : colab){
        //     item.exibir();
        // }

        Colaborador colab01 = new Colaborador(0, "Lula", "95101", "Presidente");
        dao.create(colab01);
        colab01.exibir();

        // colab = dao.readAll();
        // for(Colaborador item : colab){
        //     item.exibir();
        // }
    }
}
