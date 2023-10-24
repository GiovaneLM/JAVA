package aula0014;

public class multicatch {
    public static void main(String[] args) {
        int[] numero = {4,8,16,32,64,128};
        int[] denom = {2,0,4,8,0};

        for(int i=0;i<numero.length;i++){
            try{
                System.out.println(numero[i] + "/" + denom[i] + "=" + numero[i]/denom[i]);
            }
            catch(ArithmeticException exc){
                System.out.println("erro ao dividir por zero");
            }
            catch(Throwable exc){
                System.out.println("aconteceu um erro");
                System.out.println(exc);
            }
        }
        
    }
}
