/*lista 1 exercicio 4. Calcular e mostrar o valor do perímetro de um retângulo dado o valor dos dois lados. 
O perímetro do retângulo é calculado pela fórmula 
perimetroRetangulo = 2*lado1 + 2*lado2  */
import java.util.Scanner;
public class aula0002l1e4 
{
    public static void main(String[] args) 
    {
        int perimetro,lado1,lado2;
        Scanner leia = new Scanner(System.in);

        System.out.println("informe o lado1 do retangulo: ");
        lado1 = leia.nextInt();

        System.out.println("informe o lado2 do retangulo: ");
        lado2 = leia.nextInt();

        perimetro = 2*lado1 + 2*lado2;

        System.out.println("o perimetro do retangulo é " + perimetro);
    }
}
