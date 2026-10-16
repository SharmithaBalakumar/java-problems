import java.util.Scanner;
public class p2{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int sum = num += 5;
    System.out.println(sum);
    int sub = num -= 3;
    System.out.println(sub);
    int mul = num *= 2;
    System.out.println(mul);
    int div = num /= 4;
    System.out.println(div);
  }
}
