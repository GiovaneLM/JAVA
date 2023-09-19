/*leista 1 exercicio 2. Calcular a idade de uma pessoa, sabendo-se o ano de nascimento. */
import java.util.Scanner;
public class aula0002l1e2
{
    public static void main(String[]args)
    {
        int idade,anoU,anoA=2023;

        Scanner input = new Scanner(System.in);

        System.out.println("informe o ano que nasceu: ");
        anoU = input.nextInt();

        idade = anoA - anoU;

        System.out.println("voce possui " + idade +" anos");
    }
}