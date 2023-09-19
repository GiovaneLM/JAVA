/*lista 1 exercicio 3. Calcular e mostrar o valor da área de um retângulo dado o valor dos dois lados.
A área do retângulo é calculada pela fórmula 
areaRetangulo = lado1 * lado2 */
import java.util.Scanner;
public class aula0002l1e3 
{
    public static void main(String[]args) 
    {
        int area,lado1,lado2;
        Scanner leia = new Scanner(System.in);

        System.out.println("informe o tamanho de um lado do retangulo:" );
        lado1 = leia.nextInt();

        System.out.println("informe o tamanho de outro lado do retangulo:" );
        lado2 = leia.nextInt();

        area = lado1 * lado2;
        System.out.println("area do retangulo e igual a " + area);
    }
}
