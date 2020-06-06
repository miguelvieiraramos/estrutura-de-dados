package listaSimplesmenteEncadeada;

public class PrincipalListaSE {
    public static void main(String[] args) {
        Lista lista = new Lista();
        Aluno aluno = new Aluno("Miguel", 1);
        No no = new No();
        no.setDado(aluno);
        lista.inserirInicio(no);


        Aluno aluno1 = new Aluno("Raiana", 2);
        No no1 = new No();
        no1.setDado(aluno1);
        lista.inserirInicio(no1);

        Aluno aluno2 = new Aluno("Luciana", 3);
        No no2 = new No();
        no2.setDado(aluno2);
        lista.inserirFim(no2);

        Aluno aluno3 = new Aluno("Murilo", 4);
        No no3 = new No();
        no3.setDado(aluno3);
        lista.inserirPosicaoEspecifica(1, no3);
        lista.removerPosicaoEspecifica(1);

        lista.removerFim();
        lista.removerInicio();
        System.out.println(lista.buscarPenultimoNo().getDado().getNome());
    }
}
