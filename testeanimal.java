package zoo;
import java.util.Scanner;
public class testeanimal 
{
    public static void main(String[] args) 
    {
        Scanner leia = new Scanner(System.in);

        mamifero m1 = new mamifero("camelo",150,4,"Amarelo","Terra",2.0,"leite");
        m1.dados();

        peixe p1 = new peixe("Tubarão", 300, 00,"Cinzento", "Mar", 1.5, "Barbatana e cauda");
        p1.dados();

        mamifero m2 =new mamifero("Urso-do-Canadá", 180, 4, "Vermelho", "Terra", 0.5, "Mel");
        m2.dados();

    }
}
