package aula0010;

public class pessoa 
{
    private String nome;
    private String endereco;
    private int idade;




    /*CONSTRUCTOR */
    public pessoa(String nome,String endereco,int idade)
    {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        System.out.println("pessoa cadastrada");
    }
    
    public void dados() 
    {
        System.out.println("\nnome: " + nome);
        System.out.println("endereco: " + endereco);
        System.out.println("idade: " + idade);
    }
    
    /*METODO SET */
    public void setnome(String nome) 
    {
        this.nome = nome;
    }
    public void setenderoco(String endereco) 
    {
        this.endereco = endereco;
    }
    public void setidade(int idade) 
    {
        this.idade = idade;
    }

    /*METODO GET */

    public String getnome() 
    {
        return nome;
    }
    public String getendereco() 
    {
        return endereco;
    }
    public int getidade() 
    {
        return idade;
    }
}
