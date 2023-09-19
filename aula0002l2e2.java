/*lista 2 exer 2. Faça um programa que leia o índice de massa corporal (IMC) de uma pessoa. Se o valor do IMC for
maior do que 25,0 deverá ser exibida a mensagem “Você está acima do peso!”. Caso contrário exiba
a mensagem “Você está saudável!”. */
import java.util.Scanner;
public class aula0002l2e2 
{
    public static void main(String[] args)
    {
        float altura,peso,IMC;
        Scanner leia = new Scanner(System.in);

        System.out.println("informe seu peso(Kg): ");
        peso = leia.nextFloat();

        System.out.println("informe sua altura(m): ");
        altura = leia.nextFloat();

        IMC = peso / (altura * altura);

        if(IMC > 25)
        {
            System.out.println("voce esta acima do peso");
        }
        else
        {
            System.out.println("voce esta saudavel");
        }
    }
}
