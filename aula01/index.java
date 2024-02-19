import javax.swing.JFrame;

public class Janela{
    
    public Janela(){
        JFrame minhajanela = new JFrame();
        minhajanela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        minhajanela.setSize(300,300);
        minhajanela.setVisible(true);
    }
    
    public static void main(String[] args) {
        new Janela();
    }
}