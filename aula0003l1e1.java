import java.util.Scanner;
public class aula0003
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
        int menu;
        float valor=0,prato;
        String resposta;
        boolean sair=true;
        while(sair)
        {

        
                System.out.println("1-feijoada por 25 reais");
                System.out.println("2-macarronada 15 reais");
                System.out.println("3-galinha caipira 30 reais");
                System.out.println("4-carne de sol");
                System.out.println("5-valor total a pagar");
                menu = leia.nextInt();
                leia.nextLine();

                switch (menu)
                {
                    case 1:
                        System.out.println("deseja comprar: s / n");
                        resposta=leia.nextLine();
                        if(resposta == "s")
                        {
                            prato = 25;
                            valor = valor + prato;
                            break;
                        }
                        break;
                    case 2:
                        System.out.println("deseja comprar: s / n: ");
                        leia.nextLine();
                        resposta=leia.nextLine();
                        if(resposta == "s")
                        {
                            prato = 15;
                            valor = valor + prato;
                            break;
                        }
                        break;
                    case 3:
                        
                        System.out.println("deseja comprar: s / n");
                        resposta=leia.nextLine();
                        if(resposta == "s")
                        {
                            prato = 30;
                            valor = valor + prato;
                            break;
                        }
                        break;
                    case 4:
                        System.out.println("deseja comprar: s / n");
                        resposta=leia.nextLine();
                        if(resposta == "s")
                        {
                            prato = 30;
                            valor = valor + prato;
                            break;
                        }
                        break;
                    case 5:
                        System.out.println("valor total a pagar é R$"+valor);
                        System.out.println("deseja pagar: s / n");
                        resposta=leia.nextLine();
                        if(resposta == "s")
                        {
                            System.out.println("obrigado pela compra");
                            sair=false;
                        }
                        break;
                }
        }
    }
}