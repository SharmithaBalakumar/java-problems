import java.util.Scanner;

public class p27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float weight = sc.nextFloat();
        float height = sc.nextFloat();
        float BMI = weight / (height * height);
        System.out.print(BMI);
    }
}
