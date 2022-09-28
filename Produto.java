public class Produto {
    private String Nome;
    private String Fabricante;
    private Double Preco;

    public Produto(String nome,String Fabricante,Double Preco){
        this.Nome = nome;
        this.Fabricante = Fabricante;
        this.Preco = Preco;
    }
    @Override
    public String toString() {
        String string = "CADASTRADO: " + Nome +" - "+ Fabricante + " - R$" + Preco;
        return string;
    }
}
