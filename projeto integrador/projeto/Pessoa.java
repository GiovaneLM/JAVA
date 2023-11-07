/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto;

/**
 *
 * @author fltreib
 */
public class Pessoa {
    private int id;
    private String nome;
    private String Telefone;
    
    public Pessoa(String nome, String Telefone){
        this.nome = nome;
        this.Telefone = Telefone;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }
    
    public void dados(){
        System.out.println("Nome: " + getNome());
        System.out.println("telefone: " + getTelefone());
    }
}