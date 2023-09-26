package humano;
import java.util.Scanner;
public class aula0004l1e1testarpessoa 
{
    public static void main(String[] args) 
    {
        Scanner leia = new Scanner(System.in);

        aula0004l1e1pessoa p1 = new aula0004l1e1pessoa();
        p1.nome = "Giovane";
        p1.idade = 24;
        p1.Nome();
        p1.Dizeridade();
        p1.Fazeraniversario();

    }
}
