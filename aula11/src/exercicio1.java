import java.util.Random;

public class exercicio1 {

    public static void main(String[] args) {
        Random rng = new Random();
        int dp = 0, ds = 0;
        int[][] x = new int[4][4];

        //entrada de dados
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                x[i][j] = rng.nextInt(10);

                if (i == j) {
                    dp += x[i][j];
                }

                if (i + j == x.length - 1) {
                    ds += x[i][j];
                }
            }
        }



        //impressao no formato de tabela
        System.out.println();
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }

//		soma1 = x[0][0] + x[1][1] + x[2][2] + x[3][3];
//		soma2 = x[0][3] + x[1][2] + x[2][1] + x[3][0];

        System.out.println("A soma da diagonal principal é: " + dp);
        System.out.println("A soma da diagonal secundária é: " + ds);

    }

}

