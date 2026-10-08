import java.util.Scanner;

public class Zavd1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();
        System.out.print(":");
        String op = sc.next();

        switch (op) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                if (b == 0) {
                    System.out.println("na null dilutu ne mozhna");
                } else {
                    System.out.println(a / b);
                }
                break;
            default:
                System.out.println("wrong op");
        }
    }
}