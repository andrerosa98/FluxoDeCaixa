import java.util.*;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao;
        int opcaoEntradas;
        int entrada;

        System.out.println("***** FLUXO DE CAIXA *****");
        cabecalho.menu();
        System.out.print("Digite a opção desejada: ");
        opcao = input.nextInt();

        while (opcao != 7){
            switch(opcao){
                case 1: 
                    cabecalho.entradas();
                    opcaoEntradas = input.nextInt();
                    switch(opcaoEntradas){
                        case 1:
                            cabecalho.opcaoEntradas();
                            System.out.print("Selecione a forma de entrada: ");
                            entrada = input.nextInt();
                            while (entrada != 6){
                                switch (entrada){
                                    case 1:
                                        cabecalho.dinheiro();
                                    break;
                                    case 2:
                                        cabecalho.pix();
                                    break;
                                    case 3:
                                        cabecalho.cartaoDebito();
                                    break;
                                    case 4:
                                        cabecalho.cartaoCredito();
                                    break;
                                    case 5:
                                        cabecalho.entradas();
                                    break;
                                }
                            }    
                    }
                break;

            }
        }


     
    }
}
