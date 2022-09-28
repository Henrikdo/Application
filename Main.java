import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args){

        HashMap<String, Produto> Produtos;

        Scanner input = new Scanner(System.in);
        System.out.print("\nNome: ");
        String nome = input.nextLine();
        System.out.print("\nFabricante: ");
        String fabricante = input.nextLine();
        System.out.print("\nPreco: ");
        Double preco = input.nextDouble();

        novoProduto(nome,fabricante,preco);

    }
    public static void novoProduto(String Nome,String Fabricante, Double Preco){
        Produto produto = new Produto(Nome,Fabricante,Preco);
        System.out.print(produto.toString());
    }


}
