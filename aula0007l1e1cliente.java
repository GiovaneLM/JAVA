package contacliente;

public class cliente
{
    public String nome;
    public String endereco;
    public float renda;

    public cliente(String nome,String endereco,float renda)
    {
        this.nome = nome;
        this.endereco = endereco;
        this.renda = renda;
        System.out.println("cliente criado com sucesso");
    }

    public cliente(String nome,String endereco)
    {
        this.nome = nome;
        this.endereco = endereco;
        System.out.println("cliente criado com sucesso");
    }

    public cliente(String nome)
    {
        this.nome = nome;
        System.out.println("cliente criado com sucesso");
    }

    public cliente()
    {
        System.out.println("cliente criado com sucesso");
    }


    public String getNome() 
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public String getEndereco()
    {
        return endereco;
    }
    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }
        public float getRenda()
    {
        return renda;
    }
    public void setRenda(float renda)
    {
        this.renda = renda;
    }
}
