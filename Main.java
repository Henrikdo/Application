public class Main {
    public static void main(String[] args) {
        Facade control = new Facade();
        cadastraProduto(control);
        cadastraLote(control);
        listaLotes(control);

    }

    public static void listaLotes(Facade control) {
        System.out.println(control.listaLotes());
    }

    private static void cadastraProduto(Facade controle) {
        System.out.println(controle.novoProduto("Paçoca","Bar do Cuscuz",19.90));
        System.out.println(controle.novoProduto("Beirute","Karintó",15.90));
        System.out.println(controle.novoProduto("Sapinho","Parque do Povo",55.90));

    }
    private static void cadastraLote(Facade controle) {
        System.out.println(controle.novoLote("Paçoca",12,"16/09/2022"));
        System.out.println(controle.novoLote("Beirute",0,"15/08/1979"));
        System.out.println(controle.novoLote("Sapinho",983,"11/11/2011"));
    }
}

