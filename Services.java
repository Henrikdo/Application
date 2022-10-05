import java.util.List;
public class Services {
    Repository repo;
    public Services(){
        Repository repo = new Repository();
        this.repo = repo;
    }
    public String novoProduto(String Nome,String Fabricante, Double Preco){
        Produto produto = new Produto(Nome,Fabricante,Preco);
        repo.Produtos.put(Nome,produto);
        return produto.toString();
    }
    public String novoLote(String Produto,int quantidade, String dataValidade){
        Lotes lote = new Lotes(Produto,quantidade,dataValidade);
        repo.Lotes.put(Produto,lote);
        return lote.toString();
    }

    public String listaLotes(){
        String string = "\n++++++ Lista de Lotes ++++++\n";
        List<String> grupos = List.copyOf(repo.Lotes.keySet());
        for(int i = 0 ; i < grupos.size();i++) {
            int num = i+1;
            int quantidade = repo.Lotes.get(grupos.get(i)).getQuantidade();
            String validade = repo.Lotes.get(grupos.get(i)).getValidade();
            string += (num +". " + grupos.get(i) +" - Quantidade: "+quantidade+" - Validade: "+validade+ "\n");

        }
        return string;
    }
}
