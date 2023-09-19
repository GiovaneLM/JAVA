/*lista 2 exercicio 3. Escreva um programa para ler o nome de dois times de futebol e o número de 
gols marcados por cada time na partida.
O programa deve imprimir o nome do time vencedor. 
Caso não haja vencedor deverá ser impresso EMPATE*/
import java.util.Scanner;
public class aula0002l2e3 
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
        String time1,time2;
        int gol1,gol2;

        System.out.println("nome do primeiro time: ");
        time1 = leia.nextLine();
        System.out.println("nome do segundo time: ");
        time2 = leia.nextLine();
        
        System.out.println("quantos gols o time " + time1 + " fez: ");
        gol1 = leia.nextInt();
        System.out.println("quantos gols o time " + time2 + " fez: ");
        gol2 = leia.nextInt();

        if(gol1 > gol2)
        {
            System.out.println("o time " + time1 + " ganhou");
        }
        else if(gol1 < gol2)
        {
            System.out.println("o time " + time2 + " ganhou");
        }
        else
        {
            System.out.println("EMPATE");
        }
    }
}
