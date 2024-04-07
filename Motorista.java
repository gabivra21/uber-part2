public class Motorista extends Pessoa {


    private String tipoCnh;

    private String cidade;
    private String tipoCorrida;

    public Motorista(String nome, String tipoCnh, float avaliacao,String email, String senha, String cidade, String tipoCorrida, int celular){
        super(nome, email, senha,celular, avaliacao);
        this.tipoCnh = tipoCnh;
        this.cidade = cidade;
        this.tipoCorrida = tipoCorrida;
       }






    public String getTipoCorrida(){
        return tipoCorrida;
    }


    public void aceitarCorrida(){

    }
    public void recusarCorrida(){

    }
    public void denunciarPassageiro(){

    }
    public void avaliarPassageiro(){

    }

}
