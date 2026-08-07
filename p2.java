//Convert Fahrenheit to Celsius
import java.util.Scanner;
public class p2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int fahrenheit = sc.nextInt();
        float  celsius = (fahrenheit - 32) * 5.0f/9.0f ;
        System.out.print(celsius);
    }
}