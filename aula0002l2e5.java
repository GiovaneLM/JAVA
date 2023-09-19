/*lista 2 exercicio 5. Escreva um programa que leia 4 números e exiba qual o menor deles.*/
import java.util.Scanner;
public class aula0002l2e5 
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
        int num1,num2,num3,num4;
        
        System.out.println(" digite um numero: ");
        num1=leia.nextInt();
        
        System.out.println(" digite um numero: ");
        num2=leia.nextInt();
        
        System.out.println(" digite um numero: ");
        num3=leia.nextInt();
        
        System.out.println(" digite um numero: ");
        num4=leia.nextInt();
        
        if((num1>num2)&&(num1>num3)&&(num1>num4))
        {
            System.out.println("o numero "+num1+" foi o maior numero digitado");
        }
        if((num2>num1)&&(num2>num3)&&(num2>num4))
        {
            System.out.println("o numero "+num2+" foi o maior numero digitado");
        }
        if((num3>num2)&&(num3>num1)&&(num3>num4))
        {
            System.out.println("o numero "+num3+" foi o maior numero digitado");
        }
        if((num4>num2)&&(num4>num3)&&(num4>num1))
        {
            System.out.println("o numero "+num4+" foi o maior numero digitado");
        }
    }
}
