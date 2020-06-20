package hash;

public class ListaEncadeada {
    private No inicio;
    private int qnt;
    private No fim;

    public void inserir(No novoNo) {
        if (inicio == null) {
            inicio = novoNo;
        } else {
            fim.setProximo(novoNo);
        }
        fim = novoNo;
        qnt++;
    }

    public void remover(int valor) {
        if (inicio == null) {
            System.out.println("A lista está vazia");
        } else {
            if (inicio.getValor() == valor) {
                if(qnt == 1) {
                    fim = null;
                }
                No noAux = inicio;
                inicio = noAux.getProximo();
                noAux = null;
                qnt--;
            } else {
                No noAnterior = localizar(valor);
                if (noAnterior == null) {
                    System.out.println("Esse valor não existe.");
                } else {
                    No noAux = noAnterior.getProximo();
                    noAnterior.setProximo(noAux.getProximo());
                    noAux = null;
                    if (fim.getValor() == valor) {
                        fim = noAnterior;
                    }
                    qnt--;
                }
            }
        }
    }

    private No localizar(int valor) {
        No noAtual = inicio;
        while(noAtual.getProximo() != null) {
            if (noAtual.getProximo().getValor() == valor) {
                return noAtual;
            }
            noAtual = noAtual.getProximo();
        }
        return null;
    }
}
