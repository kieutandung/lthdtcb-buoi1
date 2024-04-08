import java.util.Scanner;

public class th1buoi2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên dương: ");
        int number = input.nextInt();
        boolean isPrime = true;
        int i = 2;
        while (i <= Math.sqrt(number)) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }
        if (number < 2) {
            isPrime = false;
        }
        if (isPrime) {
            System.out.println(number + " là số nguyên tố.");
        } else {
            System.out.println(number + " không phải là số nguyên tố.");
        }
    }
}
