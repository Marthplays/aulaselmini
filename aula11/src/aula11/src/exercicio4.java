package aula11.src;

import java.util.Random;

public class exercicio4 {
    public static void main(String[] args) {
        Random rng = new Random();
        int linhas = 3, colunas = 3;
        int[][] vendas = new int[linhas][colunas];
        int[] somaLinhas = new int[linhas];
        int[] somaColunas = new int[colunas];
        String[] tipos = {"roupas", "eletronicos", "alimentos"};
        String[] meses = {"Janeiro", "Fevereiro", "Março"};
        int max = Integer.MIN_VALUE;

        //entrada de dados
        for (int linha = 0; linha < linhas; linha++) {
            for (int coluna = 0; coluna < colunas; coluna++) {
                int valor = rng.nextInt(100);
                // guarda o valor na matriz
                vendas[linha][coluna] = valor;
                // atualiza a soma da linha e coluna
                somaLinhas[linha] += valor;
                somaColunas[coluna] += valor;
            }
        }
        //impressao no formato de tabela
        System.out.println();
        for (int i = 0; i < vendas.length; i++) {
            for (int j = 0; j < vendas[i].length; j++) {
                System.out.print(vendas[i][j] + "\t");
            }
            System.out.println();
        }



        for (int i = 0; i < linhas; i++) {
            System.out.println("Soma das vendas do produto " + tipos[i] + ": " + somaLinhas[i]);
        }
        for (int i = 0; i < colunas; i++) {
            System.out.println("Soma das vendas no mês " +  meses[i] + ": " + somaColunas[i]);
        }
        for (int i = 0; i < colunas; i++) {
            double media = (double) somaColunas[i] / 3;
            System.out.println("Media das vendas no mês " + meses[i] + ": " + media);
        }
        for (int i = 0; i < vendas.length; ++i) {
            for (int j = 0; j < vendas.length; j++) {
                
            }
        }

        System.out.println("O mês com mais vendas foi: " + vendas);

    }
}
