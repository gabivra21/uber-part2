public class Pessoa {
    protected String nome;
    protected String email;
    protected String senha;
    protected int celular;

    protected float avaliacao;

    public Pessoa(String nome, String email, String senha, int celular, float avaliacao){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.celular = celular;
        this.avaliacao = avaliacao;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return email;
    }

    public int getCelular(){
        return celular;
    }

    public float getAvaliacao(){
        return avaliacao;
    }



}
