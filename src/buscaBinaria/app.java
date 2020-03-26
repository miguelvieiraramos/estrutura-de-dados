package buscaBinaria;

public class app {
    public static int buscaBinaria(int[] lista, int numero) {
        int inicio = 0;
        int fim = lista.length - 1;
        int meio = 0;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (lista[meio] == numero) {
                return meio;
            } else if (numero > lista[meio]) {
                inicio = meio + 1;
            } else if (numero < lista[meio]) {
                fim = meio - 1;
            }
        }
        long tempoFinal = System.currentTimeMillis();
        return -1;
    }

    public static void main(String[] args) {
        int[] lista = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.println(buscaBinaria(lista, 6));
    }
}
