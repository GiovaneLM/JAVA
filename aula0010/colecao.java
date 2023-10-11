package aula0010;
import java.util.Scanner;
import java.util.ArrayList;
public class colecao 
{
    public static void main(String[] args) 
    {
        int choice,idade;
        String nome,endereco;
        double salario,nota1,nota2,nota3;
        Scanner leia = new Scanner(System.in);
        ArrayList<professor> cadastroP = new ArrayList();
        ArrayList<aluno> cadastroA = new ArrayList();

        do/*faça algo */
        {
            System.out.println("1-Cadastrar Professor\n2-Cadastrar Aluno\n3-Exibir Professor\n4-Exibir Aluno\n5-Editar Professor\n6-Excluir Professor\n7\n8\n0-Sair");
                choice = leia.nextInt();

                switch(choice)/*menu */
                {
                    case 1:
                        System.out.println("Cadastro Professor");
                        leia.nextLine();
                        System.out.println("informe o nome:");
                        nome =leia.nextLine();
                        System.out.println("informe o endereco:");
                        endereco = leia.nextLine();
                        System.out.println("informe o idade:");
                        idade = leia.nextInt();
                        System.out.println("informe o salario:");
                        salario = leia.nextDouble();
                        professor p1 = new professor(nome, endereco, idade, salario);
                        cadastroP.add(p1);
                        break;
                    case 2:
                        System.out.println("Cadastro Aluno");
                        leia.nextLine();
                        System.out.println("informe o nome:");
                        nome =leia.nextLine();
                        System.out.println("informe o endereco:");
                        endereco = leia.nextLine();
                        System.out.println("informe o idade:");
                        idade = leia.nextInt();
                        System.out.println("informe o nota1:");
                        nota1 = leia.nextDouble();
                        System.out.println("informe o nota2:");
                        nota2 = leia.nextDouble();
                        System.out.println("informe o nota3:");
                        nota3 = leia.nextDouble();
                        aluno a1 = new aluno(nome, endereco, idade, nota1, nota2, nota3);
                        cadastroA.add(a1);
                        break;
                    case 3:
                        System.out.println("Exibir Professor");
                        if(cadastroP.isEmpty())
                        {
                            System.out.println("nenhum cadastro");
                        }else
                        {
                            for(professor p:cadastroP)
                            {
                                p.dados();
                            }
                        }
                            break;
                    case 4:
                        System.out.println("Exibir Aluno");
                        if(cadastroA.isEmpty())
                        {
                            System.out.println("nenhum cadastro");
                        }else
                        {
                            for(aluno a:cadastroA)
                            {
                                a.dados();
                            }
                        }
                        break;
                    case 5:
                        System.out.println("Editar Professor");
                        System.out.println("informe o nome do professor");
                        leia.nextLine();
                        nome = leia.nextLine();
                        if(cadastroP.isEmpty())
                        {
                            System.out.println("nenhum cadastro");
                        }else
                        {
                            for(professor p:cadastroP)
                            {
                                if(p.getnome().equals(nome))
                                {
                                    System.out.println("informe o novo nome do professor");
                                    leia.nextLine();
                                    nome = leia.nextLine();
                                    p.setnome(nome);
                                    System.out.println("nome alterado");
                                    break;/*para parar o for assim que achar o nome */
                                }
                            }
                        }
                        break;
                    case 6:
                        System.out.println("Excluir Professor");
                        System.out.println("informe o nome do professor");
                        leia.nextLine();
                        nome = leia.nextLine();
                        if(cadastroP.isEmpty())
                        {
                            System.out.println("nenhum cadastro");
                        }else
                        {
                            for(professor p:cadastroP)
                            {
                                if(p.getnome().equals(nome))
                                {
                                    cadastroP.remove(p)/*para apagar um cadastro especifico */;
                                    break;/*para parar o for assim que achar o nome */
                                }
                            }
                        }
                        break;
                    case 7:
                        System.out.println("Editar Professor");
                        System.out.println("informe o nome do professor");
                        leia.nextLine();
                        nome = leia.nextLine();
                        if(cadastroA.isEmpty())
                        {
                            System.out.println("nenhum cadastro");
                        }else
                        {
                            for(aluno a:cadastroA)
                            {
                                if(a.getnome().equals(nome))
                                {
                                    System.out.println("informe o novo nome do professor");
                                    leia.nextLine();
                                    nome = leia.nextLine();
                                    a.setnome(nome);
                                    System.out.println("nome alterado");
                                    break;/*para parar o for assim que achar o nome */
                                }
                            }
                        }
                        break;
                    case 8:
                        System.out.println("Excluir Aluno");
                        System.out.println("informe o nome do aluno");
                        leia.nextLine();
                        nome = leia.nextLine();
                        if(cadastroA.isEmpty())
                        {
                            System.out.println("nenhum cadastro");
                        }else
                        {
                            for(aluno a:cadastroA)
                            {
                                if(a.getnome().equals(nome))
                                {
                                    cadastroA.remove(a)/*para apagar um cadastro especifico */;
                                    break;/*para parar o for assim que achar o nome */
                                }
                            }
                        }
                        break;
                    case 0:
                        System.out.println("TCHAU!!!!");
                        break;
                    default:
                        System.out.println("opção invalida");
                        break;
                }
        }while(choice != 0);/*faça engo enquanto tal coisa nao acontecer  */
    }
}
