package Dominio;

public abstract class AbsIdentificador {
    protected int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public AbsIdentificador(){}

    public AbsIdentificador(int codigo){
        this.codigo = codigo;
    }
}
