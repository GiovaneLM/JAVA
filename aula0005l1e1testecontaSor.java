package banco;

public class testecontaSor 
{
    public static void main(String[] args) 
    {
        ContaCorrenteSor conta1 = new ContaCorrenteSor();
        conta1.definirSaldoInicial(1000);
        System.out.println("SAldo Atual: R$ " + conta1.saldo);
        
        if(conta1.sacar(500)) System.out.println("Saque realizado com sucesso!");
        else System.out.println("Saldo insuficiente para o saque desejado!");
        
        conta1.depositar(50);
        System.out.println("Novo saldo Atual: R$ " + conta1.saldo);
        
        if(conta1.sacar(600)) System.out.println("Saque realizado com sucesso!");
        else System.out.println("Saldo insuficiente para o saque desejado!");
        
        System.out.println("Ultimo saldo Atual: R$ " + conta1.saldo);


    }
}
