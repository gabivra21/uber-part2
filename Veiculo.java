public class Veiculo {
    protected String modelo;
    protected String cor;
    protected String marca;
    protected int ano;
    protected String placa;

    protected boolean ligado;
    protected boolean ocupado;

    public Veiculo(String modelo, String cor, String marca, int ano, String placa, boolean ligado, boolean ocupado) {
        this.modelo = modelo;
        this.cor = cor;
        this.marca = marca;
        this.ano = ano;
        this.placa = placa;
        this.ligado = false;
        this.ocupado = false;

    }

    public void ligar() {
        setLigado(true);
    }

    public void desligar() {
        setLigado(false);
    }

    public void acelerar() {
        System.out.println("VRUMM!!!ESTOY ACELERANDO!");
    }

    public void frear() {
        System.out.println("ESTOY FREANDO!");
    }

    public void buzinar() {
        System.out.println("BEEP BEEP BEEP");
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public boolean isLigado() {
        return ligado;
    }

    public boolean isOcupado() {
        return ocupado ;
    }


}

