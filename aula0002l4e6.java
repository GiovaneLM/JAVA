/*lista 4 exercicio 6. Desenvolva um algoritmo que leia dois numero 
inteiros e deixe-os em ordem crescente. */
import java.util.Scanner;
public class aula0002l4e6 
{
    public static void main(String[]args)
    {
        Scanner leia = new Scanner(System.in);
        int num1,num2;

        System.out.println("informe um numero: ");
        num1 = leia.nextInt();

        System.out.println("informe um numero: ");
        num2 = leia.nextInt();

        if(num1>num2)
        {
            System.out.println(+ num2 +" "+ num1);
        }
        else
        {
            System.out.println(+ num1 +" "+ num2);
        }
    }
}
