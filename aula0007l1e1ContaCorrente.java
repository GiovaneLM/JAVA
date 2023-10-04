package contacliente;

public class ContaCorrente
{
    private float saldo;
    private cliente cliente;

    private static int qtdContas = 0;

    public ContaCorrente()
    {
        System.out.println("nova conta corrente criada");
        qtdContas++;
    }
    public static int getQtdContas()
    {
    return qtdContas;
    }
}