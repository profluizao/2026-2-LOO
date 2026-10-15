package DAO;

import java.util.ArrayList;

public abstract class AbsGenericDAO<T> {

    protected ArrayList<T> repositorio;

    public abstract T create(T novo);
    public ArrayList<T> readAll(){
        return this.repositorio;
    }
    public abstract T readOne(int codigo);
    public abstract T update(T alterado);
    public abstract T delete(T apagado);
}
