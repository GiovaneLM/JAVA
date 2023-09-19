/*lista 2 exercicio 4. Escreva um programa que leia um número entre 1 e 12 e escreva o mês correspondente.
Ex: Se o número lido for 2, deverá ser mostrado ao usuário “Fevereiro” */
import java.util.Scanner;
public class aula0002l2e4 
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
        int mes;

        System.out.println("digite o numero do mes: ");
        mes = leia.nextInt();

        if(mes == 1)
        {
            System.out.println("janeiro ");
        }
        if(mes == 2)
        {
            System.out.println("fevereiro ");
        }
        if(mes == 3)
        {
            System.out.println("março ");
        }
        if(mes == 4)
        {
            System.out.println("abril ");
        }
        if(mes == 5)
        {
            System.out.println("maio ");
        }
        if(mes == 6)
        {
            System.out.println("junho ");
        }
        if(mes == 7)
        {
            System.out.println("julho ");
        }
        if(mes == 8)
        {
            System.out.println("agosto ");
        }
        if(mes == 9)
        {
            System.out.println("setembro ");
        }
        if(mes == 10)
        {
            System.out.println("outubro ");
        }
        if(mes == 11)
        {
            System.out.println("novembro ");
        }
        if(mes == 12)
        {
            System.out.println("dezembro ");
        }
    }
}
