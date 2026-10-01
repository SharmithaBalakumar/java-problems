import java.util.Scanner;

public class p17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int basicsalary = sc.nextInt();
        int hra = sc.nextInt();
        int da = sc.nextInt();
        int grosssalary = basicsalary + hra + da;
        System.out.print(grosssalary);
    }
}