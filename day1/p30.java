import java.util.Scanner;

public class p30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int mins = sc.nextInt();
        int hour1 = sc.nextInt();
        int mins1 = sc.nextInt();
        int starthour = (hour * 60) + mins;
        int endhour = (hour1 * 60) + mins1;
        int total = endhour - starthour;
        System.out.print(total);
    }
}