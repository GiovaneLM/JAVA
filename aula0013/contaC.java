package aula0013;

public class contaC extends conta{

    public contaC(double saldo) {
        super(saldo);
        System.out.println("tipo conta corrente");
    }
    public double calcularTributos() {
        return(getSaldo()*0.01);
    }
}
