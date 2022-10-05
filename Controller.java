
import java.util.*;

public class Controller {
    private HashMap<String, Produto> Produtos;
    private HashMap<String, Lotes> Lotes;

    public Controller(){
        this.Produtos = new HashMap<>();
        this.Lotes = new HashMap<>();
    }
    public String novoProduto(String Nome,String Fabricante, Double Preco){
        Produto produto = new Produto(Nome,Fabricante,Preco);
        this.Produtos.put(Nome,produto);
        return produto.toString();
    }
    public String novoLote(String Produto,int quantidade, String dataValidade){
        Lotes lote = new Lotes(Produto,quantidade,dataValidade);
        this.Lotes.put(Produto,lote);
        return lote.toString();
    }

    public String listaLotes(){
        String string = "";
        List<String> grupos = List.copyOf(this.Lotes.keySet());
        for(int i = 0 ; i < grupos.size();i++) {
            int num = i+1;
            string += (num +". " + grupos.get(i) + "\n");

        }
        return string;
    }
}
