/*lista 4 exercicio 5. Ler 2 números inteiros. 
Se o segundo for diferente de zero,
calcular e imprimir o quociente do primeiro pelo segundo. 
Caso contrário,imprimir a mensagem: "DIVISÃO POR ZERO".*/
import java.util.Scanner;
public class aula0002l4e5 
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
        int num1,num2,div;

        System.out.println("informe um numero: ");
        num1 = leia.nextInt();

        System.out.println("informe um numero: ");
        num2 = leia.nextInt();

        if(num2!=0)
        {
            div = num1 / num2;
            System.out.println("o quociente da divisao é :" + div);
        }
        else
        {
            System.out.println("DIVISÃO POR ZERO");
        }
    }
}
