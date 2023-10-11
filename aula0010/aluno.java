package aula0010;

public class aluno extends pessoa
{
    private int matricula;
    private double nota1,nota2,nota3;
    private static int automat=20230001;







    /*CONSTRUCTOR */

    public aluno(String nome,String endereco,int idade,double nota1,double nota2,double nota3)
    {
        super(nome, endereco, idade);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.matricula = ++automat;
        System.out.println("tipo aluno");
    }

    public void dados() 
    {
        super.dados();
        System.out.println("matricula: " + matricula);
        System.out.println("nota1: " + nota1);
        System.out.println("nota2: " + nota2);
        System.out.println("nota3: " + nota3);
        System.out.println("media: " + calculomedia());
        media();
    }


    /*METODO PADRAO*/

    private double calculomedia() 
    {
        return (getnota1() + getnota2() + getnota3())/3;
    }

    private void media()
    {
        if(calculomedia()>=7)
        {
            System.out.println("o aluno passou na media");
        }
        else
        {
            System.out.println("o aluno nao alcançou a media");
        }

    }
    /*METODO SET */

    /*nao precisa de set matricula pois o atributo atricula nao deve sert mexido por ningue*/
    public void setnota1(float nota1) 
    {
        this.nota1 = nota1;
    }
    public void setnota2(float nota2) 
    {
        this.nota2 = nota2;
    }
    public void setnota3(float nota3) 
    {
        this.nota3 = nota3;
    }

    /*METODO GET */
    public int getmatricula() 
    {
        return matricula;
    }
    public double getnota1() 
    {
        return nota1;
    }
    public double getnota2() 
    {
        return nota2;
    }
    public double getnota3() 
    {
        return nota3;
    }
}
