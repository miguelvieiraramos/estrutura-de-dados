package hash;

public class App {
    public static void main(String[] args) {
        TabelaHash tabela = new TabelaHash();
        tabela.inserir(432);
        tabela.inserir(532);
        tabela.inserir(632);
        tabela.inserir(732);
        tabela.inserir(832);
        tabela.remover(832);
    }
}
