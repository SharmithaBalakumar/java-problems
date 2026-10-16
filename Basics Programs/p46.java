import java.util.Scanner;
public class p2{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(num >=10 && num <=100){
      System.out.print("Valid");
    }
    else{
      System.out.print("Invalid");
    }
    
  }
}
