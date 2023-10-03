package empresinha;

public class testeempregado 
{
    public static void main(String[] args) 
    {
        

        empregado e1 = new empregado("Pedro","alcantara",1500);
        empregado e2 = new empregado("Diego","gostoso",2000);

        System.out.println("o salario anual de Pedro é " + e1.anual());
        System.out.println("tera um aumento de" + e1.aumento());


        System.out.println("o salario anual de Pedro é " + e2.anual());

    }
}
