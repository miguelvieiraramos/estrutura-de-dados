package arvoreBinaria;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        int menu = 0;
        while (menu != 5) {
            menu = Integer.parseInt(JOptionPane.showInputDialog("1 - Adicionar\n2 - Pré Ordem\n3 - Central\n4 - Pos Ordem\n5 - Sair"));
            if (menu == 1) {
                int valor = Integer.parseInt(JOptionPane.showInputDialog("Dígite o valor: "));
                No novoNo = new No();
                novoNo.setValor(valor);
                arvore.incluir(novoNo);
            } else if(menu == 2) {
                arvore.preOrdem();
            } else if(menu == 3) {
                arvore.central();
            } else if(menu == 4) {
                arvore.posOrdem();
            }
        }
    }
}
