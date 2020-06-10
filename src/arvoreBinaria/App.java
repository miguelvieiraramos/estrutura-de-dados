package arvoreBinaria;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        No novoNo = new No();
        novoNo.setValor(53);
        arvore.incluir(novoNo);

        No novoNo1 = new No();
        novoNo1.setValor(60);
        arvore.incluir(novoNo1);

        No novoNo2 = new No();
        novoNo2.setValor(14);
        arvore.incluir(novoNo2);

        No novoNo3 = new No();
        novoNo3.setValor(27);
        arvore.incluir(novoNo3);

        No novoNo4 = new No();
        novoNo4.setValor(73);
        arvore.incluir(novoNo4);

        No novoNo5 = new No();
        novoNo5.setValor(3);
        arvore.incluir(novoNo5);

        No novoNo6 = new No();
        novoNo6.setValor(104);
        arvore.incluir(novoNo6);

        No novoNo7 = new No();
        novoNo7.setValor(37);
        arvore.incluir(novoNo7);

        No novoNo8 = new No();
        novoNo8.setValor(54);
        arvore.incluir(novoNo8);

        No novoNo9 = new No();
        novoNo9.setValor(17);
        arvore.incluir(novoNo9);

        arvore.removerFolha(14);
    }
}
