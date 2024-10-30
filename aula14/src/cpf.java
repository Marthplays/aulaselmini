import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class cpf {
    //variaveis globais para serem acessadas em todos os métodos
    static String[] cpf = new String[5];
    static String[] nome = new String[5];
    static double[] saldo = new double[5];

    public static void main(String[] args) {
        int opcao;
        while(true) {
            try {
                opcao = parseInt(showInputDialog(menu()));
                if (opcao == 6) {
                    break;
                }
                if (opcao < 1 || opcao > 6) {
                    showMessageDialog(null,
                            "Opção inválida, a opção deve ser um número entre 1 e 6.");
                }
                else {
                    switch (opcao) {
                        case 1:
                            abrirConta();
                            break;
                    }
                }
            } catch (NumberFormatException e) {
                showMessageDialog(null,"A opção deve ser um número!");
            }
        }
    }
    private static String menu() {
        StringBuilder builder = new StringBuilder();
        builder.append("Escolha uma operação:\n")
               .append("1 - Abrir conta\n")
               .append("2 - Sacar\n")
               .append("3 - Depositar\n")
               .append("4 - Consultar Saldo\n")
               .append("5 - Fechar Conta\n")
               .append("6 - Finalizar\n");
        return builder.toString();
    }
}
