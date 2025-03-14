import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BacaString {
    public static void main(String[] args) {
        String str;
        BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("\nBaca string dan Integer:\n");
            System.out.print("Masukkan sebuah string: ");
            str = datAIn.readLine();
            System.out.println("String yang dibaca: " + str);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca input!");
        }
    }
}
