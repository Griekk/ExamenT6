import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class P2AlmacenaDatos {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("marcas.dat"));

            while (true) {
                String input = sc.nextLine();

                if (input.equals("0")) break;
                String[] input_split = input.split(" ");

                int dia = Integer.parseInt(input_split[0]);
                if (dia < 1 || dia > 5) {
                    System.out.println("Error: Día no válido.");
                    continue;
                }

                double marca = Double.parseDouble(input_split[1]);

                dos.writeInt(dia);
                dos.writeDouble(marca);
            }

            dos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
