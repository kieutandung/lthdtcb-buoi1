import java.util.Scanner;

public class th6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào tháng (1-12): ");
        int thang = scanner.nextInt();
        int soNgay;

        switch (thang) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                soNgay = 31;
                System.out.println("Tháng " + thang + " có " + soNgay + " ngày");
                break;
            case 4: case 6: case 9: case 11:
                soNgay = 30;
                System.out.println("Tháng " + thang + " có " + soNgay + " ngày");
                break;
            case 2:
                soNgay = 28;
                System.out.println("Tháng 2 có " + soNgay + " hoặc 29 ngày");
                break;
            default:
                System.out.println("Tháng không hợp lệ");
        }
    }
}
