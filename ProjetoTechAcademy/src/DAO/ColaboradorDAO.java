package DAO;

import Dominio.Colaborador;
import FakeDB.ColaboradorFakeDB;

public class ColaboradorDAO extends AbsGenericDAO<Colaborador>{

    @Override
    public Colaborador create(Colaborador novo) {
        int ultimoCodigo = this.repositorio.getLast().getCodigo();
        int proximoCodigo = ultimoCodigo + 1;
        novo.setCodigo(proximoCodigo);
        this.repositorio.add(novo);
        return novo;
    }

    @Override
    public Colaborador delete(Colaborador apagado) {
        int codigoProcurado = apagado.getCodigo();
        return this.deletePorID(codigoProcurado);
    }

    @Override
    public Colaborador readOne(int codigo) {
        for (Colaborador item : this.repositorio) {
            if (item.getCodigo() == codigo){
                return item;
            }
        }
        return null;
    }

    @Override
    public Colaborador update(Colaborador alterado) {
        int codigoProcurado = alterado.getCodigo();
        Colaborador original = this.readOne(codigoProcurado);
        if (original != null){
            int indice = this.repositorio.indexOf(original);
            this.repositorio.set(indice, alterado);
            return alterado;
        }
        return null;
    }
    
    public Colaborador deletePorID(int codigo){
        Colaborador original = this.readOne(codigo);
        if (original != null){
            this.repositorio.remove(original);
            return original;
        }
        return null;
    }


    public ColaboradorDAO(){
        this.repositorio = new ColaboradorFakeDB().getDados();
    }
}
