import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Passageiro passageiro1 = new Passageiro("Edna", "edna.moda@gmail.com", "trovaoazul", 998760909, 4.9f);
        Passageiro passageiro2 = new Passageiro("Eduardo", "edu.ardo@gmail.com", "9876alho", 999876523, 5.0f);


        Motorista motorista1 = new Motorista("Claudia", "Cnh Ear", 4.0f, "claudinha@gmail.com", "solamarelo", "Curitiba", "viagens", 992341569);
        Motorista motorista2 = new Motorista("Kecio", "Cnh Ear", 3.9f, "kecio.silva@hotmail.com", "yolanda78", "Maringá", "viagens e entregas", 976543267);

        Carro carro1 = new Carro("Clio", "Preto", "Renault", 2018, "AUU0902", false, false);
        Carro carro2 = new Carro("Kicks", "Cinza", "Renault", 2014, "BEE2114", false, false);

        Moto moto1 = new Moto("Biz", "vermelho", "Honda", 2014, "PIA45BB", false, false);
        Moto moto2 = new Moto("Harley", "Verde", "Harley-Davidson", 2018, "OOI-9876",false ,false);

        Menu menu = new Menu();

        Pagamento pagamento1 = new Pagamento(true, false, false, false, false, 89, 6);
        Pagamento pagamento2 = new Pagamento();

        /*System.out.println("CONFIRMAÇÃO DADOS PASSAGEIRO 1");
        System.out.println("Seu nome é: " + passageiro1.nome);
        System.out.println("Seu celular é: " + passageiro1.celular);
        System.out.println(" ");
        System.out.println("ALTERAÇÃO DE DADOS PASSAGEIRO 2");
        System.out.println("Seu antigo nome :" + passageiro2.nome);
        passageiro2.setNome("Jocacio");
        System.out.println("Seu novo nome é :" + passageiro2.nome);
        System.out.println(" ");
        System.out.println("VERIFICANDO AVALIAÇÃO DO MOTORISTA 1");
        System.out.println("A avaliação do motorista 1 é " + motorista1.avaliacao + " estrelas");
        System.out.println(" ");
        System.out.println("ALTERAÇÃO DE PREÇO NO PAGAMENTO!!!");
        System.out.println("O antigo valor era: " + pagamento1.getPreco());
        pagamento1.setPreco(57);
        System.out.println("O novo valor está: " + pagamento1.getPreco());

        System.out.println("Características da Moto 1!!!");
        System.out.println("Sua marca é: " + moto1.marca);
        System.out.println("Sua cor é: " + moto1.cor);
        System.out.println("Seu modelo é: " + moto1.modelo);*/

        System.out.println("------MENUUU------");
        System.out.println("1-Imprimir informações do passageiro:");
        System.out.println("2-Imprimir informações do motorista:");
        System.out.println("3-Chamar corrida");
        System.out.println("4-Cancelar corrida");
        System.out.println("0 - SAIR");



        System.out.println("Escolha uma opção:");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        if (numero == 0){
            System.exit(0);
        }

        if (numero == 3){
            if(carro1.ocupado == false) {
                System.out.println("O carro 1 foi escolhido!");
                System.out.println("Vamos verificar se ele esta ocupado!");
                System.out.println(carro1.ocupado);
                System.out.println("Está desocupado!Corrida chamada.");
                carro1.setOcupado(true);
                System.out.println("Vamos verificar seu status agora!");
                System.out.println(carro1.ocupado);
            }else {

                System.out.println("O carro 1 está ocupado!Mas podemos chamar o carro 2!");
                System.out.println("Vamos verificar se ele esta ocupado!");
                System.out.println(carro2.ocupado);
                System.out.println("Está desocupado!Corrida chamada.");
                carro2.setOcupado(true);
                System.out.println("Vamos verificar seu status agora!");
                System.out.println(carro2.ocupado);
            }
        }

        if(numero == 4){
            System.out.println("Vamos cancelar sua corrida!");
            System.out.println("Escolha o carro que você chamou (1 ou 2)");
            Scanner scanner4 = new Scanner(System.in);
            int numero4 = scanner4.nextInt();
            if(numero4 == 1){
                carro1.setOcupado(false);
                System.out.println("Corrida cancelada! O status do carro agora é "+carro1.ocupado);
            }else{
                carro2.setOcupado(false);
                System.out.println("Corrida cancelada! O status do carro agora é "+carro2.ocupado);

            }
        }


        if (numero == 1){
            System.out.println("Escolha o passageiro 1 ou 2: ");
            Scanner scanner1 = new Scanner(System.in);
            int numero2 = scanner1.nextInt();

            if(numero2 == 1){
                menu.imprimirInfoP1();
            }else {
                menu.imprimirInfoP2();
            }

            }

        if (numero == 2 ){
            System.out.println("Escolha o motorista 1 ou 2: ");
            Scanner scanner2 = new Scanner(System.in);
            int numero3 = scanner2.nextInt();

            if (numero3==1){
                menu.imprimirInfoM1();
            }else{
                menu.imprimirInfoM2();
            }
        }







    }
}



        




