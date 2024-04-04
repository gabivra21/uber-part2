import javax.sound.midi.Soundbank;

public class Menu {
    protected Passageiro passageiro1;
    protected Passageiro passageiro2;

    protected Motorista motorista1;
    protected Motorista motorista2;

    public void imprimirInfoP1(){
        System.out.println("Nome do passageiro:" + passageiro1.getNome());
        System.out.println("Email do passageiro:"+passageiro1.getEmail());
        System.out.println("Celular do passageiro:"+passageiro1.getCelular());
        System.out.println("Avaliação do passageiro:"+passageiro1.getAvaliacao());
    }

    public void imprimirInfoP2(){
        System.out.println("Nome do passageiro:" + passageiro2.getNome());
        System.out.println("Email do passageiro:"+passageiro2.getEmail());
        System.out.println("Celular do passageiro:"+passageiro2.getCelular());
        System.out.println("Avaliação do passageiro:"+passageiro2.getAvaliacao());
    }

    public void imprimirInfoM1(){
        System.out.println("Nome do motorista: "+ motorista1.getNome());
        System.out.println("Avaliação do motorista: "+ motorista1.getAvaliacao());
        System.out.println("Email do motorista "+ motorista1.getEmail());
        System.out.println("Celular do motorista "+motorista1.getCelular());

    }

    public void imprimirInfoM2(){
        System.out.println("Nome do motorista: "+ motorista2.getNome());
        System.out.println("Avaliação do motorista: "+ motorista2.getAvaliacao());
        System.out.println("Email do motorista "+ motorista2.getEmail());
        System.out.println("Celular do motorista "+motorista2.getCelular());

    }

    public Passageiro getPassageiro1() {
        return passageiro1;
    }

}
