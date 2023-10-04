/*2. Crie uma classe Motor com o atributo potência (inteiro que
varia entre 1 e 100), implemente um construtor que receba
o parâmetro potência e verifique se o valor encontra-se
dentro dos limites estabelecidos (1 - 100). Caso o valor
extrapole o limite superior ou inferior o valor da potência
deve ser o valor do limite extrapolado */

package motor;

public class aula0007l1e3motor 
{
    private int potencia;
    
    public aula0007l1e3motor(int potencia)
    {
        this.potencia = potencia;

        if((1<potencia)&&(potencia<100))
        {
            System.out.println("Motor criado com sucesso\nA potencia do motor é "+ potencia);
        } else if(potencia > 100)
        {
            potencia = 100;
            System.out.println("Motor criado com sucesso\nA potencia do motor é " + potencia);
        } else {
            potencia = 1;
            System.out.println("Motor criado com sucesso\nA potencia do motor é " + potencia);
        }
    }
}