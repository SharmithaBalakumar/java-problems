import java.util.Scanner;
public class p1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        int area = length * breadth;
        System.out.print(area);
    }
}
