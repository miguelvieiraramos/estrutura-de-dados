package hash;

public class TabelaHash {
    private int TAMANHO = 25;
    private ListaEncadeada[] tabela = new ListaEncadeada[TAMANHO];

    public void inserir(int valor) {
        int indice = funcaoHash(valor);
        if(tabela[indice] == null) {
            tabela[indice] = new ListaEncadeada();
        }
        No novoNo = new No(valor);
        tabela[indice].inserir(novoNo);
    }

    public void remover(int valor) {
        int indice = funcaoHash(valor);
        if(tabela[indice] == null) {
            System.out.println("Esse número não existe.");
        } else {
            tabela[indice].remover(valor);
        }
    }

    private int funcaoHash(int valor) {
        return valor % TAMANHO;
    }
}
