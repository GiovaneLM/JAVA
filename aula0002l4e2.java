/*lista 4 exercicio 2. Ler dois valores e imprimir a diferença do maior para o menor. */
import java.util.Scanner;
public class aula0002l4e2 
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
        int num1,num2,maior;

        System.out.println("digite um numero: ");
        num1 = leia.nextInt();

        System.out.println("digite outro numero: ");
        num2 = leia.nextInt();

        if(num1>num2)
        {
            maior = num1 - num2;
            System.out.println("o primeiro numero e maior que o segundo por uma diferença de " + maior);
        }
        else if(num1<num2)
        {
            maior = num2 - num1;
            System.out.println("o segundo numero e maior primeiro por uma diferença de " + maior);
        }
        else
        {
            System.out.println("ambos os numeros tem o mesmo valor");
        }
    }
}
