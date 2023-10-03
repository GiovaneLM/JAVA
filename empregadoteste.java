package empresinha;
import java.util.Scanner;
public class empregadoteste 
{
    public static void main(String[] args) 
    {
        Scanner leia = new Scanner(System.in);
        empregado2 e1 = new empregado2("flavia","treib",5000);
        e1.dados();
        System.out.println("salario anual : " + e1.salarioAnual());
        System.out.println("digite o aumento");
        double aum =leia.nextDouble();
        e1.aumento(aum);
        e1.dados();
        System.out.println("novo salrio anual: " + e1.salarioAnual());
    }
}
