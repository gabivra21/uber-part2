public class Passageiro extends Pessoa{


    public Passageiro(String nome, String email, String senha, int celular, float avaliacao){
        super(nome, email, senha,celular, avaliacao);

    }


    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
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

    public void chamarCorrida(){

    }
    public void escolherCategoria(){

    }

    public void denunciarMotorista(){

    }
    public void avaliarMotorista(){

    }
}
