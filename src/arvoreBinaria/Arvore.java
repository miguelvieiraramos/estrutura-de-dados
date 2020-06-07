package arvoreBinaria;

public class Arvore {
    private No raiz;

    public void incluir(No novoNo) {
        this.incluir(raiz, novoNo);
    }

    private No incluir(No noAtual, No novoNo) {
        if (noAtual == null) {
            noAtual = novoNo;

            if(this.raiz == null) {
                this.raiz = noAtual;
            }
        } else if (novoNo.getValor() < noAtual.getValor()) {
            noAtual.setEsquerda(incluir(noAtual.getEsquerda(), novoNo));
        } else if (novoNo.getValor() > noAtual.getValor()) {
            noAtual.setDireita(incluir(noAtual.getDireita(), novoNo));
        } else {
            System.out.println("O valor já foi cadastrado!");
        }
        return noAtual;
    }

    public void preOrdem() {
        this.preOrdem(raiz);
    }

    private void preOrdem(No noAtual) {
        if (noAtual == null) {
            return;
        }
        System.out.println(noAtual.getValor());
        preOrdem(noAtual.getEsquerda());
        preOrdem(noAtual.getDireita());
    }

    public void central() {
        this.central(raiz);
    }

    private void central(No noAtual) {
        if (noAtual == null) {
            return;
        }
        central(noAtual.getEsquerda());
        System.out.println(noAtual.getValor());
        central(noAtual.getDireita());
    }


    public void posOrdem() {
        this.posOrdem(raiz);
    }

    private void posOrdem(No noAtual) {
        if (noAtual == null) {
            return;
        }
        posOrdem(noAtual.getEsquerda());
        posOrdem(noAtual.getDireita());
        System.out.println(noAtual.getValor());
    }
}
