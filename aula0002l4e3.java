/*lista 4 exercicio 3. Desenvolva um algoritmo que leia 3 notas (de 0 a 100), 
calcule a média aritmética e informe se o aluno passou. A média de aprovação é 70. */
import java.util.Scanner;
class aula0002l4e3 
{
    public static void main(String[]args)
    {
        Scanner leia = new Scanner(System.in);
        int nota1,nota2,nota3,media;

        System.out.println("informe a priemira nota: ");
        nota1 = leia.nextInt();
        System.out.println("informe a segunda nota: ");
        nota2 = leia.nextInt();
        System.out.println("informe a terceira nota: ");
        nota3 = leia.nextInt();

        media = (nota1 + nota2 + nota3) / 3;

        if(media>=70)
        {
            System.out.println("Parabens voce passou com a media de " + media);
        }
        else
        {
            System.out.println("voce reprovou devido a media ser a abaixo de 70 sua nota e : " + media);
        }
    }     
}
