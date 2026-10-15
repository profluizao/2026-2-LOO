package Dominio;

public class Aluno extends AbsPessoa{
    private String matricula;
    private Double nota;

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public Double getNota() {
        return nota;
    }
    public void setNota(Double nota) {
        this.nota = nota;
    }

    @Override
    public void exibir(){
        System.out.println("[ALUNO] Código: " + this.codigo);
        System.out.print("Nome: " + this.nome);
        System.out.print(" | CPF: " + this.cpf);
        System.out.print("| Matrícula: " + this.matricula);
        System.out.println(" | Nota: " + this.nota);
    }
    
    public Aluno(){}

    public Aluno(int codigo, String nome, String cpf, String matricula){
        super(codigo, nome, cpf);
        this.matricula = matricula;
    }
}
