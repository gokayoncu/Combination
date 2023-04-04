import java.util.Scanner;

public class combinationCalculation {
    public static void main(String[] args) {
        int n, r, a, faca = 1, facr = 1, facn = 1, result;
        Scanner input = new Scanner(System.in);
        System.out.print("First number:");
        n = input.nextInt();
        System.out.print("Second n  umber:");
        r = input.nextInt();
        a = n - r;

        for (int i = 1; i <= n; i++) {
            facn *= i;

        }
        for (int i = 1; i <= r; i++) {
            facr *= i;
        }
        for (int i = 1; i <= a; i++) {
            faca *= i;
        }
        result = facn / (facr * faca);
        System.out.println("Combination:" + result);

    }
}
