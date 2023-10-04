/*1. Faça uma classe Calculadora que realize as 4 operações
matemáticas básicas (soma, divisão, multiplicação e
subtração) através de métodos estáticos, sobre dois valores
(double) passados como parâmetros e retorne o resultado.
Crie um programa que realize as 4 operações e imprima os
resultados obtidos. */
package calculadora;
import java.util.Scanner;
public class aula0007l1e2testecalculadora 
{
    public static void main(String[] args) 
    {
        Scanner leia = new Scanner(System.in);
        aula0007l1e2calculadora numero1  = new aula0007l1e2calculadora();
        aula0007l1e2calculadora numero2  = new aula0007l1e2calculadora();
        float valor1,valor2;

        System.out.println("digite um numero ");
        valor1 = leia.nextFloat();

        System.out.println("digite outro numero");
        valor2 = leia.nextFloat();
    
        System.out.println("o valor da divisao é " + aula0007l1e2calculadora.getdiv(valor1,valor2));
        System.out.println("o valor da multi é " + aula0007l1e2calculadora.getmulti(valor1,valor2));
        System.out.println("o valor da soma é " + aula0007l1e2calculadora.getsoma(valor1,valor2));
        System.out.println("o valor da subtraçao é " + aula0007l1e2calculadora.getsub(valor1,valor2));
    }
}