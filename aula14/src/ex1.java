import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ex1 {
    public static void main(String[] args) {
        try {
            FileReader file;
            BufferedReader buffer;
            String linha;
            String[] vetor;
            double media;

            file = new FileReader("D:\\aluno.txt");
            buffer = new BufferedReader(file);

            while ((linha = buffer.readLine()) !=null) {
                vetor = linha.split(";");
                media = 0;
                for (int i = 1; i < vetor.length; i++) {
                    media += Double.parseDouble(vetor[i]);
                }
                media = media / (vetor.length - 1);
                System.out.println(vetor[0]);
                System.out.println("Média: " + media);
                if (media >= 6) {
                    System.out.println("Aprovado");
                } else {
                    System.out.println("Reprovado");
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao abrir o arquivo!");
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo!");
        }
    }
}
