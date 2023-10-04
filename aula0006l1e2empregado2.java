package empresinha;

public class empregado2 
{
    private String nome;
    private String sobrenome;
    private double salario;

    public empregado2(String nome,String sobrenome,double salario)
    {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
        System.out.println("funcionario cadastrado com sucesso");
    }

    public void dados()
    {
        System.out.println("*******************************************");
        System.out.println("nome " + getNome());
        System.out.println("sobrenome " + getSobrenome());
        System.out.println("salario " + getSalario());
        System.out.println("*******************************************");
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
    public double salarioAnual()
    {
        return (getSalario() * 12);
    }
    public void aumento(double aum)
    {
        setSalario(getSalario() + (getSalario()*aum)/100);
        System.out.println("aumento de " + aum + "aplicado ao salario");
    }
}
