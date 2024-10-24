import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ex2 {
    public static void main(String[] args) {
        int equilatero = 0, escaleno = 0, isosceles = 0, naoTriangulo = 0;
        try {
            FileReader file;
            BufferedReader buffer;
            String linha;
            String[] vetor;
            double a,b,c;


            file = new FileReader("D:\\dados.txt");
            buffer = new BufferedReader(file);

            while (((linha = buffer.readLine()) != null)) {
                vetor = linha.split(";");

                a = Double.parseDouble(vetor[0]);
                b = Double.parseDouble(vetor[1]);
                c = Double.parseDouble(vetor[2]);

                if (a < b + c && b < a + c && c < a + b) {
                    if (a == c && b == c) {
                        equilatero++;
                    } else if (a != c && a != c && b != c) {
                        isosceles++;
                    } else {
                        escaleno++;
                    }
                } else {
                    naoTriangulo++;
                }


            }
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao abrir o arquivo!");
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo!");
        }
        System.out.println("Total de equilateros: " + equilatero);
        System.out.println("Total de escaleno: " + escaleno);
        System.out.println("Total de isósceles: " + isosceles);
        System.out.println("Total de não triangulos: " + naoTriangulo);

    }
}
