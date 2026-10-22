package Servico;

import java.util.ArrayList;

import DAO.ColaboradorDAO;
import Dominio.Colaborador;

public class ColaboradorServ extends AbsGenericServ<Colaborador> {

    @Override
    public ArrayList<Colaborador> listar(){
        return this.dao.readAll();
    }

    @Override
    public Colaborador buscar(int codigo){
        return this.dao.readOne(codigo);
    }

    @Override
    public Colaborador editar(Colaborador alterado){
        return this.dao.update(alterado);
    }

    @Override
    public Colaborador adicionar(Colaborador novo){
        return this.dao.create(novo);
    }

    @Override
    public Colaborador excluir(Colaborador apagado){
        return this.dao.delete(apagado);
    }

    public ColaboradorServ(){
        this.dao = new ColaboradorDAO();
    }
}
