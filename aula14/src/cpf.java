import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class cpf {
    //variaveis globais para serem acessadas em todos os métodos
    static String[] cpf = new String[5];
    static String[] nome = new String[cpf.length];
    static double[] saldo = new double[cpf.length];
    static int posicao = 0;

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
                        case 2:
                            sacar();
                            break;
                        case 3:
                            depositar();
                            break;
                        case 4:
                            consultarSaldo();
                            break;
                        case 5:
                            fecharConta();
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
    private static void abrirConta() {
        if (posicao < cpf.length) {
            cpf[posicao] = showInputDialog("Digite seu CPF:");
            nome[posicao] = showInputDialog("Digite seu nome:");
            posicao++;
        } else {
            showMessageDialog(null,"Sem vagas restantes!");
        }
    }
    private static int pesquisar() {
        int index = -1;
        String aux = showInputDialog("Insira seu CPF:");
        for (int i = 0; i < posicao; i++) {
            if (cpf[i].equals(aux)) {
                index = i;
            }
        }
        if (index == -1) {
            showMessageDialog(null,"CPF não encontrado!");
        }
        return index;
    }
    private static void consultarSaldo() {
        int index = pesquisar();
        if (index != -1) {
            showMessageDialog(null,nome[index] + "\nSaldo R$ " + saldo[index]);
        }
    }
    private static void sacar() {
        int index = pesquisar();
        int saque = 0;
        if (index != -1) {
            saque = parseInt(showInputDialog("Prezado " + nome[index] + ", quanto deseja sacar?"));
            saldo[index] = saldo[index] - saque;
        }
    }
    private static void depositar() {
        int index = pesquisar();
        int deposito = 0;
        if (index != -1) {
            deposito = parseInt(showInputDialog("Prezado " + nome[index] + ", quanto deseja depositar?"));
            saldo[index] = saldo[index] + deposito;
        }
    }
    private static void fecharConta() {
        int index = pesquisar();
        if (index != -1) {
            for (int i = 0; i < posicao - 1; i++) {
                cpf[i] = cpf[i + 1];
                nome[i] = nome[i + 1];
                saldo[i] = saldo[i + 1];
            }
            posicao--;
        }
    }
}
