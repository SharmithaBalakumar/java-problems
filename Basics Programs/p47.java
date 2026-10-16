import java.util.Scanner;
public class p2{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    num += 10;
    num -= 5;
    num *= 2;
    num /= 5;
    num %= 3;
    System.out.print(num);
  }
}
