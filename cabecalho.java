
public class cabecalho{
    public static void Menu(){
        System.out.println("1 - Entradas");
        System.out.println("2 - Saídas");
        System.out.println("3 - Relatórios");
        System.out.println("4 - Sair");
    }

    public static void Entradas(){
        String[] postos = {"Finsocial", "João Bráz", "Matriz", "Climed", "Hospital São Domingos", "Voltar", "Sair"};
        System.out.println("***** SELEÇÃO DE POSTO *****");
        for (int i = 0; i < postos.length; i++){
            System.out.println((i+1) + " - " + postos[i]);
        }
        System.out.print("Digite o posto desejado: ");
    }
    public static void OpcaoEntradas(){
        String[] opcaoEntradas = {"Dinheiro", "Pix", "Cartão de Débito", "Cartão de Crédito", "Voltar", "Sair"};
        for (int i = 0; i < opcaoEntradas.length; i++){
            System.out.println((i+1) + " - " + opcaoEntradas[i]);
        }
        System.out.print("Digite a opção desejada: ");
    }
}