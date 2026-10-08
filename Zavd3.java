import java.util.Scanner;

public class Zavd3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("vid: ");
        int from = sc.nextInt();
        System.out.print("do: ");
        int to = sc.nextInt();
        System.out.print("vvedit 0-9:");
        int p = sc.nextInt();

        if (p != 2 && p != 3 && p != 5 && p != 7) {
            System.out.println("ne");
            return;
        }

        for (int i = from; i <= to; i++) {
            if (i % p == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
}