package automovel;
import java.util.Scanner;
public class TestaAutomovel 
{
    Scanner leia = new Scanner(System.in);
    public static void main(String[] args) 
    {
        automovel c1 = new automovel();
        c1.businar();
        c1.cor = "Branco";
        c1.marca = "Peugeot";
        c1.modelo = "3008 GP";
        c1.velocidade = 0;

        

        automovel c2 = new automovel();
        c2.businar();
        c2.cor = "Preto";
        c2.marca = "Vw";
        c2.modelo = "Golf";
        c2.velocidade = 120;

        System.out.println("******************************");
        System.out.println("Marca do carro: " + c1.marca);
        System.out.println("Modelo do carro: " + c1.modelo);
        System.out.println("Cor do carro: " + c1.cor);
        System.out.println("Velocidade: " + c1.velocidade);
        System.out.println("******************************");
        System.out.println("Marca do carro: " + c2.marca);
        System.out.println("Modelo do carro: " + c2.modelo);
        System.out.println("Cor do carro: " + c2.cor);
        System.out.println("Velocidade: " + c2.velocidade);
    }
}

