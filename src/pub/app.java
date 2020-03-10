package pub;

import javax.swing.*;

public class app {
    public static void main(String[] args) {
        Pub pub = new Pub();
        int flag = 0;
        while (flag == 0) {
            int menu = Integer.parseInt(JOptionPane.showInputDialog("1 - Listar vetor.\n2 - Adicionar cliente.\n3 - Sortear cliente.\n4 - Pagar a conta"));
            if(menu == 1) {
                JOptionPane.showMessageDialog(null, pub.listarNumeros());
            }else if(menu == 2) {
                int numero = Integer.parseInt(JOptionPane.showInputDialog("Qual o numero do cliente?"));
                pub.adicionarCliente(numero);
                JOptionPane.showMessageDialog(null, pub.listarNumeros());
            }else if(menu == 3) {
                int numeroSorteado = pub.sortearNumero();
                JOptionPane.showMessageDialog(null, numeroSorteado);
                pub.removerClientePosicao(numeroSorteado);
                JOptionPane.showMessageDialog(null, pub.listarNumeros());
            }else if(menu == 4) {
                int numero = Integer.parseInt(JOptionPane.showInputDialog("Qual o numero do cliente?"));
                JOptionPane.showMessageDialog(null, pub.pagarConta(numero));
                JOptionPane.showMessageDialog(null, pub.listarNumeros());
            }
        }
    }
}
