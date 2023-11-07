package projeto;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Maquina {
    private String marca;
    private String tipo;
    private double valor;
    private int id;  // para identificação no banco de dados (pode ser importante)

    public Maquina(String marca, String tipo, double valor) {
        this.marca = marca;
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void cadastrar() {
        String sql = "INSERT INTO maquina (marca, tipo, valor) VALUES ("
                   + " '" + this.marca + "' ,  "
                   + " '" + this.tipo + "' ,  "
                   + " " + this.valor + " ) ";
        Conexao.executar(sql);
    }

    public void editar() {
        String sql = "UPDATE maquina SET  "
                   + " marca    = '" + this.marca + "' ,  "
                   + " tipo   = '" + this.tipo + "' ,  "
                   + " valor = " + this.valor + " "
                   + " WHERE idMaquina = " + this.id;
        Conexao.executar(sql);
    }

    public static void excluir(int idMaquina) {
        String sql = "DELETE FROM maquina WHERE idMaquina = " + idMaquina;
        Conexao.executar(sql);
    }

    public static ArrayList<Maquina> getMaquinas() {
        ArrayList<Maquina> lista = new ArrayList<>();

        String sql = "SELECT idMaquina, marca, tipo, valor FROM maquina ORDER BY marca";

        ResultSet rs = Conexao.consultar(sql);

        if (rs != null) {
            try {
                while (rs.next()) {
                    String marca = rs.getString(2);
                    String tipo = rs.getString(3);
                    double valor = rs.getDouble(4);
                    Maquina maquina = new Maquina(marca, tipo, valor);
                    maquina.setId(rs.getInt(1));
                    lista.add(maquina);
                }
            } catch (Exception e) {
                // Trate exceções aqui, se necessário.
            }
        }

        return lista;
    }

    public void dados() {
        System.out.println("ID: " + id);
        System.out.println("Marca: " + marca);
        System.out.println("Tipo: " + tipo);
        System.out.println("Valor: " + valor);
        System.out.println("#########################");
    }
}