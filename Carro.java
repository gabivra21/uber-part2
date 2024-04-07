public class Carro extends Veiculo{



    public Carro (String modelo, String cor, String marca, int ano, String placa, boolean ligado, boolean ocupado){
       super(modelo, cor, marca, ano, placa, ligado, ocupado);
    }


    public String getModelo(){
        return modelo;
    }

    public String getMarca(){
        return marca;
    }

    public void setCor(String cor){
        this.cor = cor;
    }



    }

