package aula0010;

public class professor extends pessoa
{
    private double salario;




    
    /*CONSTRUCTOR */
    public professor(String nome,String endereco,int idade,double salario)
    {
        super(nome, endereco, idade);
        this.salario = salario;
        System.out.println("tipo professor");
    }

    public void dados() 
    {
        super.dados();
        System.out.println("salario: " + salario);
    }

    /*METODO SET */

    public void setsalario(float salario) 
    {
        this.salario = salario;
    }

    /*METODO GET */
    public double getsalario() 
    {
        return salario;
    }
}
