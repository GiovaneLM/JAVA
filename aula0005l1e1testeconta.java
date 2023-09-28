package banco;
import java.util.Scanner;
public class testeconta 
{
    public static void main(String[] args) 
    {
        Scanner leia = new Scanner(System.in);
        contaCorrente c1= new contaCorrente();
        boolean menu = true;
        int escolha;
        float valor;
        System.out.println("informe o numero da conta: ");
        c1.NumCon=leia.nextInt();

        while(menu==true)
        {
            System.out.println("ola ");

            System.out.println("o que voce gostaria de fazer \n1-visualizar saldo\n2-depositar \n3-sacar\n4-sair");
            escolha = leia.nextInt();
            
            switch(escolha)
            {
                case 1:
                    System.out.println("saldo atual: R$"+ c1.saldo);
                    break;
                case 2:
                    System.out.println("quanto depositar: R$");
                    valor = leia.nextFloat();
                    c1.depositar(valor);
                    break;
                case 3:
                    System.out.println("quanto deseja sacar: R$");
                    valor = leia.nextFloat();
                    c1.sacar(valor);
                    break;
                case 4:
                    System.out.println("obrigado pela preferencia");
                    menu = false;
                    break;
            }
        }
    }
}
