package fila;

import java.util.Arrays;

public class Fila {
    private int[] lista = new int[10];
    private int quantidade = 0;

    public void adicionarElemento(int numero) {
        if (quantidade < 10) {
            this.lista[this.quantidade] = numero;
            this.quantidade++;
        }
    }

    public void removerElemento() {
        if(quantidade > 0) {
            this.lista[0] = 0;
            this.quantidade--;
            this.andarUmIndexTras();
        }
    }

    public int consultarElemento() {
        return this.lista[0];
    }

    public int consultarQuantidade() {
        return this.quantidade;
    }

    private void andarUmIndex() {
        for (int i = this.lista.length - 1; i >= 0; i--) {
            try {
                int aux = this.lista[i];
                this.lista[i] = this.lista[i - 1];
                this.lista[i - 1] = aux;
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e);
            }
        }
    }

    private void andarUmIndexTras() {
        for (int i = 0; i < this.lista.length; i++) {
            try {
                int aux = this.lista[i];
                this.lista[i] = this.lista[i + 1];
                this.lista[i + 1] = aux;
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e);
            }
        }
    }

    public String listar() {
        return Arrays.toString(this.lista);
    }
}
