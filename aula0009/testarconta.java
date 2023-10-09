package aula0009;
import java.util.Scanner;
public class testarconta 
{
    public static void main(String[] args) 
    {
        Scanner leia = new Scanner(System.in);
        float valor;
        contaEspecial e1 = new contaEspecial("giovane", 1111, 1500, 1500);
        e1.dados();
        System.out.println("quanto deseja depositar");
        valor = leia.nextFloat();
        e1.depositar(valor);
        e1.dados();
        System.out.println("quanto deseja sacar");
        valor = leia.nextFloat();
        e1.sacar(valor);
        e1.dados();

        contaPoupanca p1 = new contaPoupanca("Rarael", 1110, 1500, 10);
        p1.dados();
        System.out.println("quanto deseja depositar");
        valor = leia.nextFloat();
        p1.depositar(valor);
        p1.dados();
        System.out.println("quanto deseja sacar");
        valor = leia.nextFloat();
        p1.sacar(valor);
        p1.dados();
    }
}
