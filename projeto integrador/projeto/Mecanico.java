package projeto;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Mecanico extends Pessoa {
    private double salario;

    public Mecanico(String nome, String telefone, double salario) {
        super(nome, telefone);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void cadastrar() {
        String sql = "INSERT INTO mecanico (nome, telefone, salario) VALUES ('" + this.getNome() + "', '" + this.getTelefone() + "', " + this.getSalario() + " )";
        Conexao.executar(sql);
    }

    public void editar() {
        String sql = "UPDATE mecanico SET " + "nome = '" + this.getNome() + "', " + "telefone = '" + this.getTelefone() + "', " + "salario = " + this.getSalario() + " WHERE idMecanico = " + this.getId();
        Conexao.executar(sql);
    }

    public static void excluir(int idMecanico) {
        String sql = "DELETE FROM mecanico WHERE idMecanico = " + idMecanico;
        Conexao.executar(sql);
    }

    public static ArrayList<Mecanico> getMecanicos() {
        ArrayList<Mecanico> lista = new ArrayList<>();

        String sql = "SELECT idMecanico, nome, telefone, salario FROM mecanico ORDER BY nome";

        ResultSet rs = Conexao.consultar(sql);

        if (rs != null) {
            try {
                while (rs.next()) {
                    int id = rs.getInt("idMecanico");
                    String nome = rs.getString("nome");
                    String telefone = rs.getString("telefone");
                    double salario = rs.getDouble("salario");
                    Mecanico mec = new Mecanico(nome, telefone, salario);
                    mec.setId(id);
                    lista.add(mec);
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
        System.out.println("Salario: " + getSalario());
        System.out.println("#########################");
    }
}