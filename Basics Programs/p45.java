import java.util.Scanner;
public class p2{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(num ==5 || num == 10){
      System.out.print("Valid");
    }
    else{
      System.out.print("Invalid");
    }
    
  }
}
