import java.util.Scanner;

public class p20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int n = sc.nextInt();
        int r = sc.nextInt();
        int sp = (p * n * r) / 100;
        System.out.print(sp);
    }
}
