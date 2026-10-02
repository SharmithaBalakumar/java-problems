import java.util.Scanner;

public class p28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fnotes = num / 500;
        int remaining = num % 500;
        int tnotes = remaining / 200;
        int remaining1 = remaining % 200;
        int onotes = remaining1 / 100;
        int remaining2 = remaining1 % 100;
        int ffnotes = remaining2 / 50;
        int remaining3 = remaining2 % 50;
        int ttnotes = remaining3 / 10;
        int remaining4 = remaining3 % 10;
        System.out.println(fnotes);
        System.out.println(tnotes);
        System.out.println(onotes);
        System.out.println(ffnotes);
        System.out.println(ttnotes);
    }
}
