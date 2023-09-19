/*lista 1 exercicio 1. Calcular e mostrar a metade de um número.*/
import java.util.Scanner;
public class aula0002l1e1 
{
    /*int numero,resultado;*//*variavel em estado global se for posta aqui */
    public static void main(String[]args)
    {
        float numero,resultado;/*assim como no portugol t pode crar as variaveis em uma linha e informar quais sao no inicio */

        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe um numero: ");
        numero = input.nextFloat();/*.nextInt e para variaveis do tipo int *//*nao esquecer de informar que tipo de variavel vai ser ex idade é int */
        resultado = numero / 2;/*isso faz o numero salvo na variavel ser enviado para outra variavel e dividida por 2 ao mesmo tempo */
        System.out.println("a metade do numero informado é: " + resultado);

    }
}