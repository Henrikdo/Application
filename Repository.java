import java.util.HashMap;

public class Repository {
    public HashMap<String, Produto> Produtos;
    public HashMap<String, Lotes> Lotes;

    public Repository(){
        this.Produtos = new HashMap<>();
        this.Lotes = new HashMap<>();
    }

}
