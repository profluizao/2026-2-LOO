package Servico;

import java.util.ArrayList;

import DAO.*;

public abstract class AbsGenericServ<T> {

    protected AbsGenericDAO<T> dao;

    public abstract ArrayList<T> listar();
    public abstract T buscar(int codigo);
    public abstract T editar(T alterado);
    public abstract T adicionar(T novo);
    public abstract T excluir(T apagado);
}
