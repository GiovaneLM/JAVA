/*lista 2 exercicio 1. Ler um número e determinar se ele é maior ou igual ou menor do que zero*/
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class aula0002l4e1 
{
    public static void main(String[]args) 
    {
        int valor1,valor2;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("digite o primeiro numero");
        valor1 = leia.nextInt();

        System.out.println("digite segundo numero");
        valor2 = leia.nextInt();

        if(valor1 > valor2)
        {
            System.out.println("o primeiro numero " + valor1 + " e maior");

        }
        else if(valor1 < valor2)
        {
            System.out.println("o segundo numero " + valor2 + " e maior");

        }
        else
        {
            System.out.println("ambos os numeros tem o mesmo valor que e: " + valor1);
        }

    }    
}
