package empresa;
import java.util.Scanner;
public class testefuncionario 
{
    
    public static void main(String[] args) 
    {
        funcionario fun1 = new funcionario();
        Scanner leia = new Scanner(System.in);

        System.out.println("digite o nome:");
        fun1.nome = leia.nextLine();
        System.out.println("digite o sobrenome:");
        fun1.sobrenome = leia.nextLine();

        System.out.println(fun1.NomeCompleto());

        System.out.println("informe as horas que o funcionario trabalhou");
        fun1.horasT = leia.nextInt();
        System.out.println("informe qual o valor da hora trabalhada do funcionario");
        fun1.valorH = leia.nextFloat();

        fun1.calcuSal();

        System.out.println("o valor de horar trabalhadas atual e de: R$"+ fun1.valorH);

        System.out.println("quantas horas deseja acrecentar ");
        fun1.horasIncre = leia.nextInt();

        fun1.incrementH();
        fun1.calcuSal();
    }
}
