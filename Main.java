import java.util.Scanner;
import java.util.*;
public class Main {
    //Token: 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"
    public static void main(String[] args) {
        Controller control = new Controller();
        Scanner sc = new Scanner(System.in);
        String escolha = "";
        while (true) {
            escolha = menu(sc);
            comando(escolha, control, sc);
        }
    }
    private static String menu(Scanner scanner) {
        System.out.println(
                "\n---\nMENU\n" +
                        "(C)adastrar Produto\n" +
                        "(E)xibir Produto\n"+
                        "(Q)uit\n"+
                        "\n" +
                        "Opção> ");
        return scanner.next().toUpperCase();
    }
    private static void comando(String opcao, Controller controle, Scanner scanner) {
        switch (opcao) {
            case "C":
                cadastraProduto(controle,scanner);
                break;
            
            case "Q":
                quit();
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    private static void quit() {
    }

    private static void cadastraProduto(Controller controle, Scanner scanner) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nNome: ");
        String nome = input.nextLine();
        System.out.print("\nFabricante: ");
        String fabricante = input.nextLine();
        System.out.print("\nPreco: ");
        Double preco = input.nextDouble();
        controle.novoProduto(nome,fabricante,preco);
    }
}

