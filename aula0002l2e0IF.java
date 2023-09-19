/*vamos estudar os comandos s(IF...ELSE, SWITCH CASE) */
import java.util.Scanner;
public class aula0002l2e0IF 
{
    public static void main(String[]args) /*comando IF */
    {
        int idade,anoU,anoA=2023,x=5,y=4;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("informe o ano que nasceu: ");
        anoU = leia.nextInt();
        idade = anoA - anoU;
        System.out.println("voce possui " + idade +" anos");

        if(idade >= 18)/*e que nem o SE em portugol */
        {
            System.out.println("voce e maior de idade " + (idade >= 18));/*o (idade>=18)no final e um teste logico que vai dizer se e verdade ou falso*/
        }


        if(x==5)
        {
            System.out.println("x é 5");
        }
        else
        {
            System.out.println("x é menor");
        }


        if((x==5) && /*<== e que tem o E no portugol ou seja tem que ser uma coisa e a outro ou mesmo tempo*/(y==5))
        {
            System.out.println("x e y sao 5");
        }
        else/*e que nem o SENAO em portugol e da para fazer um ELSE IF que seria um SENAO SE */
        {
            System.out.println("x ou y nao sao 5");
        } 

        
    }    
}
