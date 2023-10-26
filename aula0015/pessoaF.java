package aula0015;


public class pessoaF extends pessoa implements aniversario{
    private String cpf;

    public pessoaF(String nome, int idade, String cpf) {
        super(nome, idade);
        this.cpf = cpf;
        System.out.println("tipo fisica");
    }
    public pessoaF(String nome, int idade) {
        super(nome, idade);
        System.out.println("tipo fisica");
    }
    public void dados() {
        super.dados();
        System.out.println("cpf" + getCpf());
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void fazerAniversario() {
        setIdade(getIdade()+1);
    }
    public void fazerAniversario(int ani) {
        setIdade(getIdade()+ani);
    }
}