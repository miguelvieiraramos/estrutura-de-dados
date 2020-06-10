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

    public void removerFolha(int valor) {
        this.removerFolha(raiz, valor);
    }

    private No removerFolha(No noAtual, int valor) {
        if (noAtual == null) {
            return null;
        }

        if (valor == noAtual.getValor()) {
            if(noAtual.getEsquerda() == null && noAtual.getDireita() == null) {
                return null;
            }

            if (noAtual.getEsquerda() == null) {
                return noAtual.getDireita();
            }

            if (noAtual.getDireita() == null) {
                return noAtual.getEsquerda();
            }

            No noAux = noAtual.getDireita();

            while(noAux.getEsquerda() != null) {
                noAux = noAux.getEsquerda();
            }

            noAtual.setValor(noAux.getValor());
            noAtual.setDireita(removerFolha(noAtual.getDireita(), noAux.getValor()));

        } else if (valor < noAtual.getValor()) {
            noAtual.setEsquerda(removerFolha(noAtual.getEsquerda(), valor));
            return noAtual;
        } else {
            noAtual.setDireita(removerFolha(noAtual.getDireita(), valor));
            return noAtual;
        }
        return noAtual;
    }
}
