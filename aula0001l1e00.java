/*
sor mostrando como fazer perguntas e salvar as informaçoes nas variaveis especificos
 */
import java.util.Scanner;/*e tipo a biblioteca Util do portugosl */
public class aula0001e06
{
  public static void main(String[] args)
  {
    Scanner leia = new Scanner(System.in);/*criando o comando ler em portugues parar ler uma informaçao e salsar em algo */
    System.out.println("Bom dia!");/*println e para escrever algo em uma nova linha e tipo \n no portugol 
    sem o ln em print ele escreve na linha que estiver mesmo se ja tiver coisa la */
    
    System.out.println("Informe seu nome: ");
    String nome = leia.nextLine();/*salvar a informaçao na variavel nome*//*.nextLine para variaveis do tipo String */
    System.out.println("Nome digitado: " + nome);/*mostrar o que esta salvo na variavel especifica */
    
    System.out.println("Informe sua Idade: ");
    int idade = leia.nextInt();/*.nextInt e para variaveis do tipo int *//*nao esquecer de informar que tipo de variavel vai ser ex idade é int */
    System.out.println("Idade digitada: " + idade);
    
    System.out.println("informe seu salario:R$");/*.nextFloat e para variaveis do tipo float */
    float salario = leia.nextFloat();
    System.out.println("Salario Informado:R$" + salario);

    System.out.println("informe o porcentual de aumento de aumento de salario: ");
    float percentual = leia.nextFloat();

    System.out.println("Salario com aumento: " + ((salario * percentual / 100) + salario));

  }
}
