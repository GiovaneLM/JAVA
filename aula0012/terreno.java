package aula0012;

public class terreno extends imovel {
    private String tipo;

    public terreno(float valor, String endereco, float areaT, String tipo) {
        super( valor, endereco, areaT);
        this.tipo = tipo;
        System.out.println("tipo terreno");
    }
@Override
    public void dados(){
        super.dados();
        System.out.println("tipo:" + getTipo());
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
