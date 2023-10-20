package aula0013;

public class conta {
    private double saldo;
    private double valor;

    public conta(double saldo) {
        this.saldo = saldo;
        System.out.println("conta criada");
    }

    public void sacar(double valor) {
        if(saldo >= valor){
            saldo = saldo - valor;
            System.out.println("p saque de R$" + valor +" foi realizado com sucesso.");
        }else{
            System.out.println("saldo insuficiente");
        }
    }

    public void depositar(double valor) {
        if(valor > -1){
            saldo = saldo + valor;
            System.out.println("p deposito de R$" + valor +" foi realizado com sucesso.");
        }
    }

    public void obterSaldo() {
        System.out.println("saldo atual: R$"+saldo);
    }



    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
