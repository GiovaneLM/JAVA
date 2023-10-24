package aula0014;

public class pessoa {
    private int cpf;
    private int rg;
    private String nome;
    public pessoa(int cpf, int rg, String nome) {
        this.cpf = cpf;
        this.rg = rg;
        this.nome = nome;
        System.out.println("pessoa cadastrada");
    }
    public int getCpf() {
        return cpf;
    }
    public int getRg() {
        return rg;
    }
    public String getNome() {
        return nome;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public void setRg(int rg) {
        this.rg = rg;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
