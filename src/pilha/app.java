package pilha;

import javax.swing.*;

public class app {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        pilha.adicionarElemento(10);
        JOptionPane.showMessageDialog(null, pilha.listar());
        pilha.adicionarElemento(9);
        JOptionPane.showMessageDialog(null, pilha.listar());
        pilha.adicionarElemento(89);
        JOptionPane.showMessageDialog(null, pilha.listar());
        pilha.removerElemento();
        JOptionPane.showMessageDialog(null, pilha.listar());
        JOptionPane.showMessageDialog(null, "O primeiro numero do topo da pilha eh: " + pilha.consultarElemento());
        JOptionPane.showMessageDialog(null, "A quantidade de elementos na pilha eh: " + pilha.consultarQuantidade());
    }
}
