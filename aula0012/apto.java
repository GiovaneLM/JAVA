package aula0012;

public class apto extends imovel {
    private float areaPriv;

    public apto(float valor, String endereco, float areaT, float areaPriv) {
        super( valor, endereco, areaT);
        this.areaPriv = areaPriv;
        System.out.println("tipo Apartamento");
    }
@Override
    public void dados() {
        super.dados();
        System.out.println("area privativa:" + getAreaPriv());
        System.out.println("area Construida:" + calculariptu());
    }

    public float calculariptu() {
        return (getAreaPriv() * 10) +((areaT/24) + (areaPriv*5) - ((getAreaPriv() * 10) * 0.25f);
    }

    public float getAreaPriv() {
        return areaPriv;
    }
    public void setAreaPriv(float areaPriv) {
        this.areaPriv = areaPriv;
    }
}
