import java.io.IOException;
import java.util.Scanner;
public class aula0003l1e2 
{
    public static void main(String[] args) throws IOException
    {
        Scanner leia = new Scanner(System.in);
        float valor,valorF=0,desconto;
        String escolha;
        char resposta;
        boolean menu=true;

        while(menu)
        {
            System.out.println("informe o valor do produto: ");
            valor = leia.nextFloat();

            System.out.println("qual a etiqueta do produto \nAzul\nVerde\nAmarelo\nVermelho\nLaranja\npagar: ");
            leia.nextLine();
            escolha = leia.nextLine();

            switch(escolha)
            {
                case "Azul":
                    desconto = 0.9f;
                    valorF = valor * desconto;
                    break;
                case "Verde":
                    desconto = 0.8f;
                    valorF = valor * desconto;
                    break;
                case "Amarelo":
                    desconto = 0.7f;
                    valorF = valor * desconto;
                    break;
                case "Vermelho":
                    desconto = 0.6f;
                    valorF = valor * desconto;
                    break;
                case "Laranja":
                    desconto = 0.6f;
                    valorF = valor * desconto;
                    break;
                case "pagar":
                    System.out.println("o valor final da compra é: R$" + valorF);
                    System.out.println("deseja comprar mais alguma coisa: s/n");
                    resposta =(char) System.in.read();/* */
                    if(resposta =='n')
                    {
                        System.out.println("Obrigado pela preferencia!!!!");
                        menu=false;
                    }
                    break;
            }
        }
    }
}
