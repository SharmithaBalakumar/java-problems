import java.util.Scanner;
public class p1 {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int qty = sc.nextInt();
        int bill = price * qty;
        System.out.print(bill);

    }
}
