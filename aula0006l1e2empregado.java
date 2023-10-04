package empresinha;

public class empregado 
{
    private String nome;
    private String sobrenome;
    private double salario;

    public empregado(String nome,String sobrenome,double salario)
    {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
        System.out.println("funcionario cadastrado com sucesso");
    }

    public String getNome() 
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public String getSobrenome()
    {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome)
    {
        this.sobrenome = sobrenome;
    }
        public double getSalario()
    {
        return salario;
    }
    public void setSalario(double salario)
    {
        this.salario = salario;
    }

    public double anual()
    {
        return salario = salario * 12;
    }

    public void aumento()
    {
         salario = salario * 0.1;
    }
}
