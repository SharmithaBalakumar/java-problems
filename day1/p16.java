import java.util.Scanner;

public class p16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt();
        int minutes = hours / 60;
        int seconds = hours % 60;
        System.out.println(minutes);
        System.out.println(seconds);
    }
}