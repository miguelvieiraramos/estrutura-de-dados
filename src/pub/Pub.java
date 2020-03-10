package pub;

import java.util.Arrays;
import java.util.Random;

public class Pub {
    private int[] lista = new int[10];
    private int quantidade = 0;

    public void adicionarCliente(int numero) {
        if(quantidade < 10) {
            this.lista[this.quantidade] = numero;
            this.quantidade++;
        }
    }

    public void removerClienteInicio() {
        this.lista[0] = 0;
        this.organizarLista(0);
        this.quantidade--;
    }

    public void removerClientePosicao(int posicao) {
        this.lista[posicao] = 0;
        this.organizarLista(posicao);
        this.quantidade--;
    }

    public void organizarLista(int inicio) {
        for (int i = inicio; i < this.quantidade; i++) {
            try {
                this.lista[i] = this.lista[i + 1];
                this.lista[i + 1] = 0;
            }catch (IndexOutOfBoundsException e) {
                System.out.println(e);
            }
        }
    }

    public int procurarNumero(int numeroCliente) {
        for (int i = 0; i < this.quantidade; i++) {
            if(this.lista[i] == numeroCliente) {
                return i;
            }
        }
        return -1;
    }

    public String pagarConta(int numeroCliente) {
        int indexNumero = procurarNumero(numeroCliente);
        if(indexNumero == -1) {
            return "Esse numero nao esta na lista";
        } else {
            removerClientePosicao(indexNumero);
            return "A conta do numero" + numeroCliente + " foi paga.";
        }
    }

    public int sortearNumero() {
        Random randomico = new Random();
        return randomico.nextInt(this.quantidade - 1);
    }

    public String listarNumeros() {
        return Arrays.toString(this.lista);
    }
}
