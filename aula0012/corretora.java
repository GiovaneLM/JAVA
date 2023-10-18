package aula0012;
import java.util.Scanner;
import java.util.ArrayList;
public class corretora {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        ArrayList<imovel> cadastroI = new ArrayList();
        String escolha,endereco,tipo;
        float valor,areaT,areaConst,areaPriv;

        do{
            System.out.println("casa-Cadastrar Casa\napto-Cadastrar Apartamento\nterreno-Cadastrar Terreno\nimovel-Listar Imoveis\nsair-Sair");
            escolha = leia.nextLine();
            switch(escolha){
                case "casa":
                    System.out.println("Cadastro Casa");
                    leia.nextLine();
                    System.out.println("informe o endereço:");
                    endereco =leia.nextLine();
                    System.out.println("informe o valor:");
                    valor = leia.nextFloat();
                    System.out.println("informe o Area Total:");
                    areaT = leia.nextFloat();
                    System.out.println("informe o Srea Construida:");
                    areaConst = leia.nextFloat();
                    casa c1 = new casa(valor, endereco, areaT, areaConst);
                    cadastroI.add(c1);
                    break;
                case "apto":
                    System.out.println("Cadastro Apartamento");
                    leia.nextLine();
                    System.out.println("informe o endereço:");
                    endereco =leia.nextLine();
                    System.out.println("informe o valor:");
                    valor = leia.nextFloat();
                    System.out.println("informe o Area Total:");
                    areaT = leia.nextFloat();
                    System.out.println("informe o Area Privativa:");
                    areaPriv = leia.nextFloat();
                    apto a1 = new apto(valor, endereco, areaT, areaPriv);
                    cadastroI.add(a1);
                    break;
                case "terreno":
                    System.out.println("Cadastro terreno");
                    leia.nextLine();
                    System.out.println("informe o endereço:");
                    endereco =leia.nextLine();
                    System.out.println("informe o tipo:");
                    tipo = leia.nextLine();
                    System.out.println("informe o valor:");
                    valor = leia.nextFloat();
                    System.out.println("informe a Area Total:");
                    areaT = leia.nextFloat();
                    terreno t1 = new terreno(valor, endereco, areaT, tipo);
                    cadastroI.add(t1);
                    break;
                case "imovel":
                    System.out.println("Exibir Imoveis");
                    if(cadastroI.isEmpty())
                    {
                        System.out.println("nenhum cadastro");
                    }else
                    {
                        for(imovel i:cadastroI)
                        {
                            i.dados();
                        }
                    }
                    break;
                case "sair":
                    System.out.println("TCHAU!!!!");
                    break;
                default:
                    System.out.println("opção invalida");
                    break;
            }
        }while(!escolha.equals("sair"));
    }
}
