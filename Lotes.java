import javax.xml.crypto.Data;

public class Lotes {
    private String Produto;
    private int Quantidade ;
    private String DataValidade;

    public Lotes(String Produto,int Quantidade,String DataValidade){
        this.Produto = Produto;
        this.Quantidade = Quantidade;
        this.DataValidade = DataValidade;

    }
    @Override
    public String toString() {
        String string = "CADASTRADO: " + Produto +" - Quantidade: "+Quantidade+ "- Validade: "+DataValidade;
        return string;
    }
}
