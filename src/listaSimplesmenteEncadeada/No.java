package listaSimplesmenteEncadeada;

public class No {
    private Aluno dado;
    private No proximo;

    public Aluno getDado() {
        return dado;
    }

    public void setDado(Aluno dado) {
        this.dado = dado;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
