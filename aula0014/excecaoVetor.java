package aula0014;

import java.lang.reflect.Array;

public class excecaoVetor 
{
    public static void main(String[] args) {
        
        try{
        int[] vetor = new int[4];
        System.out.println("antes da  exception");
        vetor[4] = 1;
        System.out.println("esse texto nao sera impresso");
        }
        catch(ArrayIndexOutOfBoundsException e1){
            System.out.println("erro: pisiçao do vetor nao existe");
            //esse catch so vai funcionar para o erro do vetor expecificamente
            //para outros erros possiveis tem que criar um novo catch
        }
    }
}
