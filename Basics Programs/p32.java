import java.util.Scanner;
public class p2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int rem = num1 % num2;
        System.out.print(rem);
    }
}
