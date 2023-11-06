package senac;
import java.util.ArrayList;
public class professor extends pessoa{
    ArrayList <professor> listap = new ArrayList<>();
    private float salario;

    

    public professor(int id, String nome, String email, float salario) {
        super(id, nome, email);
        this.salario = salario;
    }

    public void dados() {
        super.dados();
        System.out.println("salario: R$" + getSalario());
    }

    public void cadastrar() {
        
    }
    public void editar() {
        
    }
    public void listar() {
        ArrayList listap;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
