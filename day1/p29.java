import java.util.Scanner;

public class p29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark1 = sc.nextInt();
        int mark2 = sc.nextInt();
        int mark3 = sc.nextInt();
        int mark4 = sc.nextInt();
        int mark5 = sc.nextInt();
        int total = mark1 + mark2 + mark3 + mark4 + mark5;
        float avg = total / 5.0f;
        float percentage = (total / 500.0f) * 100;
        System.out.println(total);
        System.out.println(avg);
        System.out.print(percentage);
    }
}
