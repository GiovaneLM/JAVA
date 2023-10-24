package aula0014;
import java.util.Scanner;
import java.util.ArrayList;
public class testapessoa 
{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList <pessoa> listap = new ArrayList<>();
        int rg,cpf;
        String nome;
        
        do{
            erro = false;
            try{
                System.out.println("digite seu nome");
                nome=leia.nextLine();
                System.out.println("digite seu rg");
                rg=leia.nextInt();
                System.out.println("digite seu cpf");
                cpf=leia.nextInt();
                pessoa p1 = new pessoa(0, 0, null);
                listap.add(p1);
            }
            catch()
        }while(cont < 5);

    }
}
