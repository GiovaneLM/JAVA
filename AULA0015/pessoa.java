package AULA0015;

public abstract class pessoa {
    private String nome;
    private int idade;
    
    
    public pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        System.out.println("pessoa cadastrada");
    }
    public void dados(){
        System.out.println("nome:" + getNome());
        System.out.println("idade:" + getIdade());
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
