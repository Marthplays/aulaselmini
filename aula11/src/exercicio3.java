import java.text.DecimalFormat;
import java.util.Random;

public class exercicio3 {
    public static void main(String[] args) {
            Random rng = new Random();
            DecimalFormat mascara = new DecimalFormat("#,##00.00");
            double[][] x = new double[4][6];
            double[] mediaAnual = new double[4];
            double media;

            //entrada de dados
            for (int i = 0; i < x.length; i++) {
                media = 0;
                for (int j = 0; j < x.length; j++) {
                    x[i][j] = rng.nextDouble(5,36);
                    System.out.print(mascara.format(x[i][j]) + " \t");
                    media += x[i][j];
                }
                mediaAnual[i] = media / x[i].length;
                System.out.println();
            }
            //impressão da temperatura média anual
            System.out.println();
            for (double t : mediaAnual) System.out.println(mascara.format(t));

    }
}