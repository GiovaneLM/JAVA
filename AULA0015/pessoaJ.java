package AULA0015;

public class pessoaJ extends pessoa implements aniversario{
    private String cnpj;

    public pessoaJ(String nome, int idade, String cnpj) {
        super(nome, idade);
        this.cnpj = cnpj;
        System.out.println("tipo juridica");
    }
    public pessoaJ(String nome, int idade) {
        super(nome, idade);
        System.out.println("tipo juridica");
    }
    public void dados() {
        super.dados();
        System.out.println("cnpj" + getCnpj());
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public void fazerAniversario() {
        setIdade(getIdade()+1);
    }
    public void fazerAniversario(int ani) {
        setIdade(getIdade()+ani);
    }
}

