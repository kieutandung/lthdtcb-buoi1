import java.util.Scanner;

public class th3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("giải phương trình tuyến tinh");
        System.out.println("cho a * x + b =c,nhập biến x");
        System.out.println("a:");
        double a = scanner.nextDouble();
        System.out.println("b:");
        double b = scanner.nextDouble();
        System.out.println("c:");
        double c = scanner.nextDouble();
        if (a != 0){
            double dapan = (c - b)/ a;
            System.out.println("Equation pass with x = %f!\\n" +dapan);
        }else {
            if (b == c) {
                System.out.println("The solution is all x!");
                System.out.println("No solution!");
            }
        }
    }
}