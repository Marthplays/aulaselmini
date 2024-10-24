import javax.imageio.IIOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class geracaoarquivo {
    public static void main(String[] args) throws IOException {
        String[] nome = {"Ofélia", "Sophie", "Jolie", "Gilberto"};
        FileWriter file;
        BufferedWriter buffer;

        file = new FileWriter("convidados.txt");
        buffer = new BufferedWriter(file);
        for (String auxiliar : nome) {
            buffer.write(auxiliar);
            buffer.newLine();
        }
        buffer.close();
    }
}
