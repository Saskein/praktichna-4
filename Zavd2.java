import java.util.Scanner;

public class Zavd2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("text: ");
        String t = sc.nextLine() + " "; // пробіл щоб рядок не був порожнім

        // while
        int i = 0;
        int count1 = 0;
        while (i < t.length()) {
            char c = t.charAt(i);
            if (c == '.' || c == '!' || c == '?') {
                count1++;
            }
            i++;
        }
        System.out.println("with while: " + count1);

        // do-while
        int j = 0;
        int count2 = 0;
        do {
            char c = t.charAt(j);
            if (c == '.' || c == '!' || c == '?') {
                count2++;
            }
            j++;
        } while (j < t.length());
        System.out.println("with do-while: " + count2);
    }
}