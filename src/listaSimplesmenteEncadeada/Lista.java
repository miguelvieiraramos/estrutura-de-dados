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
        buscarNoFim().setProximo(novoNo);
    }

    public void inserirPosicaoEspecifica(int posicao, No novoNo) {
        No noPosicaoEspecifica = this.buscarPosicaoEspecifica(posicao);
        No noPosicaoEspecificaProximo = noPosicaoEspecifica.getProximo();
        noPosicaoEspecifica.setProximo(novoNo);
        novoNo.setProximo(noPosicaoEspecificaProximo);

    }

    public void removerInicio() {
        if (this.inicio == null) {
            System.out.println("Lista vazia");
        } else {
            this.inicio = this.inicio.getProximo();
        }
    }

    public void removerFim() {
        if (this.inicio != null) {
            No no = this.buscarNoFim();
            no.setDado(null);
            no.setProximo(null);
        }
    }

    public void removerPosicaoEspecifica(int posicao) {
        No noPosicaoEspecifica = buscarPosicaoEspecifica(posicao);
        No noPosicaoEspecificaProximoProximo = noPosicaoEspecifica.getProximo().getProximo();
        noPosicaoEspecifica.setProximo(noPosicaoEspecificaProximoProximo);
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
