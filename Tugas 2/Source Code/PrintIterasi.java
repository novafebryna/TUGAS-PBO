import java.util.Scanner;

public class PrintIterasi {
    public static void main(String[] args) {
        int N, i;
        Scanner masukan = new Scanner(System.in);

        System.out.print("Nilai N > 0 = ");
        N = masukan.nextInt();

        i = 1;
        System.out.println("Print i dengan ITERATE:");

        while (i <= N) {
            System.out.println(i);
            i++;
        }

        System.out.println("Akhir program");
        masukan.close();
    }
}
