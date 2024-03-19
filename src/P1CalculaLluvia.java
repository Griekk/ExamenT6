import java.io.*;

public class P1CalculaLluvia {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("lluvia.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("salida.txt"));

            int minLluvia = Integer.parseInt(br.readLine());

            String input;
            int total = 0;
            while ((input = br.readLine()) != null) {
                String[] input_split = input.split(" ");
                String mes = input_split[0];
                int suma = 0;
                for (int i = 1; i < input_split.length; i++) {
                    int n = Integer.parseInt(input_split[i]);
                    if (n == -1) break;
                    suma += n;
                }
                if (suma >= minLluvia) {
                    bw.write(mes + " " + suma);
                    bw.newLine();
                    total += suma;
                }
            }

            bw.write("Total " + total);

            br.close();
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
