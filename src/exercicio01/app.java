package exercicio01;

import javax.swing.*;

public class app {
    public static void main(String[] args) {
        Lista lista = new Lista();
        int flag = 0;
        while (flag == 0) {
            int menu = Integer.parseInt(JOptionPane.showInputDialog("1 - Listar vetor.\n2 - Adicionar numero ao inicio.\n3 - Adicionar numero ao final.\n4 - Adicionar numero em posicao.\n5 - Remover ultimo elemento.\n6 - Remove Inicio\n7 - Remover posicao.\n8 - Procurar numero"));
            if(menu == 1) {
                JOptionPane.showMessageDialog(null, lista.listarVetor());
            }else if(menu == 2) {
                int numero = Integer.parseInt(JOptionPane.showInputDialog("Qual numero deve ser inserido?"));
                lista.inserirInicio(numero);
                JOptionPane.showMessageDialog(null, lista.listarVetor());
            }else if(menu == 3) {
                int numero = Integer.parseInt(JOptionPane.showInputDialog("Qual numero deve ser inserido?"));
                lista.inserirFinal(numero);
                JOptionPane.showMessageDialog(null, lista.listarVetor());
            }else if(menu == 4) {
                int numero = Integer.parseInt(JOptionPane.showInputDialog("Qual numero deve ser inserido?"));
                int posicao = Integer.parseInt(JOptionPane.showInputDialog("Em qual posicao o numero deve ser inserido?"));
                lista.inserirPosicao(numero, posicao);
                JOptionPane.showMessageDialog(null, lista.listarVetor());
            }else if(menu == 5) {
                lista.removerFinal();
                JOptionPane.showMessageDialog(null, lista.listarVetor());
            }else if(menu == 6) {
                lista.removerInicio();
                JOptionPane.showMessageDialog(null, lista.listarVetor());
            } else if(menu == 7) {
                int posicao = Integer.parseInt(JOptionPane.showInputDialog("Qual posicao deve ser removida?"));
                lista.removerPosicao(posicao);
                JOptionPane.showMessageDialog(null, lista.listarVetor());
            }else if(menu == 8){
                int numero = Integer.parseInt(JOptionPane.showInputDialog("Qual numero deve ser procurado?"));
                JOptionPane.showMessageDialog(null, lista.procurarNumero(numero));
            }else if(menu == 0) {
                flag = 1;
            }
        }
    }
}
