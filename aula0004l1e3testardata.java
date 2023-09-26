package datas;
import java.util.Scanner;
public class aula0004l1e3testardata 
{
    
    
    public static void main(String[] args) 
    {
        Scanner leia = new Scanner(System.in);
        int cont=0;
        
        while(cont<5)
        {
            aula0004l1e3data d1 = new aula0004l1e3data();

            System.out.println("digite o dia: ");
            d1.dia = leia.nextInt();
            System.out.println("digite o mes: ");
            d1.mes = leia.nextInt();
            System.out.println("digite o ano: ");
            d1.ano = leia.nextInt();

            d1.EscreverData();
            cont++;
        }
        System.out.println("meta de datas atingida");
        

    }
}
