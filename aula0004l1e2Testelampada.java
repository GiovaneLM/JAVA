package lampada;
import java.util.Scanner;
public class aula0004l1e2Testelampada 
{
    Scanner leia = new Scanner(System.in);
    public static void main(String[] args)
    {
        aula0004l1e2lampada l1 = new aula0004l1e2lampada();
        
        l1.acender();
        l1.InfoSitu();
        l1.apagar();
        l1.InfoSitu();
        l1.potencia = 100;
        l1.InfoPoten();
    }
}
