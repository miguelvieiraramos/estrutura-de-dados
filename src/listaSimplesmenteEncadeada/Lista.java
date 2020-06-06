package listaSimplesmenteEncadeada;

public class Lista {
    private No inicio;

    public void inserirInicio(No novoNo) {
        if (inicio == null) {
            this.inicio = novoNo;
        } else  {
            novoNo.setProximo(this.inicio);
            this.inicio = novoNo;
        }
    }

    public void inserirFim(No novoNo) {
        if (inicio == null) {
            System.out.println("A lista esta vazia");
        } else {
            buscarNoFim().setProximo(novoNo);
        }
    }

    public void inserirPosicaoEspecifica(int posicao, No novoNo) {
        No noPosicaoEspecifica = this.buscarPosicaoEspecifica(posicao);
        No noPosicaoEspecificaProximo = noPosicaoEspecifica.getProximo();
        noPosicaoEspecifica.setProximo(novoNo);
        novoNo.setProximo(noPosicaoEspecificaProximo);
        noPosicaoEspecificaProximo = null;
    }

    public void removerInicio() {
        if (this.inicio == null) {
            System.out.println("Lista vazia");
        } else {
            No noAux = this.inicio;
            this.inicio = this.inicio.getProximo();
            noAux.setProximo(null);
        }
    }

    public void removerFim() {
        if (this.inicio == null) {
            System.out.println("Lista vazia");
        } else {
            if (this.inicio.getProximo() == null) {
                this.inicio = null;
            } else {
                No no = this.buscarPenultimoNo();
                no.setProximo(null);
            }
        }
    }

    public void removerPosicaoEspecifica(int posicao) {
        No noPosicaoEspecifica = buscarPosicaoEspecifica(posicao);
        No noPosicaoEspecificaProximoProximo = noPosicaoEspecifica.getProximo().getProximo();
        noPosicaoEspecifica.setProximo(noPosicaoEspecificaProximoProximo);
        noPosicaoEspecificaProximoProximo = null;
    }

    public No buscarNoFim() {
        No proximoNo = this.inicio;
        while (true) {
            if (proximoNo.getProximo() == null) {
                return proximoNo;
            } else {
                proximoNo = proximoNo.getProximo();
            }
        }
    }

    public No buscarPenultimoNo() {
        No proximoNo = inicio;
        while (proximoNo.getProximo().getProximo() != null) {
            proximoNo = proximoNo.getProximo();
        }
        return proximoNo;
    }

    public No buscarPosicaoEspecifica(int posicao) {
        int quantidade = 0;
        No proximoNo = this.inicio;
        if (posicao == 0) {
            return proximoNo;
        } else {
            while (true) {
                if (quantidade == (posicao - 1)) {
                    return proximoNo;
                } else {
                    proximoNo = proximoNo.getProximo();
                    quantidade++;
                }
            }
        }
    }
}
