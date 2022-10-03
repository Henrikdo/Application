import java.util.HashMap;
import java.util.Scanner;

public class Controller {
    HashMap<String, Produto> Produtos;

    public Controller(){
        this.Produtos = new HashMap<>();
    }
    public static void novoProduto(String Nome,String Fabricante, Double Preco){
        Produto produto = new Produto(Nome,Fabricante,Preco);
        System.out.print(produto.toString());
    }
}
