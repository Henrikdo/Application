public class Lotes {
    private String ID;
    private String Fabricante;

    public Lotes(String nome,String Fabricante,Double Preco){
        this.ID = nome;
        this.Fabricante = Fabricante;

    }
    @Override
    public String toString() {
        String string = "CADASTRADO: " + ID +" - "+ Fabricante;
        return string;
    }
}
