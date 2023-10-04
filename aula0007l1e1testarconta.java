package contacliente;

public class testarconta 
{
    public static void main(String [] args)
    {
        ContaCorrente c1 = new ContaCorrente();
        System.out.println("Quantidade: " + ContaCorrente.getQtdContas());
        ContaCorrente c2 = new ContaCorrente(); 
        System.out.println("Quantidade: " + ContaCorrente.getQtdContas()); 
        ContaCorrente c3 = new ContaCorrente(); 
        System.out.println("Quantidade: " + ContaCorrente.getQtdContas());
    }
}