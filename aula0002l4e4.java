/*lista 4 exercicio 4. Desenvolva um algoritmo que, 
dado um número inteiro, diga se este número é par ou ímpar. */
import java.util.Scanner;
public class aula0002l4e4 
{    
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
        int num,teste;

        System.out.println("informe um numero: ");
        num = leia.nextInt();

        teste = num % 2;
        if(teste == 0)
        {
            System.out.println("o numero informado e par");
        }
        else
        {
            System.out.println("o numero informado e impar");
        }
    }
}
