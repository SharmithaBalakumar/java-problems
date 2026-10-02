import java.util.Scanner;

public class p25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int hours = num / 3600;
        int remaining = num % 3600;
        int minutes = remaining / 60;
        int seconds = remaining % 60;
        System.out.println(hours);
        System.out.println(minutes);
        System.out.print(seconds);
    }
}
