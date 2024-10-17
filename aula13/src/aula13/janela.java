package aula13;

import javax.swing.*;

public class janela {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Salv");
        String nome = JOptionPane.showInputDialog("Qual seu nome?");
        JOptionPane.showMessageDialog(null,"Seja bem-vindo " + nome);

        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor: "));
        int resultado = x + y;
        JOptionPane.showMessageDialog(null,"O resultado: " + resultado);
    }
}
