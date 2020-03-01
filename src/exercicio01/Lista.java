package exercicio01;

import java.util.Arrays;

public class Lista {
    private int[] vetor = new int[10];
    private int quantidade = 0;

    public String listarVetor() {
        return Arrays.toString(this.vetor);
    }

    public void inserirInicio(int numero) {
        if (quantidade < 10) {
            for (int i = this.vetor.length - 1; i >= 0; i--) {
                try {
                    this.vetor[i] = this.vetor[i - 1];
                    this.vetor[i - 1] = 0;
                } catch (IndexOutOfBoundsException e) {
                    System.out.println(e);
                }
            }
            this.vetor[0] = numero;
            this.quantidade++;
        }
    }
}
