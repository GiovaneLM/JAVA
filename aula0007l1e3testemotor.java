/*2. Crie uma classe Motor com o atributo potência (inteiro que
varia entre 1 e 100), implemente um construtor que receba
o parâmetro potência e verifique se o valor encontra-se
dentro dos limites estabelecidos (1 - 100). Caso o valor
extrapole o limite superior ou inferior o valor da potência
deve ser o valor do limite extrapolado */

package motor;
import java.util.Scanner;
public class aula0007l1e3testemotor 
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
        for (int i=0; i<100; i++){
            int potencia=(int)(Math.random()*1001);

        aula0007l1e3motor carro1 = new aula0007l1e3motor(potencia);
        }
        
    }
}