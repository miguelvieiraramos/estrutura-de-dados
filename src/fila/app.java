package fila;

import javax.swing.*;

public class app {
    public static void main(String[] args) {
        Fila fila = new Fila();
        fila.adicionarElemento(30);
        JOptionPane.showMessageDialog(null, fila.listar());
        fila.adicionarElemento(4);
        JOptionPane.showMessageDialog(null, fila.listar());
        fila.adicionarElemento(9);
        JOptionPane.showMessageDialog(null, fila.listar());
        fila.removerElemento();
        JOptionPane.showMessageDialog(null, fila.listar());
    }
}
