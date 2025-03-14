import java.util.Scanner;

public class PrintRepeat {
    public static void main(String[] args) {
        int N, i;
        Scanner masukan = new Scanner(System.in);

        System.out.print("Nilai N > 0 = ");
        N = masukan.nextInt();
        
        if (N > 0) {
            i = 1;
            System.out.println("Print i dengan REPEAT:");
            do {
                System.out.println(i);
                i++;
            } while (i <= N);
        } else {
            System.out.println("Nilai N harus lebih dari 0.");
        }

        masukan.close();
    }
}
