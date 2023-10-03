package cliente;
import java.util.Scanner;
public class testcliente 
{
    public static void main(String[] args) 
    {
        Scanner leia = new Scanner(System.in);
        cliente c = new cliente();
        String nome,endereco;
        float renda;

        System.out.println("informe o nome: ");
        nome = leia.nextLine();
        c.setNome(nome);

        System.out.println("informe o endereço: ");
        endereco = leia.nextLine();
        c.setEndereco(endereco);

        System.out.println("informe a renda: ");
        renda = leia.nextFloat();
        c.setRenda(renda);

        System.out.println("Nome Informado " + c.getNome());
        System.out.println("Endereço Informado " + c.getEndereco());
        System.out.println("Renda Informada " + c.getRenda());
    }
}
