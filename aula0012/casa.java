package aula0012;

public class casa extends imovel{
    private float areaConst;

    public casa(float valor, String endereco, float areaT, float areaConst) {
        super(valor, endereco, areaT);
        this.areaConst = areaConst;
        System.out.println("tipo casa:");
    }
@Override
    public void dados(){
        super.dados();
        System.out.println("area Construida:" + getAreaConst());
    }

    public float calculariptu() {
        return (getAreaConst() * 12) - ((getAreaConst() * 12) * 0.35f);
    }

    public float getAreaConst() {
        return areaConst;
    }
    public void setAreaConst(float areaConst) {
        this.areaConst = areaConst;
    }
    
}
