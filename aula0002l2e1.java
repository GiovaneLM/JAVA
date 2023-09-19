/*LISTA 2 EXERCICIO 1. Ler um número e determinar se ele é maior ou igual ou menor do que zero  */
import java.util.Scanner;
public class aula0002l2e1
{
    public static void main(String[] args)
    {
        int numero;
        Scanner input = new Scanner(System.in);

        System.out.println("digite um numero:");
        numero = input.nextInt();

        if(numero > 0)
        {
            System.out.println("o numero " + numero + " é maior que 0");
        }
        else if (numero < 0)
        {
            System.out.println("o numero " + numero + " é menor que 0");
        }
        else
        {
            System.out.println("o numero " + numero + " é igual a 0");
        }
    }
}