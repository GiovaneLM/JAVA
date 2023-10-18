package aula0012;

public class imovel {
    private int cod;
    private float valor;
    private String endereco;
    private float areaT;
    private static int autocod = 20230001;


    
    public imovel(float valor, String endereco, float areaT) {
        this.cod = ++autocod;
        this.valor = valor;
        this.endereco = endereco;
        this.areaT = areaT;
        System.out.println("imovel cadastrado");

    }
    
    public void dados() {
        System.out.println("codigo:" + getCod());
        System.out.println("valor:" + getValor());
        System.out.println("endereço:" + getEndereco());
        System.out.println("area Total:" + getAreaT());
        
    }

    public float calculariptu(){
        return (getAreaT() * 10);
        
    }
/*METODO GET */
    public int getCod() {
        return cod;
    }
    public float getValor() {
        return valor;
    }
    public String getEndereco() {
        return endereco;
    }
    public float getAreaT() {
        return areaT;
    }

/*METODO SET */
    public void setValor(float valor) {
        this.valor = valor;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setAreaT(float areaT) {
        this.areaT = areaT;
    }
}
