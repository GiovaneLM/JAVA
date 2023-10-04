package empresa;
public class funcionario 
{
    public String nome;
    public String sobrenome;
    public int horasT;
    public float valorH;
    public float sal;
    public int horasIncre;
    /* METODOS */

    public String NomeCompleto()
    {
        return ("nome o funcionario " + nome + " " + sobrenome); 
    }

    public void calcuSal()
    {
        System.out.println("o salario mensal do funcionario é " + (sal = horasT * valorH));
    }

    public void incrementH()
    {
        horasT += horasIncre ; 
    }
}
