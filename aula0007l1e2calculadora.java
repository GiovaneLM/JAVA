/*1. Faça uma classe Calculadora que realize as 4 operações
matemáticas básicas (soma, divisão, multiplicação e
subtração) através de métodos estáticos, sobre dois valores
(double) passados como parâmetros e retorne o resultado.
Crie um programa que realize as 4 operações e imprima os
resultados obtidos. */
package calculadora;

public class aula0007l1e2calculadora 
{
    private static float valor1;
    private static float valor2;
    private static float div,multi,soma,sub;
    
    /*metodos */

    /*valor 1 */
    public void setvalor1(float valor1)
    {
        this.valor1 = valor1;
    }
    public static float getvalor1()
    {
        return valor1;
    }

    /*valor2 */
    public void setvalor2(float valor2)
    {
        this.valor1 = valor1;
    }
    public static float getvalor2()
    {
        return valor2;
    }

    /*divisao */
    
    
    public static float getdiv(float valor1,float valor2) 
    {
        return valor1/valor2;
    }

    /*multiplicaçao */

    public static float getmulti(float valor1,float valor2) 
    {
        return valor1*valor2;
    }

    /*adiçao */

    public static float getsoma(float valor1,float valor2) 
    {
        return valor1 + valor2;
    }

    /*subtraçao */
    public static float getsub(float valor1,float valor2) 
    {
        return valor1 - valor2;
    }

    
}