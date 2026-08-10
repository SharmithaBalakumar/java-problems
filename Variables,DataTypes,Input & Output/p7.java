//Find compound interest
import java.util.Scanner;
public class p7{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();
        double amt = p*Math.pow((1+r/100),t);
        double ci = amt - p;
        System.out.printf("CI:%.2f \n ",ci);
        System.out.printf("Amount:%.2f \n ", amt);
    }
}
