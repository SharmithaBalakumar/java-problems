import java.util.Scanner;

public class p26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int qty = sc.nextInt();
        int dis = sc.nextInt();
        int total = price * qty;
        int disamt = (total * dis) / 100;
        int finalamt = total - disamt;
        System.out.println(total);
        System.out.println(disamt);
        System.out.print(finalamt);
    }
}
