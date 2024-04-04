public class Carro extends Veiculo{



    public Carro (String modelo, int ano, String cor, String placa, String marca){
       super(modelo, cor, marca, ano, placa);
    }

    /*public Carro(){
        this("Kicks",2018,"preto","BEE2114","Nissan");
    }*/

    public String getModelo(){
        return modelo;
    }

    public String getMarca(){
        return marca;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void ligar(){

    }
    public void desligar(){

    }
    public void acelerar(){

    }
    public void frear(){

    }
    public void buzinar(){

    }





}
