import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Mecanico> listaMecanico = new ArrayList<>();
        ArrayList<Cliente> listaCliente = new ArrayList<>();
        ArrayList<Maquina> listaMaquina = new ArrayList<>();
        int menu, idMec, idCliente, idMaquina;
        String nome, telefone, rua, marca, tipo;
        double salario, valor;
        Mecanico mecanico;
        Cliente cliente;
        Maquina maquina;

        do {
            System.out.println("1 - Cadastrar Mecanico");
            System.out.println("2 - Cadastrar Cliente");
            System.out.println("3 - Cadastrar Maquina");
            System.out.println("4 - Listar Mecanico");
            System.out.println("5 - Listar Cliente");
            System.out.println("6 - Listar Maquina");
            System.out.println("7 - Excluir Mecanico");
            System.out.println("8 - Excluir Cliente");
            System.out.println("9 - Excluir Maquina");
            System.out.println("10 - Editar Mecanico");
            System.out.println("11 - Editar Cliente");
            System.out.println("12 - Editar Maquina");
            System.out.println("13 - Sair");
            System.out.print("Digite sua opção: ");
            menu = ler.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Nome: ");
                    ler.nextLine();
                    nome = ler.nextLine();
                    System.out.println("Telefone: ");
                    telefone = ler.nextLine();
                    System.out.println("Salário: ");
                    salario = ler.nextDouble();
                    mecanico = new Mecanico(nome, telefone, salario);
                    mecanico.cadastrar();
                    System.out.println("Mecânico cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println("Nome: ");
                    ler.nextLine();
                    nome = ler.nextLine();
                    System.out.println("Telefone: ");
                    telefone = ler.nextLine();
                    System.out.println("Rua: ");
                    rua = ler.nextLine();
                    cliente = new Cliente(nome, telefone, rua);
                    cliente.cadastrar();
                    System.out.println("Cliente cadastrado com sucesso!");
                    break;
                case 3:
                    System.out.println("Marca: ");
                    ler.nextLine();
                    marca = ler.nextLine();
                    System.out.println("Tipo: ");
                    tipo = ler.nextLine();
                    System.out.println("Valor: ");
                    valor = ler.nextDouble();
                    maquina = new Maquina(marca, tipo, valor);
                    maquina.cadastrar();
                    System.out.println("Máquina cadastrada com sucesso!");
                    break;
                case 4:
                    System.out.println("Lista de Mecânicos: ");
                    listaMecanico = Mecanico.getMecanico();
                    for (Mecanico m : listaMecanico) {
                        m.dados();
                    }
                    break;
                case 5:
                    System.out.println("Lista de Clientes: ");
                    listaCliente = Cliente.getCliente();
                    for (Cliente c : listaCliente) {
                        c.dados();
                    }
                    break;
                case 6:
                    System.out.println("Lista de Máquinas: ");
                    listaMaquina = Maquina.getMaquinas();
                    for (Maquina m : listaMaquina) {
                        m.dados();
                    }
                    break;
                case 7:
                    System.out.println("Lista de Mecânicos: ");
                    listaMecanico = Mecanico.getMecanico();
                    for (Mecanico m : listaMecanico) {
                        System.out.println(m.getId() + "  -  " + m.getNome());
                    }
                    System.out.print("Digite o ID do mecânico que será excluído: ");
                    idMec = ler.nextInt();
                    Mecanico.excluir(idMec);
                    System.out.println("Mecânico excluído com sucesso!");
                    break;
                case 8:
                    System.out.println("Lista de Clientes: ");
                    listaCliente = Cliente.getCliente();
                    for (Cliente c : listaCliente) {
                        System.out.println(c.getId() + "  -  " + c.getNome());
                    }
                    System.out.print("Digite o ID do cliente que será excluído: ");
                    idCliente = ler.nextInt();
                    Cliente.excluir(idCliente);
                    System.out.println("Cliente excluído com sucesso!");
                    break;
                case 9:
                    System.out.println("Lista de Máquinas: ");
                    listaMaquina = Maquina.getMaquinas();
                    for (Maquina m : listaMaquina) {
                        System.out.println(m.getId() + "  -  " + m.getMarca());
                    }
                    System.out.print("Digite o ID da máquina que será excluída: ");
                    idMaquina = ler.nextInt();
                    Maquina.excluir(idMaquina);
                    System.out.println("Máquina excluída com sucesso!");
                    break;
                case 10:
                    System.out.println("Lista de Mecânicos: ");
                    listaMecanico = Mecanico.getMecanico();
                    for (Mecanico m : listaMecanico) {
                        System.out.println(m.getId() + "  -  " + m.getNome());
                    }
                    System.out.print("Digite o ID do mecânico que será editado: ");
                    idMec = ler.nextInt();
                    System.out.println("Novo nome: ");
                    ler.nextLine();
                    nome = ler.nextLine();
                    System.out.println("Novo telefone: ");
                    telefone = ler.nextLine();
                    System.out.println("Novo salário: ");
                    salario = ler.nextDouble();
                    mecanico = new Mecanico(nome, telefone, salario);
                    mecanico.setId(idMec);
                    mecanico.editar();
                    System.out.println("Mecânico editado com sucesso!");
                    break;
                case 11:
                    System.out.println("Lista de Clientes: ");
                    listaCliente = Cliente.getCliente();
                    for (Cliente c : listaCliente) {
                        System.out.println(c.getId() + "  -  " + c.getNome());
                    }
                    System.out.print("Digite o ID do cliente que será editado: ");
                    idCliente = ler.nextInt();
                    System.out.println("Novo nome: ");
                    ler.nextLine();
                    nome = ler.nextLine();
                    System.out.println("Novo telefone: ");
                    telefone = ler.nextLine();
                    System.out.println("Nova rua: ");
                    rua = ler.nextLine();
                    cliente = new Cliente(nome, telefone, rua);
                    cliente.setId(idCliente);
                    cliente.editar();
                    System.out.println("Cliente editado com sucesso!");
                    break;
                case 12:
                    System.out.println("Lista de Máquinas: ");
                    listaMaquina = Maquina.getMaquinas();
                    for (Maquina m : listaMaquina) {
                        System.out.println(m.getId() + "  -  " + m.getMarca());
                    }
                    System.out.print("Digite o ID da máquina que será editada: ");
                    idMaquina = ler.nextInt();
                    System.out.println("Nova marca: ");
                    ler.nextLine();
                    marca = ler.nextLine();
                    System.out.println("Novo tipo: ");
                    tipo = ler.nextLine();
                    System.out.println("Novo valor: ");
                    valor = ler.nextDouble();
                    maquina = new Maquina(marca, tipo, valor);
                    maquina.setId(idMaquina);
                    maquina.editar();
                    System.out.println("Máquina editada com sucesso!");
                    break;
                case 13:
                    System.out.println("Encerrando o programa. Adeus!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (menu != 13);
    }
}
