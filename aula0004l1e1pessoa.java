package humano;
import java.util.Scanner;
public class aula0004l1e1pessoa 
{
    public String nome;
    public int idade;


    public void Nome()
    {
        System.out.println("Ola meu nome é " + nome);
    }

    public void Dizeridade()
    {
        System.out.println("Ola tenho " + idade + " anos");
    }

    public void Fazeraniversario()
    {
        idade += 1;
        System.out.println("Ola tenho " + idade + " anos");
    }
}
