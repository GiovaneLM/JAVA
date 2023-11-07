package projeto;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Cliente extends Pessoa {
    private String rua;

    public Cliente(String nome, String telefone, String rua) {
        super(nome, telefone);
        this.rua = rua;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void cadastrar() {
        String sql = "INSERT INTO cliente (nome, telefone, rua) VALUES ( " + "'" + this.getNome() + "', '" + this.getTelefone() + "', '" + this.getRua() + "' )";
        Conexao.executar(sql);
    }

    public void editar() {
        String sql = "UPDATE cliente SET " + "nome = '" + this.getNome() + "', " + "telefone = '" + this.getTelefone() + "', " + "rua = '" + this.getRua() + "' WHERE idCliente = " + this.getId();
        Conexao.executar(sql);
    }

    public static void excluir(int idCliente) {
        String sql = "DELETE FROM cliente WHERE idCliente = " + idCliente;
        Conexao.executar(sql);
    }

    public static ArrayList<Cliente> getClientes() {
        ArrayList<Cliente> lista = new ArrayList<>();

        String sql = "SELECT idCliente, nome, telefone, rua FROM cliente ORDER BY nome ";

        ResultSet rs = Conexao.consultar(sql);

        if (rs != null) {
            try {
                while (rs.next()) {
                    int id = rs.getInt("idCliente");
                    String nome = rs.getString("nome");
                    String telefone = rs.getString("telefone");
                    String rua = rs.getString("rua");
                    Cliente cliente = new Cliente(nome, telefone, rua);
                    cliente.setId(id);
                    lista.add(cliente);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return lista;
    }

    @Override
    public void dados() {
        super.dados();
        System.out.println("Rua: " + getRua());
        System.out.println("#########################");
    }
}