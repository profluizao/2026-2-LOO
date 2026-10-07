package Dominio;

public abstract class AbsPessoa extends AbsIdentificador {
    protected String nome;
    protected String cpf;

    public String getNome(){
        return this.nome;
    }

    public void setNome(String valor){
        this.nome = valor;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public abstract void exibir();

    public AbsPessoa(){}

    public AbsPessoa(int codigo, String nome, String cpf){
        super(codigo);
        this.nome = nome;
        this.cpf = cpf;
    }
}