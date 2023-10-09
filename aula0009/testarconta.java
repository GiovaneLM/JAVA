package aula0009;
import java.util.Scanner;
public class testarconta 
{
    public static void main(String[] args) 
    {
        Scanner leia = new Scanner(System.in);

        contaEspecial e1 = new contaEspecial("giovane", 1111, 1500, 1500);
        e1.dados();
        e1.depositar(500);
        e1.dados();
        e1.sacar(1500);
        e1.dados();

        contaPoupanca p1 = new contaPoupanca("Rarael", 1110, 1500, 10);
        p1.dados();
        p1.depositar(500);
        p1.dados();
        p1.sacar(500);
        p1.dados();
    }
}
