public class Pagamento {
    private boolean metodoSaldo;
    private boolean metodoCartao;
    private boolean metodoDinheiro;
    private boolean metodoBoleto;
    private boolean metodoPix;
    private float preco;
    private float gorjeta;

    public Pagamento(boolean metodoSaldo, boolean metodoCartao, boolean metodoDinheiro, boolean metodoBoleto, boolean metodoPix,float preco, float gorjeta ){
        this.metodoSaldo = metodoSaldo;
        this.metodoCartao = metodoCartao;
        this.metodoDinheiro = metodoDinheiro;
        this.metodoBoleto = metodoBoleto;
        this.metodoPix = metodoPix;
        this.preco = preco;
        this.gorjeta = gorjeta;

    }

    public Pagamento(){
        this(false,true,false,false,false,22f,23f);

    }

    public float getPreco(){
        return preco;
    }

    public boolean getMetodoPix(){
        return metodoPix;
    }
    public float getGorjeta(){
        return gorjeta;
    }

    public void setPreco(int preco){
        this.preco = preco;
    }

    public void selecionarMetodo() {
        if (!metodoPix && !metodoBoleto && !metodoDinheiro && !metodoCartao) {
            metodoSaldo = true;
            System.out.println("Método de pagamento escolhido foi o Saldo!");
        }
        else if (!metodoBoleto && !metodoSaldo && !metodoCartao && !metodoDinheiro) {
            metodoPix = true;
            System.out.println("Método de pagamento escolhido foi Pix! ");
        }
        else if (!metodoPix && !metodoBoleto && !metodoSaldo && !metodoCartao) {
            metodoDinheiro = true;
            System.out.println("Método de pagamento escolhido foi Dinheiro!");

        }
        else if (!metodoDinheiro && !metodoPix && !metodoBoleto && !metodoSaldo){
            metodoCartao = true;
            System.out.println("Método de pagamento escolhido foi Cartão!");
        }
        else {
            System.out.println("Método de pagamento escolhido foi Boleto!");
        }
    }

    }



