/*lista 1 exercicio 5. Uma loja está fazendo liquidação, vendendo tudo por 40% do preço original. 
Faça um programa em Java que calcule o valor do desconto, dado o preço original do produto.  */
import java.util.Scanner;
public class aula0002l1e5 
{
    public static void main(String[] args)
    {
        float preço;
        Scanner leia = new Scanner(System.in);    

        System.out.println("informe o preço do produto: ");
        preço = leia.nextFloat();

        System.out.println("o preço do produto com desconto ficou:" + preço * 0.6);
    }    
}
