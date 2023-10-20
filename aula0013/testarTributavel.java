package aula0013;

public class testarTributavel {
    public static void main(String[] args) {
        contaC c1 = new contaC(1000);
        c1.obterSaldo();
        System.out.println("contratado um seguro");
        seguroV s1 = new seguroV();
        System.out.println("valor do seguro" + s1.calcularTributos());
        c1.setSaldo(c1.getSaldo()-(c1.calcularTributos() + s1.calcularTributos()));
        System.out.println("novo saldo");
        c1.obterSaldo();

    }
}
