import java.util.Scanner;

public class If1 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int a;

        System.out.println("Contoh IF satu kasus");
        System.out.print("Ketikkan suatu nilai integer: ");
        a = masukan.nextInt();

        if (a >= 0) {
            System.out.println("\nNilai a positif: " + a);
        }

        masukan.close();
    }
}
