import java.util.Random;

public class ex6 {
    public static void main(String[] args) {
        Random rng = new Random();
        int linhas = 12, colunas = 4;
        int[][] x = new int[linhas][colunas];
        int[] somaLinhas = new int[linhas];
        int[] somaColunas = new int[colunas];
        String[] anos = {"2024", "2023", "2023", "2022"};
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho",
                "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        for (int linha = 0; linha < linhas; linha++) {
            for (int coluna = 0; coluna < colunas; coluna++) {
                int valor = rng.nextInt(2);
                x[linha][coluna] = valor;
                somaLinhas[linha] += valor;
                somaColunas[coluna] += valor;
            }
        }

        System.out.println();
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < colunas; i++) {
            System.out.println("Soma das vendas no ano " +  anos[i] + ": " + somaColunas[i]);
        }
        for (int i = 0; i < linhas; i++) {
            System.out.println("Soma das vendas do produto no mês " + meses[i] + ": " + somaLinhas[i]);
        }


    }
}
