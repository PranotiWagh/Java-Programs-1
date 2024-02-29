import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of m: ");
        int m = input.nextInt();

        System.out.print("Enter the value of n: ");
        int n = input.nextInt();

        input.close();

    

        for (int i = m; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
