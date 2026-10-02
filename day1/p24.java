import java.util.Scanner;

public class p24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int year = num / 365;
        int days = num % 365;
        System.out.println(year);
        System.out.print(days);
    }
}
