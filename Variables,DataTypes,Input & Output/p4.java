//Find ASCII value of a character
import java.util.Scanner;
public class p4{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        char word = sc.next().charAt(0);
        int value = (int)word;
        System.out.print(value);
        
    }
}
