package aula0015;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
public class cadastro {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<pessoa> listap = new ArrayList<>();
        int escolha,idade;
        String nome,cpf,cnpj;
        boolean erro;
        do{
            System.out.println("1) Cadastrar Pessoa\n2) Buscar Pessoa\n3) Incrementar Idade\n4) Excluir Pessoa\n5) Listar Pessoa\n6) Listar Pessoas de Idade (X)\n7) Sair");
            escolha = leia.nextInt();
            switch(escolha){
                case 1:
                            System.out.println("1)pessoa fisica 2)pessoa juridica");
                            escolha= leia.nextInt();
                            if(escolha == 1){
                                do{
                                    erro=false;
                                    try{
                                        System.out.println("Cadastro nome");
                                        leia.nextLine();
                                        nome = leia.nextLine();
                                        System.out.println("informe o idade:");
                                        idade =leia.nextInt();
                                        leia.nextLine();
                                        System.out.println("deseja cadastrar o cpf: 1)sim 2)nao");
                                        escolha=leia.nextInt();
                                        if(escolha ==1){
                                            System.out.println("informe o cpf:");
                                            leia.nextLine();
                                            cpf = leia.nextLine();
                                            pessoaF p2 = new pessoaF(nome, idade,cpf);
                                            listap.add(p2);
                                        }else{
                                            pessoaF p1 = new pessoaF(nome, idade);
                                            listap.add(p1);
                                        }
                                    }catch(java.util.InputMismatchException ime){
                                        erro = true;
                                        System.out.println("erro leitura incorreta");
                                    }
                                }while(erro==true);
                            }else{
                                do{
                                    erro=false;
                                    try{
                                        System.out.println("Cadastro nome");
                                        leia.nextLine();
                                        nome = leia.nextLine();
                                        System.out.println("informe o idade:");
                                        idade =leia.nextInt();
                                        leia.nextLine();
                                        System.out.println("deseja cadastrar cnpj: 1)sim 2)nao");
                                        escolha=leia.nextInt();
                                        if(escolha ==1){
                                            System.out.println("informe o cnpj:");
                                            leia.nextLine();
                                            cnpj = leia.nextLine();
                                            pessoaJ p2 = new pessoaJ(nome, idade, cnpj);
                                            listap.add(p2);
                                        }else{
                                            pessoaJ p1 = new pessoaJ(nome, idade);
                                            listap.add(p1);
                                        }
                                        break;
                                    }catch(java.util.InputMismatchException ime){
                                        erro = true;
                                        System.out.println("erro leitura incorreta");
                                    }
                                }while(erro==true);
                            }
                    break;
                case 2:
                    if(listap.isEmpty()){
                        System.out.println("nenhum cadastro");
                    }else{
                        System.out.println("informe o nome");
                        leia.nextLine();
                        nome = leia.nextLine();
                        for (pessoa i : listap) {
                            if(i.getNome().equals(nome)){
                                System.out.println("nome encontrado");
                                i.dados();
                            }else{
                                System.out.println("nenhum cadastro");
                            }
                        }
                    }
                    break;
                case 3:
                    if(listap.isEmpty()){
                        System.out.println("nenhum cadastro");
                    }else{
                        System.out.println("informe o nome");
                        leia.nextLine();
                        nome = leia.nextLine();
                        for(int i = 0; i < listap.size(); i++){
                            if(listap.get(i).getNome().equals(nome)){
                                System.out.println("idade incrementada");
                                if(listap.get(i) instanceof pessoaF){
                                    ((pessoaF) listap.get(i)).fazerAniversario();
                                }else if(listap.get(i) instanceof pessoaJ){
                                    ((pessoaJ) listap.get(i)).fazerAniversario();
                                }
                            }
                        }
                    }
                    break;
                case 4:
                    if(listap.isEmpty()){
                        System.out.println("nenhum cadastro");
                    }else{
                        System.out.println("informe o nome");
                        leia.nextLine();
                        nome = leia.nextLine();
                        for(int i = 0; i < listap.size(); i++){
                            if(listap.get(i).getNome().equals(nome)){
                                listap.remove(i);
                            }
                        }
                    }
                    break;
                case 5:
                    if(listap.isEmpty()){
                        System.out.println("nenhum cadastro");
                    }else{
                        for(pessoa i:listap){
                            i.dados();
                        }
                    }
                    break;
                case 6:
                    if(listap.isEmpty()){
                            System.out.println("nenhum cadastro");
                        }else{
                            System.out.println("informe o idade ");
                            idade = leia.nextInt();
                            leia.nextLine();
                            for(pessoa i:listap){
                                if(i.getIdade() == idade){
                                    i.dados();
                                }
                            }
                        }
                        break;
                case 7:
                    System.out.println("TCHAU!!!!");
                    break;
                default:
                    System.out.println("opção invalida");
                    break;
            }
        }while(escolha != 7);
    }
}
