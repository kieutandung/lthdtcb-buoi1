import java.util.Scanner;

public class th5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập cân nặng của bạn (kg): ");
        double weight = input.nextDouble();

        System.out.println("Nhập chiều cao của bạn (m): ");
        double height = input.nextDouble();

        double bmi = weight / (height * height);
        System.out.println("Chỉ số BMI của bạn là: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Gầy");
        } else if (bmi < 25) {
            System.out.println("Bình thường");
        } else if (bmi < 30) {
            System.out.println("Hơi béo");
        } else {
            System.out.println("Béo phì");
        }
    }
}
