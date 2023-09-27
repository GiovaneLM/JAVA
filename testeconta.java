package banco;
import java.util.Scanner;
public class testeconta 
{
    public static void main(String[] args) 
    {
        Scanner leia = new Scanner(System.in);
        contaCorrente c1= new contaCorrente();
        boolean menu;
        int escolha;

        System.out.println("informe o numero da conta: ");
        c1.NumCon=leia.nextInt();

        while(menu=true)
        {
            System.out.println("ola " + c1.nome);

            System.out.println("o que voce gostaria de fazer \n1-visualizar saldo\n2-depositar \n3-sacar\n4-sair");
            escolha = leia.nextInt();

            switch(escolha)
            {
                case 1:
                case 2:
                case 3:
                case 4:
            }
        }

        
    }
}
