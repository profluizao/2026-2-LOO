package Dominio;

public class Professor extends AbsPessoa {
    private Double salario;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double calcularBonificacao(){
        return (this.salario * 0.10);
    }

    @Override
    public void exibir() {
        System.out.println("Código: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Salário: " + this.salario);
        System.out.println("Bonificação: " + this.calcularBonificacao());
    }

    public Professor(){}

    public Professor(int codigo, String nome, String cpf, Double salario){
        super(codigo, nome, cpf);
        this.salario = salario;
    }
}
