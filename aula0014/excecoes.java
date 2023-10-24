package aula0014;
import java.util.Scanner;
public class excecoes {
    public static int dividir(int numero,int numero2) {
        return numero/numero2;
    }
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n1,n2,r;
        boolean erro;
        
        do{
            erro=false;
            try{
            System.out.println("informe um numero inteiro:");
            n1 = leia.nextInt();
            System.out.println("informe um numero inteiro:");
            n2 = leia.nextInt();
            r = dividir(n1,n2);
            System.out.println("resultado da divisao " + r);
            }
            catch(java.lang.ArithmeticException ae){
                erro = true;
                System.out.println("erro : divisão por zero");
                //esse catch e para divizao de zero
            }
            catch(java.util.InputMismatchException ime){
                erro=true;
                System.out.println("erro: entrada de tipo invalido. informe inteiro");
                leia.nextLine();
                //esse catch e para caso a pessoa colocar qualquer coisa que nao seja um numero inteiro
            }
        }while(erro==true);

    }
}
