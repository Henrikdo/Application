

public class Facade {
    Services services;
    public Facade(){
        Services serv = new Services();
        this.services = serv;
    }
    public String novoProduto(String Nome,String Fabricante, Double Preco){
       return services.novoProduto(Nome,Fabricante,Preco);
    }
    public String novoLote(String Produto,int quantidade, String dataValidade){
        return services.novoLote(Produto,quantidade,dataValidade);
    }

    public String listaLotes(){
        return services.listaLotes();
    }
}
