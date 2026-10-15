package FakeDB;

import java.util.ArrayList;

import Dominio.AbsPessoa;

public abstract class AbsFakeDB {
    protected ArrayList<AbsPessoa> dados;

    public ArrayList<AbsPessoa> getDados(){
        return this.dados;
    }

    protected abstract void autoPreencher();
}
