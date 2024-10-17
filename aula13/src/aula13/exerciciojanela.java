package aula13;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class exerciciojanela {
    // variáveis globais
    static String[] lista = new String[5];
    public static void main(String[] args) {
        int opcao;
        while(true) {
            opcao = parseInt(showInputDialog(menu()));
            if (opcao == 4) {
                break;
            }
            if (opcao < 1 || opcao > 4) {
                showMessageDialog(null, "Opção inválida");
            }
        }
    }
    public static String menu() {
        String aux = "";
        aux += "1 - Cadastrar\n";
        aux += "2 - Consultar\n";
        aux += "3 - Imprimir\n";
        aux += "4 - Finalizar\n";
        return aux;
    }
}

