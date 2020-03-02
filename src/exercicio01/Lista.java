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
            this.andarUmIndex(0);
            this.vetor[0] = numero;
            this.quantidade++;
        } else {
            System.out.println("Quantidade = 10");
        }
    }

    public void inserirFinal(int numero) {
        if (quantidade < 10) {
            this.vetor[quantidade] = numero;
            this.quantidade++;
        } else {
            System.out.println("Quantidade = 10");
        }
    }

    public void inserirPosicao(int numero, int posicao) {
        if (quantidade < 10) {
            andarUmIndex(posicao + 1);
            this.vetor[posicao] = numero;
            this.quantidade++;
        } else {
            System.out.println("Quantidade = 10");
        }
    }

    private void andarUmIndex(int condicional) {
        for (int i = this.vetor.length - 1; i >= condicional; i--) {
            try {
                int aux = this.vetor[i];
                this.vetor[i] = this.vetor[i - 1];
                this.vetor[i - 1] = aux;
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e);
            }
        }
    }

    private void andarUmIndexTras(int inicio) {
        for (int i = inicio; i < this.vetor.length; i++) {
            try {
                int aux = this.vetor[i];
                this.vetor[i] = this.vetor[i + 1];
                this.vetor[i + 1] = aux;
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e);
            }
        }
    }

    public void removerFinal() {
        this.vetor[this.quantidade - 1] = 0;
        this.quantidade--;
    }

    public void removerInicio() {
        this.vetor[0] = 0;
        this.quantidade--;
        andarUmIndexTras(0);
    }

    public void removerPosicao(int posicao) {
        this.vetor[posicao] = 0;
        this.quantidade--;
        andarUmIndexTras(posicao);
    }

    public String procurarNumero(int numero) {
        String resultado = "";
        for (int i = 0; i < this.vetor.length; i++) {
            if(this.vetor[i] == numero) {
                resultado += "O numero " + numero + " foi encontrado na posicao " + i + ".\n";
            }
        }
        return resultado;
    }
}
